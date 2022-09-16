package com.qagenic.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLoginTest extends BaseClass {

    @Test
    public void testInvalidFacveebookLogin() {
        launchApplication("https://www.facebook.com/");
        pages.facebookloginpage.loginToTheApplication("tutorial", "tutorial");
        System.out.println(pages.facebookloginpage.getErrorMessage());

        Assert.assertEquals(pages.facebookloginpage.getErrorMessage(),
                "The email address or mobile number you entered isn't connected to an account. Find your account and log in. Prashant");
    }

}
