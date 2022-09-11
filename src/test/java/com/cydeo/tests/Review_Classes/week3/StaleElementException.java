package com.cydeo.tests.Review_Classes.week3;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.*;


public class StaleElementException {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com");

        WebElement gmail = driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));

        System.out.println(gmail.getText());

        driver.navigate().refresh();

        System.out.println(gmail.getText());


    }
}