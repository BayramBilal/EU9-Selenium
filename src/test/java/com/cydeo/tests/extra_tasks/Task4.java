package com.cydeo.tests.extra_tasks;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task4 {
    WebDriver driver;
//TC #1: Checking the number of links on the page
//1. Open Chrome browser
//2. Go to https://www.openxcell.com

    @BeforeMethod
    public void setUp() {


        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.openxcell.com");
    }
@Test
    public void numOfLinks(){
//3. Count the number of the links on the page and verify
//Expected: 332

    List<WebElement> links = driver.findElements(By.xpath("//a"));

    int expectedResult = 332;
   int actualResult = links.size();

    System.out.println("actualResult = " + actualResult);
    Assert.assertEquals(actualResult, expectedResult);

    //TC #2: Printing out the texts of the links on the page
    //Print out all of the texts of the links on the page

    //Count the number of links that does not have text and verify
    // Expected: 109
}
    @Test
    public void listOfLinks(){
        List<WebElement> links = driver.findElements(By.xpath("//a"));

        int noTextNum = 0;
        int withTextNum = 0;
        for (WebElement eackLink : links) {

            if (eackLink.getText().isEmpty()){
                withTextNum++;
            }else{
                noTextNum++;
            }

    }
        System.out.println("noTextNum = " + noTextNum);
        System.out.println("withTextNum = " + withTextNum);

        int actualNumOfNoTex = noTextNum;
        int expectedNUmOfNOText = 109;

        Assert.assertEquals(actualNumOfNoTex, expectedNUmOfNOText);

        Driver.closeDriver();
    }

}








