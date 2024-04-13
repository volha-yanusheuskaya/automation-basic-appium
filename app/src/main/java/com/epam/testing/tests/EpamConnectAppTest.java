package com.epam.testing.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.epam.testing.pages.EpamConnectLoginPage;

import org.junit.Before;
import org.junit.Test;

public class EpamConnectAppTest extends CommonConditions {

    private EpamConnectLoginPage loginPage;

    @Before
    public void openEpamConnectApp() {
        loginPage = new EpamConnectLoginPage(driver);
        loginPage.clickSkipLink();

        assertEquals(loginPage.getHeadingText(), "Welcome to EPAM Connect");
        assertTrue(loginPage.isLogInButtonDisplayed());
        assertTrue(loginPage.isSignUpButtonDisplayed());
    }

    @Test
    public void verifyLoginPage() {
        loginPage.clickLogInButton();

        loginPage.clickLogInLinkedinButton();
        loginPage.enterLinkedinCredentials("IpsumLor@gmail.com", "LoremPass1234");
        loginPage.clickSignInLinkedinButton();

        assertTrue(loginPage.isLinkedinPasswordErrorDisplayed());
    }
}
