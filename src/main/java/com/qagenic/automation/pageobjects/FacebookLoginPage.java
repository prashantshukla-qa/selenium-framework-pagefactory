package com.training.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

    @FindBy(id = "email")
    private WebElement userName;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement loginButton;

    @FindBy(css = "div._9ay7")
    private WebElement errorMessage;

    public FacebookLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void loginToTheApplication(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    public String getErrorMessage() {
        return this.errorMessage.getText();
    }

}
