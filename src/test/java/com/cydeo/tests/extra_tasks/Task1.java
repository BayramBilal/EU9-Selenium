package com.cydeo.tests.extra_tasks;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

    }
    @Test
    public void getLinkNumber(){

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));

        userName.sendKeys("Tester");
        passWord.sendKeys("test");

        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

            List<WebElement> links = driver.findElements(By.xpath("//a"));

        System.out.println("links count = " + links.size());


        for (WebElement textLink: links   ) {

            System.out.println("textLink.getText() = " + textLink.getText());

        }

    }



}
