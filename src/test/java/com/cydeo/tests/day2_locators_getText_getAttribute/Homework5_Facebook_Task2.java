package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework5_Facebook_Task2 {
    public static void main(String[] args) {

        //   TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
        WebElement incorrectUsernameInput = driver.findElement(By.name("email"));
        incorrectUsernameInput.sendKeys("incorrect@email.com"+ Keys.ENTER);
        //4. Enter incorrect password

        WebElement incorrectPasswordInput = driver.findElement(By.name("pass"));
        incorrectPasswordInput.sendKeys("incorrect password"+Keys.ENTER);

        //5. Verify title changed to:

        //Expected: “Log into Facebook"

        WebElement logIntoTitle = driver.findElement(By.name("login"));
        String expectedlogIntoTitle = "Log into Facebook";
        String actuallogIntoTitle = driver.getTitle();

        if (actuallogIntoTitle.equals(expectedlogIntoTitle)){
            System.out.println("Title Practice verification PASSED!");
        }else{
            System.out.println("Title Practice verification FAILED!!!");
        }

    }
}
