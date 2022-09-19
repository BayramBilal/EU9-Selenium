package com.cydeo.tests.extra_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SmartBearUtil {


    WebDriver driver = null;

    public void login (String driverType){

                switch (driverType) {

                    case "Chroem":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "Firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        break;
                    case "Safari":
                        WebDriverManager.safaridriver().setup();
                        driver = new SafariDriver();
                        break;
                    case "Opera":
                        WebDriverManager.operadriver().setup();
                        driver = new OperaDriver();
                        break;

                    default:
                        System.out.println("Please enter a valid browser name in lowercase");
            }
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        userName.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();


    }

}
