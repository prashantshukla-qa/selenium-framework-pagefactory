package com.qagenic.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")
    private WebElement signinbutton;

    @FindBy(css = "img.logo")
    private WebElement applogo;

    public void launchLoginPage() {
        signinbutton.click();
    }

    public boolean isLogoPresent(){
        return applogo.isDisplayed();
    }

}
