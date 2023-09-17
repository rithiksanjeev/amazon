package com.amazon.Locators;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.Base.Basedriver;

public class homeloc extends Basedriver{


    WebDriver driver;

    public homeloc(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public WebElement itemsearch()
    {
        return driver.findElement(By.id("twotabsearchtextbox"));
    }

    public WebElement chooseBrand(String Brand)
    {
        return driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[text()="+Brand+"]"));
    }

    public WebElement priceranlow()
    {
        return driver.findElement(By.id("low-price"));
    }

    public WebElement priceranhigh()
    {
        return driver.findElement(By.id("high-price"));
    }

    public WebElement Submitpricerange()
    {
        return driver.findElement((By.id("a-autoid-1-announce")));
    }

    public List<WebElement> allpricesofitems()
    {
        return driver.findElements(By.xpath("//span[@class='a-price-whole'])"));
    }

    public WebElement SortBy()
    {
        return driver.findElement(By.id("s-result-sort-select"));
    }

    public WebElement selectfirstitem()
    {
        return driver.findElement(By.xpath("//img[@data-image-index='1']"));
    }

    public WebElement Addtocart()
    {
        return driver.findElement(By.id("add-to-cart-button"));
    }

    public WebElement Addedtocart()
    {
        return driver.findElement(By.id("a-alert-heading"));
    }
    
    
}
