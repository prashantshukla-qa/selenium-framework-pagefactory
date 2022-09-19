package com.qagenic.automation;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.qagenic.automation.pageobjects.FacebookLoginPage;
import com.qagenic.automation.pageobjects.LandingPage;
import com.qagenic.automation.pageobjects.LoginPage;
import com.qagenic.automation.pageobjects.WikipediaPage;
import com.qagenic.automation.utils.TakeScreenshot;

public class PageInitiator {
    WebDriver driver;
    LandingPage landingpage;
    LoginPage loginpage;
    FacebookLoginPage facebookloginpage;
    WikipediaPage wikipediapage;
    TakeScreenshot takeScreenshot;

    public PageInitiator() throws MalformedURLException{
        this.driver = new WebDriverInit().createWebDriver();
        this.landingpage = new LandingPage(driver);
        this.loginpage = new LoginPage(driver);
        this.facebookloginpage = new FacebookLoginPage(driver);
        this.wikipediapage = new WikipediaPage(driver);
        this.takeScreenshot = new TakeScreenshot(driver);
    }
}
