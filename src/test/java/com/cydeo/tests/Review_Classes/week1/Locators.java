package com.cydeo.tests.Review_Classes.week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Locators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");


        // using id locator
//        WebElement uniqueId = driver.findElement(By.id("content"));
//        System.out.println(uniqueId.getTagName());

//        WebElement flashMsg = driver.findElement(By.id("flash-messages"));
//        System.out.println(flashMsg.getTagName());



        // using name locator
//        WebElement meta = driver.findElement(By.name("viewport"));
//        System.out.println(meta.getTagName());

        // using class name
//        WebElement title = driver.findElement(By.className("h1y"));
//        System.out.println(title.getText());

//        WebElement ul = driver.findElement(By.className("list-group"));
//        System.out.println(ul.getTagName());

        // using tag name
//        WebElement titleTag = driver.findElement(By.tagName("h1"));
//        System.out.println(titleTag.getText());

        // using link text
//        WebElement home = driver.findElement(By.linkText("Home"));
//        System.out.println(home.getTagName());
//        System.out.println(home.getText());

//        WebElement dynamic = driver.findElement(By.linkText("Dynamic Controls"));
//        System.out.println(dynamic.getText());

        // using partial link text
        WebElement onload = driver.findElement(By.partialLinkText("JavaScript"));
        System.out.println(onload.getText());
    }


}