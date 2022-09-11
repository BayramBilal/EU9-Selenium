package com.cydeo.tests.Review_Classes.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class CssSelector {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");


        // using css locator
//        WebElement title = driver.findElement(By.cssSelector("div[id=\"flash-messages\"]"));
//        System.out.println(title.getTagName());

        WebElement ul = driver.findElement(By.cssSelector("ul[class='list-group']"));
        System.out.println(ul.getTagName());


    }
}