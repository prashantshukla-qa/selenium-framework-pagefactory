package com.qagenic.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#email")
    private WebElement input_email;

    @FindBy(css = "input#passwd")
    private WebElement input_password;

    @FindBy(css = "button#SubmitLogin")
    private WebElement button_signin;

    public void loginToTheApplication(String username, String password){
        input_email.sendKeys(username);
        input_password.sendKeys(password);
        button_signin.click();
    }
    
}
