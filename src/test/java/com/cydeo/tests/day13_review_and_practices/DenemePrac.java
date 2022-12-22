package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DenemePracticePage;
import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DenemePrac {
    // go to the   https://www.flipkart.com/


@BeforeMethod
    public void setUp(){

    Driver.getDriver().get(" https://www.flipkart.com/");

}
@Test
public void testing(){
    DenemePracticePage denemePracticePage = new DenemePracticePage();
    denemePracticePage.xButton.click();
    // generate a random first name and send it to search box then click enter
    // navigate back

        Faker faker = new Faker();

    denemePracticePage.searchBox.sendKeys(faker.name().firstName() +Keys.ENTER);
    BrowserUtils.sleep(3);
    Driver.getDriver().navigate().back();

    // page down four times in the page (do this with for loop)
       Actions actions = new Actions(Driver.getDriver());

    for (int i = 0; i < 4; i++) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        BrowserUtils.sleep(2);

    }
    // scroll up by using JS


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,-3000)");


    // hover over to the "electronics " menu
    actions.moveToElement(denemePracticePage.electronics).perform();

    BrowserUtils.sleep(4);

    //locate  powerBank menu

    denemePracticePage.powerBank.click();
    // close the driver.
    Driver.closeDriver();


}
}
