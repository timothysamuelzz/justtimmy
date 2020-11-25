package utils;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }
//
//    public void switchToTab(String tabTitle){
//        List<String> windows  = driver.getWindowHandle();
//
//        System.out.println("Number of tabs " + windows.size());
//    }
}
