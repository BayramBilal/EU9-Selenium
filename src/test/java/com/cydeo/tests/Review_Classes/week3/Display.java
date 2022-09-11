package com.cydeo.tests.Review_Classes.week3;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


import java.util.*;

public class Display {


    public static void  main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/dynamic_loading/1");

        WebElement label = Driver.getDriver().findElement(By.xpath("//div[@id=\"finish\"] /h4"));

        System.out.println(label.isDisplayed()); // get false result

        Driver.getDriver().findElement(By.xpath("//div[@id=\"start\"] /button")).click();

        Thread.sleep(5000);

        WebElement label1 = Driver.getDriver().findElement(By.xpath("//div[@id=\"finish\"] /h4"));

        System.out.println(label1.isDisplayed()); // get true result



    }
}