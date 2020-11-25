package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class keyPressPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public keyPressPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p")+ "=3.14"); //chord method allows to sync multiple keys at the one time
    }

    public String gerResult(){
        return driver.findElement(resultText).getText();
    }
}
