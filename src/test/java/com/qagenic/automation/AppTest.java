package com.qagenic.automation;

import org.testng.annotations.Test;

import com.qagenic.automation.utils.ConfigFileReader;

public class AppTest {

    @Test
    public void checkConfigFileReader(){
        String test = ConfigFileReader.getValue("QAGenic");

        System.out.println(test);
    }
    
}
