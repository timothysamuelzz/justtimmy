package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LargeAndDeepDomPage {

    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollTable(){
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";      //you cant use table web element inside javascript therefore we are using the arguments[0] because there is only one argument index is 0
        //scroll into view is a function call
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
        //replace tableElement with the script which is arguments[0]

    }
}
