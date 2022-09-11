package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.tests.utilities.TableEmailAddress;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Custom_Method_Email {

    public WebDriver driver;
// TC #3: Create a custom method
//1- Open a chrome browser



    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void custom_method_email(){
    //2- Go to: https://practice.cydeo.com/table
         driver.get("https://practice.cydeo.com/tables");
        WebElement tableEmailCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='jsmith@gmail.com']"));
        String expectedEmail = "jsmith@gmail.com";
        String actualEmail= tableEmailCell.getText();
        Assert.assertEquals (actualEmail, expectedEmail);


        WebElement firstNameCell =
                driver.findElement(By.xpath("//table[@id='table1']/tbody//tr//td[2]"));
        String expectedFirstName = "John";
        String actualFirstName= firstNameCell.getText();
        Assert.assertEquals (actualFirstName, expectedFirstName);

        WebElement tableNum =
                driver.findElement(By.xpath("//table[@id='table1']"));
        String actualtableValue = tableNum.getAttribute("id");
        String expectedtableValue = "table1";

        Assert.assertEquals (actualtableValue, expectedtableValue);
    }
  @Test
   public void test2(){

      TableEmailAddress.getTableGetEmail(driver, "table1", "John" );

}
}