package com.amazon;

import org.testng.annotations.Test;

import com.amazon.Pages.homepage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.*;
import org.testng.Assert;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class AppTest
{
    WebDriver driver = new ChromeDriver();
    homepage hm = new homepage(driver);


    @Severity(SeverityLevel.CRITICAL)
    @Description("verify the page title")
    @Test
    public void verifytitle()
    {
        hm.openHomepage();
        String title = hm.getTitle();
        Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("verify price range ")
    @Test
    public void verifypricerange()
    {
        hm.searchItem("smartwatches");
        hm.filterBrand("Noise");
        hm.filterPrice("1000", "5000");
        for (WebElement priceElement : hm.allpricesofitems()) {
            String priceText = priceElement.getText();
            int price = Integer.parseInt(priceText.replace(",", "")); // Assuming prices are in integer format
            Assert.assertTrue(price > 1000, "Price is not greater than 1000");
        }
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Sort from high to low and add to cart")
    @Test
    public void addtocart()
    {
        hm.sortby("Price: High to Low");
        hm.selectfirstitem().click();
        hm.windowhandles(driver);
        hm.Addtocart();
        Assert.assertTrue(hm.isaddedtocart());
        driver.close(); 
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Sort from high to low and add to cart")
    @Test
    public void validateotherbrands()
    {
        hm.searchItem("smartwatches");
        String brands[] = {"Fire-Boltt","Fossil","boAt"};
        for(String brand:brands)
        {
        hm.filterBrand(brand);
        hm.filterPrice("1000", "5000");
        for (WebElement priceElement : hm.allpricesofitems()) {
            String priceText = priceElement.getText();
            int price = Integer.parseInt(priceText.replace(",", "")); // Assuming prices are in integer format
            Assert.assertTrue(price > 1000, "Price is not greater than 1000");
        }
        hm.sortby("Price: High to Low");
        hm.selectfirstitem().click();
        hm.windowhandles(driver);
        hm.Addtocart();
        Assert.assertTrue(hm.isaddedtocart());
        driver.close(); 
       }
    }

    public void Teardown()
    {
        driver.quit();
    }
}
