package com.training.automation;

import com.training.automation.pagekeywords.LandingPage;
import com.training.automation.pagekeywords.LoginPage;
import com.training.automation.pagekeywords.searchpages.AmazonSearchPage;
import com.training.automation.pagekeywords.searchpages.FlipkartSearchPage;
import com.training.automation.pagekeywords.searchpages.SerachResultPage;
import com.training.automation.utils.Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    private WebDriver driver;

    LoginPage loginPage;
    LandingPage landingPage;
    Screenshot screenshot;

    SerachResultPage searchpage;

    private String URL;

    //final String URL = "http://automationpractice.com/index.php";

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.loginPage = new LoginPage(driver);
        this.landingPage = new LandingPage(driver);
        this.screenshot = new Screenshot(driver);
        if(URL.contains("amazon")){
            this.searchpage = new AmazonSearchPage(driver);
        }
        else{
            this.searchpage = new FlipkartSearchPage(driver);
        }
    }

    @AfterClass
    public void teardown() {
        this.driver.quit();
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

    private void seturl(String url){
        this.URL = url;
    }
    
}
