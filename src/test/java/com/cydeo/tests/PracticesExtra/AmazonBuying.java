package com.cydeo.tests.PracticesExtra;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AmazonBuying {


@Test
public void testAmazon(){
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr");

        WebElement cookiesAccept = driver.findElement(By.id("sp-cc-accept"));
        cookiesAccept.click();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedInTitle = "wooden spoon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }

        WebElement spoon = driver.findElement(By.xpath("//img[contains(@data-image-index,'51')]"));
        spoon.click();
        WebElement sepeteEkle = driver.findElement(By.id("add-to-cart-button"));
        sepeteEkle.click();
        WebElement sepeteGit = driver.findElement(By.id("nav-cart"));
        sepeteGit.click();

        //sepet verification

        WebElement sepetteki = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
       String expectedSepet = "Kahve kaşığı Wooden Spoon, Japanese Retro Soup Spoon, For Kitchen Restaurant Hotel Dessert Spoon Ice Cream Spoon, 7.87 Inches Tatlı Kaşığı Dondurma Kaşığı (Color : Blu)";
       String actualSepet = sepetteki.getText();


      Assert.assertEquals(actualSepet, expectedSepet);

       driver.close();

    }

}
