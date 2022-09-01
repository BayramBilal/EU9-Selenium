package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;


import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class T7_NonSelectDropdown {
   WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {

        //TC #7: Selecting value from non-select dropdown
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown

        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void nonSelectedDropdown() throws InterruptedException {
        //3. Click to non-select dropdown
        WebElement nonSelectedDropdownLink = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        Thread.sleep(3000);
        nonSelectedDropdownLink.click();
        Thread.sleep(3000);


        //4. Select Facebook from dropdown
        WebElement facebookButton = driver.findElement(By.xpath("//a[.='Facebook']"));
        Thread.sleep(3000);
        facebookButton.click();


        //5. Verify title is “Facebook - Log In or Sign Up

        Assert.assertEquals((facebookButton.getText()),"Facebook - Log In or Sign Up","Title doesnt match");

}
    @AfterMethod
    public void tearDown(){
        driver.close();

}


}