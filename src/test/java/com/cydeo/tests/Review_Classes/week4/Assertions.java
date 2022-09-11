package com.cydeo.tests.Review_Classes.week4;

import org.openqa.selenium.*;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.*;
import org.testng.annotations.*;


import java.util.*;
import java.util.concurrent.*;

public class Assertions {

    @Test
    public void assertResult(){
        String expectedResult = "Cydeo Home Page";
        String actualResult = "Cydeo Home Page";

        Assert.assertEquals(actualResult, expectedResult, "This is the first assertion");

    }

    //1. Asserting Cydeo practice page title
    // Go to Cydeo practice page
    // get title
    // Assert the title should equal to "Practice"

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void goToPage(){
        driver.get("https://practice.cydeo.com/");
    }

    @Test
    public void getTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /*
    2. go to cydeo practice page
        check if the link number is equal to 55
     */


    @Test
    public void linkNum(){
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int actualLinks = links.size();
        int expectedLinks = 52;
        Assert.assertEquals(actualLinks, expectedLinks);
    }

    /*
    3. Go to practice webpage, click drag and drop link
        assert the home page link is displayed
     */

    @Test
    public void homePage(){
        driver.findElement(By.xpath("//a[text()=\"Drag and Drop\"]")).click();
        WebElement homeLink = driver.findElement(By.xpath("//a[text()=\"Home\"]"));
        Assert.assertTrue(homeLink.isDisplayed());
    }




}