package com.cydeo.tests.Review_Classes.week1;
import io.github.bonigarcia.wdm.*;
import io.github.bonigarcia.wdm.managers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class FirstClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

//        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new ChromeDriver();

//        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        // go to ebay page
        driver.navigate().to("https://www.ebay.com");
        System.out.println(driver.getTitle());

        // go back to google
        driver.navigate().back();
        System.out.println(driver.getTitle());

        // go to ebay one more time
        driver.navigate().forward();
        System.out.println(driver.getTitle());

        // refresh ebay, still on ebay
        driver.navigate().refresh();

        System.out.println(driver.getTitle());
    }
}