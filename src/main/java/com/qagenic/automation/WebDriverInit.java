package com.qagenic.automation;

import org.openqa.selenium.WebDriver;

import com.qagenic.automation.utils.ConfigFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInit {

    private WebDriver driver;

    public WebDriver createWebDriver() {
        String browser = ConfigFileReader.getValue("browser");

        switch (browser) {
            case "firefox":
                driver = WebDriverManager.firefoxdriver().create();
                break;
            case "chrome":
                driver = WebDriverManager.chromedriver().create();
                break;
            case "safari":
                driver = WebDriverManager.safaridriver().create();
            default:
                driver = WebDriverManager.chromedriver().create();
                break;
        }

        return driver;
    }

}
