package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FIleUploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FIleUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

//    public String getUploadedFiles(){
//        return driver.findElement(uploadedFiles).getText();
//    }
}

