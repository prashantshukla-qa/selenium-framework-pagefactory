package com.training.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripPage {

    WebDriver driver;

    @FindBy(css = "div.googleLoginBtn")
    WebElement googleLoginButton;


    public MakeMyTripPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnGoogleLoginButton() {
        this.googleLoginButton.click();
    }


}
