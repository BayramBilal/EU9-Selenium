package com.cydeo.tests.Review_Classes.week4;

import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.WebTableUtils;
import org.openqa.selenium.*;
import org.testng.annotations.*;


import java.util.*;
import java.util.concurrent.*;

public class WebTables {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUrl() {
        driver.get("http://practice.cybertekschool.com/web-tables");

    }

    @Test
    public void getNames() {

        List<WebElement> names = driver.findElements(By.xpath("//tbody//div[@class='content']//td[2]"));
        for (WebElement name : names) {
            System.out.println(name.getText());
        }
    }

    @Test
    public void test2(){

        String date = WebTableUtils.returnOrderDate(driver,"Robert Baratheon");
        System.out.println(date);
    }
}