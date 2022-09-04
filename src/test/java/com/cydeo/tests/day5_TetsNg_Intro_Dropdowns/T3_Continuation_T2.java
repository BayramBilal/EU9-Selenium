package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_Continuation_T2 {
    public static void main(String[] args) throws InterruptedException{

        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #3: Utility method task for (continuation of Task2)
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons ");

        //3. Click to “Hockey” radio button
        //4. Verify “Hockey” radio button is selected after clicking.
        Thread.sleep(2000);
        clickAndVerifyRadioButton(driver, "sport","football");
        Thread.sleep(2000);
        clickAndVerifyRadioButton(driver, "color","yellow");
        Thread.sleep(2000);
        clickAndVerifyRadioButton(driver, "sport","basketball");
        Thread.sleep(2000);
        clickAndVerifyRadioButton(driver, "color","red");


    }

    public static void clickAndVerifyRadioButton (WebDriver driver, String name, String id){
        WebDriverManager.chromedriver().setup();
    List<WebElement> radioButtonGroups = driver.findElements(By.name(name));

        for ( WebElement eachRadioBtn : radioButtonGroups){

    if(eachRadioBtn.getAttribute("id").equals(id)){
        eachRadioBtn.click();
        System.out.println("eachRadioBtn.isSelected() = " + eachRadioBtn.isSelected());
    }


        }



    }


}


//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
//Create a utility method to handle above logic.
//Method name: clickAndVerifyRadioButton
//Return type: void or boolean
//Method args:
//1. WebDriver
//2. Name attribute as String (for providing which group of radio buttons)
//3. Id attribute as String (for providing which radio button to be clicked)
//
//Method should loop through the given group of radio buttons. When it finds the
//matching option, it should click and verify option is Selected.
//Print out verification: true
