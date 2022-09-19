package com.cydeo.tests.Review_Classes.week5;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.*;
import org.testng.annotations.*;

public class JSExecuter extends TestBase {

   /* @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement link = driver.findElement(By.xpath("//a[.=\"Dropdown\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", link);

    }
*/
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement input = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = "Cydeo EU9 GR3";
        js.executeScript("arguments[0].setAttribute('value', '" + text +"')",input);
    }

    // to scroll up  window.scrollBy(0,250)
    // to scroll down window.scrollBy(0,-250)
}