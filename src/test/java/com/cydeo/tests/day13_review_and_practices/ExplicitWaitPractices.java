package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

DynamicControlsPage dynamicControlsPage;

@BeforeMethod
public void SetUpMerthod(){

    Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
    dynamicControlsPage = new DynamicControlsPage();

}


@Test
    public void remove_button_test(){
    //3- Click to “Remove” button

    dynamicControlsPage.removeButton.click();

    //4- Wait until “loading bar disappears”
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));



    System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
            + dynamicControlsPage.inputBox.isEnabled());

    //5- Verify:
    //a. Input box is enabled.
    Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

    //b. “It’s enabled!” message is displayed.
    Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

    //Check the String value is matching as expected: “It’s enabled!”
    Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled!"));

}

}