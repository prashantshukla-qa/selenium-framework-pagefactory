package com.training.automation;

import org.testng.annotations.Test;

public class AutomationPracticeLogintest extends BaseClass{


    @Test
    public void testLogin() {
        launchApplication();
        landingPage.navigateToLoginPage();
        loginPage.loginToTheApplication("tutorial", "tutorial");
    }

    
}
