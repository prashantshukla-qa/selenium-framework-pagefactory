package com.training.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    @FindBy(css = "a.login")
    private WebElement loginLink;

    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        this.loginLink.click();
    }

}
