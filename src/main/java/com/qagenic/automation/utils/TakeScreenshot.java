package com.qagenic.automation.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

    WebDriver driver;

    public TakeScreenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void capture() throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) this.driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("screenshot.png");
        FileUtils.copyFile(SrcFile, DestFile);
    }

}
