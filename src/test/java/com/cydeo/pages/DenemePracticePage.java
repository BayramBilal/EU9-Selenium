package com.cydeo.pages;


import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DenemePracticePage {

    public DenemePracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class=\"_2KpZ6l _2doB4z\"]")
    public WebElement xButton ;

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

    @FindBy(xpath = "//img[@alt='Electronics']")
    public WebElement electronics;

    @FindBy(xpath = "(//a[@class='_6WOcW9'])[8]")
    public WebElement powerBank;
}
