package com.training.automation.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

    private WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot() {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("target\\screenshot.png"));
        } catch (IOException e) {
            System.out.print("Error while taking screenshot: " + e);
        }
    }

}
