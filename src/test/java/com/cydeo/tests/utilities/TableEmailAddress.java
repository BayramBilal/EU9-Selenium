package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TableEmailAddress {


    public static String tableNumVerify (WebDriver driver, String tableNum){

        String locator = "//table[@id='table1']";
        WebElement tableNumValue = driver.findElement(By.xpath("locator"));
        return tableNumValue.getAttribute("id");

    }
    public static void getTableGetEmail(WebDriver driver, String tableNum, String expectedFirstName){

        String Locator = "//table[@id='"+tableNum+"']/tbody//tr//td[2]";

        WebElement firstNameCell = driver.findElement(By.xpath("Locator"));

        String actualFirstName = firstNameCell.getText();
        Assert.assertEquals (actualFirstName, expectedFirstName);

    }



}
