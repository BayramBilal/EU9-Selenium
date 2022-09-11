package com.cydeo.tests.Review_Classes.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.time.temporal.*;

public class SendKeys {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("https://practice.cydeo.com/inputs");
//
//        WebElement input = driver.findElement(By.xpath("//input[@type=\"number\"]"));
//        input.sendKeys("100");

        driver.get("https://practice.cydeo.com/login");

        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));

        System.out.println(username.getAttribute("type"));


//        username.sendKeys("tomsmith");
//        password.sendKeys("SuperSecretPassword" + Keys.ENTER);

    }
}