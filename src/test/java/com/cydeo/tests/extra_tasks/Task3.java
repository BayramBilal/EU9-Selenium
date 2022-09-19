package com.cydeo.tests.extra_tasks;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

    }
    @Test
    public void orderVerification(){

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));

        userName.sendKeys("Tester");
        passWord.sendKeys("test");

        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

//TC#3: Smartbear software order verification
        //1. Open browser and login to Smartbear software
        //2. Click on View all orders

       WebElement viewAllOrders = driver.findElement(By.xpath("//a[.='View all orders']"));
       viewAllOrders.click();
        //3. Verify Susan McLaren has order on date “01/05/2010”

        WebElement orderDate =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Susan McLaren']/following-sibling::td[3]"));
        String expectedDate = "01/05/2010";
        String actualDate= orderDate.getText();
        Assert.assertEquals(actualDate, expectedDate);


    }
}