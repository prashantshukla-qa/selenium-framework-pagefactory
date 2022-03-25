package com.training.automation;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass{


    @Test
    public void testLogin() {
        launchApplication();
        loginPage.loginToTheApplication("tutorial", "tutorial");
    }

    
}
