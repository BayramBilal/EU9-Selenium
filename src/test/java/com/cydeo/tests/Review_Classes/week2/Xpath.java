package com.cydeo.tests.Review_Classes.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Xpath {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement element1 = driver.findElement(By.xpath("//div[@class=\"hl-image__background\"]"));
        WebElement element2 = driver.findElement(By.xpath("//div[@style=\"opacity: 0;\"]"));

        System.out.println(element2.getTagName());
        System.out.println(element1.getTagName());
    }
}