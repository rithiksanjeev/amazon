package com.amazon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amazon.Locators.homeloc;

public class homepage extends homeloc {

    public WebDriver driver;

    public homepage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void openHomepage()
    {
        driver.get("https://www.amazon.in/");
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public void searchItem(String itemname)
    {
        itemsearch().sendKeys(itemname);
        itemsearch().submit();
    }

    public void filterBrand(String brandname)
    {
        chooseBrand(brandname).click();
    }

    public void filterPrice(String low,String high)
    {
        priceranlow().sendKeys(low);
        priceranhigh().sendKeys(high);
        Submitpricerange().click();
    }

    public void sortby(String range)
    {
         Select sort = new Select(SortBy()); // select class for dropdown
         sort.selectByValue(range);
    }

    public void addtocart()
    {
        Addtocart().click();
    }

    public boolean isaddedtocart()
    {
        return Addedtocart().getText().equalsIgnoreCase("Added to Cart");
    }
    
    
}
