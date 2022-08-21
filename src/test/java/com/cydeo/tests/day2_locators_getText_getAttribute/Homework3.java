package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {

    public static void main(String[] args) {

     // TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com

        driver.get("https://google.com");


       //3- Click to Gmail from top right.

        WebElement gmailButton = driver.findElement(By.className("gb_d"));
        gmailButton.click();



        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitleGmail = "Gmail";
        String actualTitleGmail = driver.getTitle();

        if (actualTitleGmail.contains(expectedTitleGmail)){
            System.out.println("Title Gmail verification PASSED!");
        }else{
            System.out.println("Title Gmail verification FAILED!!!");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Google verification PASSED!");
        }else{
            System.out.println("Title Google verification FAILED!!!");
        }

    driver.close();

    }
}
