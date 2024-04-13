package com.epam.testing.driver;

import static com.epam.testing.capabilities.AndroidDesiredCapabilities.getCapabilitiesForEpamConnectApp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverSingleton {

    public static final String APPIUM = "http://localhost:4723/wd/hub";

    private static AndroidDriver driver;
    private static AndroidDriverSingleton instance = new AndroidDriverSingleton();

    private static final Logger logger = LogManager.getRootLogger();

    private AndroidDriverSingleton() {

    }

    public static AndroidDriverSingleton getInstance() {
        if (instance == null) {
            instance = new AndroidDriverSingleton();
        }
        return instance;
    }

    public AndroidDriver getDriver() {
        try {
            driver = new AndroidDriver(new URL(APPIUM), getCapabilitiesForEpamConnectApp("Android", "9"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        logger.info("The Driver is set up!");
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        } else {
            logger.error("The Driver is not closed!");
        }
    }
}
