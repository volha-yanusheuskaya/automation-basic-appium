package com.epam.testing.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDesiredCapabilities {

    public static final String EPAM_CONNECT_APP = "/Users/Volha_Yanusheuskaya/Projects/automation-basic-appium/EPAM Connect_2.28_apkcombo.com.apk";

    private final static DesiredCapabilities caps = new DesiredCapabilities();

    public static DesiredCapabilities getCapabilitiesForEpamConnectApp(String platformName, String platformVersion) {
        caps.setCapability("platformName", platformName);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", EPAM_CONNECT_APP);
        return caps;
    }
}
