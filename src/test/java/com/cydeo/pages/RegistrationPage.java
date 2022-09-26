package com.cydeo.pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationPage {


    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Home")
    public WebElement homeLink;

    @FindBy(tagName = "h2")
    public WebElement title;

    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy(name = "lastname")
    public WebElement lastName;

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement emailInput;

    @FindBy(css = "input[name=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "(//div[@class='col-sm-5'])[6]/input")
    public WebElement phoneInput;

    @FindBy(css = "input[type=\"radio\"]") //like find elements
    public List<WebElement> radioBtns;

    @FindBy(xpath = "//input[@data-bv-field=\"birthday\"]")
    public WebElement birthDayInput;

    @FindBy(name = "department")
    public WebElement departDrop;

    @FindBy(name = "job_title")
    public WebElement jobDrop;

    @FindBy(id = "inlineCheckbox1")
    public WebElement cPlus;

    @FindBy(id = "inlineCheckbox2")
    public WebElement javaLanguage;

    @FindBy(id = "inlineCheckbox3")
    public WebElement jsLanguage;

    @FindBy(id = "wooden_spoon")
    public WebElement loginBtn;

    @FindBy(partialLinkText = "CYD")
    public WebElement cydeoLink;






}