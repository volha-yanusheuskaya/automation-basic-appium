package com.epam.testing.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverWait {

    public static final long TIME_OUT_IN_SECONDS = 60;

    public static final AndroidDriver driver = AndroidDriverSingleton.getInstance().getDriver();

    private AndroidDriverWait() {

    }

    public static WebElement waitForPresenceOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
