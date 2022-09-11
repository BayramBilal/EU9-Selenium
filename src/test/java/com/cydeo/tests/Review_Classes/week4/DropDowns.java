package com.cydeo.tests.Review_Classes.week4;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;


import java.util.*;
import java.util.concurrent.*;

public class DropDowns {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUrl(){
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void firstDropDown() {
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    @Test
    public void defaultOption(){
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        String actualDefault = select.getFirstSelectedOption().getText();
        String expectedDefault = "Please select an option";
        Assert.assertEquals(actualDefault, expectedDefault);
    }

    @Test
    public void selectDate(){
        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        Select selectYear = new Select(year);
        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);

        selectYear.selectByVisibleText("2020");
        selectMonth.selectByValue("7");
        selectDay.selectByIndex(9);
    }

}