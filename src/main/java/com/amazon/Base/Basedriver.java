package com.amazon.Base;

import java.util.Set;

import org.openqa.selenium.WebDriver;


public class Basedriver {
    
    protected WebDriver driver;

    public Basedriver (WebDriver driver){
        this.driver = driver;
    }
    //open url method
    public void gotoURL(String url) {
        driver.get(url);
    }

    public void windowhandles(WebDriver driver)
    {
        Set<String> windowHandles = driver.getWindowHandles();
        String[] handles = windowHandles.toArray(new String[0]);
        String newWindowHandle = handles[1];
        driver.switchTo().window(newWindowHandle);
    }
    
}
