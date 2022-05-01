package com.herokuapp.the_internet.testsuite;

import com.herokuapp.the_internet.pages.LoginPage;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String actualMessage = loginPage.getSecureAreaText();
        Assert.assertEquals(actualMessage,"Secure Area","error");
    }

    @Test
    public void verifyTheUsernameErrorMessage(){

        loginPage.enterUsername("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String actualMessage = loginPage.getInvalidUserNameText();
        Assert.assertEquals(actualMessage,"Your username is invalid!\n" +
                        "×", "error");
    }
    @Test
    public void verifyThePasswordErrorMessage() {

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String actualMessage = loginPage.getInvalidPasswordText();
        Assert.assertEquals(actualMessage, "Your password is invalid!\n" +
                "×", "error");
    }
}
