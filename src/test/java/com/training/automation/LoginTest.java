package com.training.automation;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass{


    @Test
    public void testLogin() {
        launchApplication();
        landingPage.navigateToLoginPage();
        loginPage.loginToTheApplication("tutorial", "tutorial");
    }

    
}
