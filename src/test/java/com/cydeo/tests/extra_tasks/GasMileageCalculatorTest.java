package com.cydeo.tests.extra_tasks;

import com.cydeo.tests.utilities.Driver;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GasMileageCalculatorTest {

//1. Add a new class GasMileageCalculatorTest
//2. Go to https://www.calculator.net

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://www.calculator.net");

    }

    @Test
    public void gas_mileage_calculator() {
//3. Search for “gas mileage” using search box
//4. Click on the “Gas Mileage Calculator” link

        WebElement searchBox = driver.findElement(By.id("calcSearchTerm"));
        // WebElement searchBtn = driver.findElement(By.id("bluebtn"));
        searchBox.sendKeys("gas mileage");
        WebElement gasMileageCalcBtn = driver.findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        gasMileageCalcBtn.click();

//5. On Next page verify:
//a. Title equals: “Gas Mileage Calculator”
//b. “Gas Mileage Calculator” label is displayed
        WebElement title = driver.findElement(By.tagName("h1"));
        String actualTitle = title.getText();
        String expectedTitle = "Gas Mileage Calculator";
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("title.isDisplayed() = " + title.isDisplayed());
        Assert.assertEquals(actualTitle, expectedTitle);

        //6. Locate, clear and type “7925” into “Current odometer” field
        WebElement clearBtn = driver.findElement(By.xpath("//table[@id='metric']/tbody//tr[5]//td/img"));
        clearBtn.click();
        WebElement currentOdometer = driver.findElement(By.id("mucodreading"));
        // currentOdometer.clear();
        currentOdometer.sendKeys("7925");

        //7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement previousOdometer = driver.findElement(By.id("mupodreading"));
        //  previousOdometer.clear();
        previousOdometer.sendKeys("7558");

        //8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAdded = driver.findElement(By.id("mugasputin"));
        //gasAdded.clear();
        gasAdded.sendKeys("16");

        //9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gasPrice = driver.findElement(By.id("mugasprice"));
        // gasPrice.clear();
        gasPrice.sendKeys("3.55");

        //10. Click on Calculate button

        WebElement calcBtn = driver.findElement(By.xpath("//table[@id='metric']/tbody//tr[5]//td/input"));
        calcBtn.click();

        //11. Verify mpg value is as expected:
        //Expected value: “23.44 mpg”
        WebElement mpgValue = driver.findElement(By.xpath("//span[@class='bigtext']"));

        String actualMpgValue = mpgValue.getText();
        String expectedMpgValue = "23.44 mpg";
        Assert.assertEquals(actualMpgValue, expectedMpgValue);
    }
}