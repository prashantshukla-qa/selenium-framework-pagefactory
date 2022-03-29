package com.training.automation;

import org.testng.annotations.Test;

public class MakeMyTripTest extends BaseClass{

    @Test
    public void testGoogleLogin() {
        launchApplication("https://www.makemytrip.com/");
        makeMyTripPage.clickOnGoogleLoginButton();
    }
    
}
