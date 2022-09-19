package com.cydeo.tests.Review_Classes.week4;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.*;
import org.testng.annotations.*;


import java.util.*;
import java.util.concurrent.*;

public class Windows {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUrl() {
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void test1() {
        driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            System.out.println(driver.switchTo().window(handle).getTitle());
        }
    }
}