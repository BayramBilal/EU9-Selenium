package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.tests.utilities.WebDriverFactory;
import com.cydeo.tests.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

//TC #1: Web table practice
public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
              driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //1. Go to: https://practice.cydeo.com/web-tables
    driver.get(" https://practice.cydeo.com/web-tables");
}


    @Test
    public void order_name_verify_test(){

//2. Verify Bob’s name is listed as expected.
        //first bob Martin cell
        WebElement BonMartinCell = driver.findElement(By.xpath("//table[@id= 'ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

//Expected: “Bob Martin”
        String expectedName = "Bob Martin";
        String actualName = BonMartinCell.getText();
        Assert.assertEquals(actualName, expectedName);

//3. Verify Bob Martin’s order date is as expected
//Expected: 12/31/2021
WebElement orderDate =
        driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedDate = "12/31/2021";
        String actualDate= orderDate.getText();
        Assert.assertEquals(actualDate, expectedDate);
    }
    //We use the utility method we created.
    @Test
    public void test2(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");


        System.out.println("customerOrderDate1 = " + customerOrderDate1);

    }
    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver, "Bart Fisher","01/16/2021");
    }
}
