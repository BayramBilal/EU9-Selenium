package com.cydeo.tests.Review_Classes.week3;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.*;


import java.util.*;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/checkboxes");

        List<WebElement> labels = driver.findElements(By.className("checktext"));
        List<WebElement> boxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

////        for (WebElement label : labels) {
////            System.out.println(label.getText());
//        }

        for (WebElement box : boxes) {
            System.out.println(box.isSelected());
        }
    }
}