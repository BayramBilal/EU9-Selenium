package com.cydeo.tests.Review_Classes.week5;


import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

public class DragDrop extends TestBase {

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/drag_and_drop");
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/drag_and_drop_circles");
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        Thread.sleep(1000);
        actions.dragAndDrop(source,target).perform();
    }
}