package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText_getAttribute_Practice {

    public static void main(String[] args) {

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Enter incorrect username into login box:
        WebElement incorrectUsernameLogIn = driver.findElement(By.cssSelector("input[type='text']"));

        //4- Click to `Reset password` button
        driver.findElement(By.cssSelector("button[value='Reset password']")).click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found

        String expectedErrorText = "Login or E-mail not found";
        String actualErrorText = driver.findElement(By.className("errortext")).getText();

        if (actualErrorText.equals(expectedErrorText)){
            System.out.println("Error text verification PASSED!");
        }else{
            System.out.println("Error text verification FAILED!");

        }

    }


}
