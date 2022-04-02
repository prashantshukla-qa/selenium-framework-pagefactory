package com.training.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    private WebDriver driver;

    LoginPage loginPage;
    LandingPage landingPage;
    FacebookLoginPage facebookloginPage;
    MakeMyTripPage makeMyTripPage;

    /**
     * URL is the default test URL
     */
    final String URL = "http://automationpractice.com/index.php";

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        
        this.loginPage = new LoginPage(driver);
        this.landingPage = new LandingPage(driver);
        this.facebookloginPage = new FacebookLoginPage(driver);
        this.makeMyTripPage = new MakeMyTripPage(driver);
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
