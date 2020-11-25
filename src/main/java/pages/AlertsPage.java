package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By result = By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();  //alert().dismiss()   - cancels the alert instead of clicking
    }

    public String getResults(){
        return driver.findElement(result).getText();
    }
}
