package com.cydeo.tests.Review_Classes.week5;


import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

public class Upload extends TestBase {

    @Test
    public void uploadTest(){
        driver.get("http://practice.cybertekschool.com/upload");

        String path = "C:\\Users\\Selim\\IdeaProjects\\EU9-Selenium\\src\\test\\java\\com\\cydeo\\tests\\utilities\\upload.txt";
        driver.findElement(By.id("file-upload")).sendKeys(path);
        driver.findElement(By.id("file-submit")).click();

        String actual = driver.findElement(By.id("uploaded-files")).getText();
        String expexted = "upload.txt";

        Assert.assertEquals(actual, expexted);
    }
}