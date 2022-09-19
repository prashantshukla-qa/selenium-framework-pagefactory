package com.qagenic.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.qagenic.automation.utils.ConfigFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInit {

    private WebDriver driver;

    public WebDriver createWebDriver() throws MalformedURLException {
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
            case "edge":
                driver = WebDriverManager.edgedriver().create();
            case "remote-chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://192.168.1.137:4444"), chromeOptions);
                break;
            case "remote-safari":
                SafariOptions safarioption = new SafariOptions();
                driver = new RemoteWebDriver(new URL("http://192.168.1.137:4444"), safarioption);
                break;
            default:
                driver = WebDriverManager.chromedriver().create();
                break;
        }

        return driver;
    }

}
