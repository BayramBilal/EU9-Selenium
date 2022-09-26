package com.cydeo.tests.Review_Classes.week6.fullReview;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowTest extends TestBase1{

    @Test
    public void window() {
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> handels = driver.getWindowHandles();
        for (String handel : handels) {
            System.out.println(driver.switchTo().window(handel).getTitle());
        }
    }
}

