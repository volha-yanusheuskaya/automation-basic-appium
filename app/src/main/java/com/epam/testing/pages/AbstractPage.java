package com.epam.testing.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public abstract class AbstractPage {

    protected AndroidDriver driver;

    protected final Logger logger = LogManager.getRootLogger();

    protected AbstractPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
}
