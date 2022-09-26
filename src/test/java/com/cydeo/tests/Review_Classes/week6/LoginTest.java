package com.cydeo.tests.Review_Classes.week6;

import com.cydeo.pages.LoginPage;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage();
    }

    @Test
    public void happyTest(){
        driver.get("https://practice.cydeo.com/login");
        String username = "tomsmith";
        String password = "SuperSecretPassword";
        loginPage.loginMethod(username,password);
        String expectedMsg= "You logged into a secure area!\n" +
                "×";
        Assert.assertEquals(loginPage.successMsg.getText(),expectedMsg);
    }

    @Test
    public void sadTest(){
        driver.get("https://practice.cydeo.com/login");
        String username = "wrong username";
        String password = "wrong password";
        loginPage.loginMethod(username,password);
        String expectedMsg= "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.successMsg.getText(),expectedMsg);
    }
}