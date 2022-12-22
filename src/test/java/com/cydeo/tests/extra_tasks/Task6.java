package com.cydeo.tests.extra_tasks;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task6 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void test1() {

        driver.get("https://letcode.in/edit");
        WebElement input = driver.findElement(By.id("fullName"));
        input.sendKeys("Bilal Bayram");

        WebElement append = driver.findElement(By.id("join"));
        append.sendKeys("I am good"+ Keys.TAB);

        WebElement inside = driver.findElement(By.id("getMe"));
        System.out.println(inside.getText() + "ortonikc");


        WebElement text = driver.findElement(By.id("clearMe"));
        text.clear();

        WebElement field = driver.findElement(By.id("noEdit"));
        field.isEnabled();
        System.out.println("field.isEnabled() = " + field.isEnabled());

        WebElement readon = driver.findElement(By.id("dontwrite"));
        String expected ="This text is readonly";

        String actual = readon.getAttribute("value");
        Assert.assertEquals(actual, expected);



    }
    }




