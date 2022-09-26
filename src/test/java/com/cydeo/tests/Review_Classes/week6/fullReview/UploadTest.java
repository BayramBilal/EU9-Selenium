package com.cydeo.tests.Review_Classes.week6.fullReview;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadTest extends TestBase1{

    @Test
    public void upload(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.name("upload")).sendKeys("");
    }
}