package com.cydeo.tests.extra_tasks;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class dataproviderExample {

WebDriver driver;
    @Test (dataProvider = "searchData")
    public void DataProviderTest(String keyword, String expectedTitle){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword+ Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), "expectedTitle");

   // driver.close();
        driver.quit();
}

    @DataProvider(name = "searchData")
public Object [][] testData(){

        return new Object[][]{
                {"selenium", "selenium- Google search"},
                {"java", "java- Google search"},
                {"cydeo", "cydeo- Google search"},
                {"testng", "testng- Google search"},

        };

}

}

