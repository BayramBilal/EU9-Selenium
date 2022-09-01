package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_MultipleSelectDropdown {

    WebDriver driver;

    @BeforeMethod()
    public void setUpMethod() {

        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

}

    @Test
    public void multipleSelectDropdown() {

      Select languagesDropdown=new Select(driver.findElement(By.name("Languages")));

        List<WebElement> allValues = languagesDropdown.getOptions(); // Select all the options from multiple select dropdown.
        for (WebElement eachValues : allValues) {
            eachValues.click();
            System.out.println(eachValues.getText());

           
        }
        languagesDropdown.deselectAll();





    }
}
/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values
 */