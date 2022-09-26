package com.cydeo.tests.Review_Classes.week6.fullReview;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase1 {



       protected WebDriver driver;

        @BeforeMethod
        public void setUp(){
            driver = Driver.getDriver();

        }

        @AfterMethod
        public void tearDown(){
            Driver.closeDriver();
        }

    }
