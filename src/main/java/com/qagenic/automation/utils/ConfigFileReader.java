package com.qagenic.automation.utils;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class ConfigFileReader {

    public static String getValue(String key) {
        Properties prop = new Properties();

        try {
            Reader reader = new FileReader("conf.properties");
            prop.load(reader);

        } catch (Exception e) {
            System.out.println("File Not Found");
        }
        String returnValue = System.getProperty(key, prop.get(key).toString());
        return returnValue;
    }

}
