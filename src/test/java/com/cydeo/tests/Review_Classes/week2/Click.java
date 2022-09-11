package com.cydeo.tests.Review_Classes.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class Click {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        driver.findElement(By.xpath("//a[text()=\"Multiple Buttons\"]")).click();
        List<WebElement> btns = driver.findElements(By.xpath("//button"));
        for (WebElement btn : btns) {
            btn.click();
            Thread.sleep(1000);
        }

        WebElement btn6 = driver.findElement(By.name("button6"));
        System.out.println(btn6.isDisplayed());


    }
}