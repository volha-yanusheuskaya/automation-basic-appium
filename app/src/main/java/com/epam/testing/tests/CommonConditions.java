package com.epam.testing.tests;

import com.epam.testing.driver.AndroidDriverSingleton;


import org.junit.After;
import org.junit.Before;

import io.appium.java_client.android.AndroidDriver;

public class CommonConditions {

    protected AndroidDriver driver;

    @Before
    public void setUp() {
        driver = AndroidDriverSingleton.getInstance().getDriver();
    }

    @After
    public void tearDown() {
        AndroidDriverSingleton.getInstance().closeDriver();
    }
}
