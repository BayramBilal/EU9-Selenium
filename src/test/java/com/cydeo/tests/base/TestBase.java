package com.cydeo.tests.base;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.*;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test1()  {

        driver.get("https://letcode.in/edit");
        WebElement input = driver.findElement(By.id("fullName"));
        input.sendKeys("Bilal Bayram");

        WebElement append = driver.findElement(By.id("join"));
        append.sendKeys("I am good"+ Keys.TAB);

        WebElement inside = driver.findElement(By.id("getMe"));
        inside.getAttribute("ortonikc");

        WebElement text = driver.findElement(By.id("clearMe"));
        text.clear();

        WebElement field = driver.findElement(By.id("noEdit"));
        field.isEnabled();

        WebElement readon = driver.findElement(By.id("dontwrite"));
        String expected ="This text is readonly";

        String actual = readon.getAttribute("value");
        Assert.assertEquals(actual, expected);


    }

   @AfterMethod
    public void tearDown(){
        driver.close();
    }


}