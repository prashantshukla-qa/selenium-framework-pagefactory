package com.training.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLoginTest extends BaseClass {

    @Test
    public void testInvalidFacveebookLogin() {
        launchApplication("https://www.facebook.com/");
        facebookloginPage.loginToTheApplication("tutorial", "tutorial");
        System.out.println(facebookloginPage.getErrorMessage());

        Assert.assertEquals(facebookloginPage.getErrorMessage(),
                "The email address or mobile number you entered isn't connected to an account. Find your account and log in. Prashant");
    }

}
