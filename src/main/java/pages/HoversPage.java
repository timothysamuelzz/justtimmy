package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By hoverImage = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/img[1]");
    private By boxCaption = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]");


    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public FigureCaption hoverOverFigure(){
        WebElement figure = driver.findElement(hoverImage);
        Actions actions = new Actions(driver); //action class uses the builder pattern
        actions.moveToElement(figure).perform();  //perform

        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption{         //this is a separate inner class

        private WebElement caption;
        private By header = By.xpath("//h5[contains(text(),'name: user1')]");
        private By link = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]");
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
