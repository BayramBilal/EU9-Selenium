package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_HomeWork1 {
    public static void main(String[] args) {


// TC #1: Etsy Title Verification
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");


//3. Search for “wooden spoon”

        WebElement searchWS = driver.findElement(By.name("search_query"));
        searchWS.sendKeys("Wooden Spoon"+ Keys.ENTER);

    //4. Verify title:
    //Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon / Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){

            System.out.println("Verification is PASSED!");
        }else{
            System.out.println("Verification is FAILED!");
        }
        driver.close();
    }
}
