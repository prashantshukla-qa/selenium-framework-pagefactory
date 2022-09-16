package com.qagenic.automation;

import org.openqa.selenium.WebDriver;

import com.qagenic.automation.pageobjects.LandingPage;
import com.qagenic.automation.pageobjects.LoginPage;
import com.qagenic.automation.utils.TakeScreenshot;

public class PageInitiator {
    WebDriver driver;
    LandingPage landingpage;
    LoginPage loginpage;
    TakeScreenshot takeScreenshot;

    public PageInitiator(){
        this.driver = new WebDriverInit().createWebDriver();
        this.landingpage = new LandingPage(driver);
        this.loginpage = new LoginPage(driver);
        this.takeScreenshot = new TakeScreenshot(driver);
    }
}
