package com.epam.testing.pages;

import static com.epam.testing.driver.AndroidDriverWait.waitForPresenceOfElementLocated;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class EpamConnectLoginPage extends AbstractPage {

    private final By skipButtonElement = By.xpath("//*[@resource-id='button_link']");
    private final By headingElement = By.xpath("//*[@text='Welcome to']");
    private final By appNameElement = By.xpath("//*[@text='EPAM Connect']");
    private final By logInButton = MobileBy.AccessibilityId("Log In");
    private final By signUpButton = MobileBy.AccessibilityId("Sign Up");
    private final By logInLinkedinButton = By.xpath("//*[@resource-id='zocial-linkedin']");
    private final By usernameLinkedinInput = By.xpath("//*[@resource-id='username']");
    private final By passwordLinkedinInput = By.xpath("//*[@resource-id='password']");
    private final By signInLinkedinButton = By.xpath("//*[@text='Sign in']");
    private final By passwordLinkedinError = By.xpath("//*[@resource-id='error-for-password']");

    public EpamConnectLoginPage(AndroidDriver driver) {
        super(driver);
    }

    public void clickSkipLink() {
        waitForPresenceOfElementLocated(skipButtonElement).click();
        logger.info("The Skip button is clicked");
    }

    public String getHeadingText() {
        return waitForPresenceOfElementLocated(headingElement).getText()
                + " " + waitForPresenceOfElementLocated(appNameElement).getText();
    }

    public boolean isLogInButtonDisplayed() {
        boolean isLogInButtonDisplayed = waitForPresenceOfElementLocated(logInButton).isDisplayed();
        logger.info("The Log In button is displayed");
        return isLogInButtonDisplayed;
    }

    public void clickLogInButton() {
        waitForPresenceOfElementLocated(logInButton).click();
        logger.info("The Log In button is clicked");
    }

    public boolean isSignUpButtonDisplayed() {
        boolean isSignUpButtonDisplayed = waitForPresenceOfElementLocated(signUpButton).isDisplayed();
        logger.info("The Sign Up button is displayed");
        return isSignUpButtonDisplayed;
    }

    public void clickLogInLinkedinButton() {
        waitForPresenceOfElementLocated(logInLinkedinButton).click();
        logger.info("The Linkedin Log In button is clicked");
    }

    public void clickUsernameLinkedinInputButton() {
        waitForPresenceOfElementLocated(usernameLinkedinInput).click();
        logger.info("The username Linkedin input is clicked");
    }

    public void enterLinkedinUsername(String username) {
        waitForPresenceOfElementLocated(usernameLinkedinInput).sendKeys(username);
        logger.info("The Linkedin username is entered");
    }

    public void clickPasswordLinkedinInputButton() {
        waitForPresenceOfElementLocated(passwordLinkedinInput).click();
        logger.info("The password Linkedin input is clicked");
    }

    public void enterLinkedinPassword(String password) {
        waitForPresenceOfElementLocated(passwordLinkedinInput).sendKeys(password);
        logger.info("The Linkedin password is entered");
    }

    public void enterLinkedinCredentials(String username, String password) {
        clickUsernameLinkedinInputButton();
        enterLinkedinUsername(username);
        clickPasswordLinkedinInputButton();
        enterLinkedinPassword(password);
    }

    public void clickSignInLinkedinButton() {
        waitForPresenceOfElementLocated(signInLinkedinButton).click();
        logger.info("The Linkedin Sign In button is clicked");
    }

    public boolean isLinkedinPasswordErrorDisplayed() {
        return waitForPresenceOfElementLocated(passwordLinkedinError).isDisplayed();
    }
}
