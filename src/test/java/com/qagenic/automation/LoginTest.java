package com.qagenic.automation;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void LaunchApplication() {
        launchApplication();
        Assert.assertTrue(pages.landingpage.isLogoPresent());
    }

    @Test(dependsOnMethods = "LaunchApplication")
    public void testLoginFeature() throws IOException {
        pages.landingpage.launchLoginPage();
        pages.loginpage.loginToTheApplication("test", "test");
        pages.takeScreenshot.capture();
    }

}
