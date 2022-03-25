package com.training.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    private WebDriver driver;

    LoginPage loginPage;
    LandingPage landingPage;

    final String URL = "http://newtours.demoaut.com/";

    @BeforeClass
    public void setup() {
        this.driver = new ChromeDriver();
        this.loginPage = new LoginPage(driver);
        this.landingPage = new LandingPage(driver);
    }

    @AfterClass
    public void teardown() {
        this.driver.close();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void launchApplication() {
        launchApplication(this.URL);
    }

    public void launchApplication(String url) {
        this.driver.get(url);
    }
}
