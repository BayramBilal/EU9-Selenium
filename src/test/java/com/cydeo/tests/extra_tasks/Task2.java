package com.cydeo.tests.extra_tasks;

import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

    }
    @Test
    public void orderPlace(){

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));

        userName.sendKeys("Tester");
        passWord.sendKeys("test");

        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

         //    6. Click on Order
        WebElement order = driver.findElement(By.xpath("//a[.='Order']"));
        order.click();

        //        7. Select familyAlbum from product, set quantity to 2
        WebElement product = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(product);
        select.selectByVisibleText("FamilyAlbum");
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys("2");

        //        8. Click to “Calculate” button
        WebElement calculateBtn = driver.findElement(By.xpath("//input[@value=\"Calculate\"]"));
        calculateBtn.click();
        //        9. Fill address Info with JavaFaker

        Faker faker = new Faker();
        //• Generate: name, street, city, state, zip code
        //        10. Click on “visa” radio button
        //        11. Generate card number using JavaFaker
        //        12. Click on “Process”

        String name = faker.name().firstName();
        String street = faker.address().streetName();
        String city = faker.address().cityName();
        String state = faker.address().state();
        String zipCode = faker.address().zipCode();
        String credit = faker.finance().creditCard();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(name);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(street);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zipCode);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(credit);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("03/21");


         WebElement visaBtn = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaBtn.click();
        WebElement processBtn = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processBtn.click();

               //        13. Verify success message “New order has been successfully added.”
       WebElement message = driver.findElement(By.linkText("New order has been successfully added."));
       String expectedMessage = "New order has been successfully added.";
      String actualMessage = message.getText();
      Assert.assertEquals(actualMessage, expectedMessage);

    }
}