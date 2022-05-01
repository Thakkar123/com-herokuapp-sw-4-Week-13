package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

By usernameField = By.id("user-name");
By passwordField = By.id("password");
By loginButtonField = By.xpath("//input[@id='login-button']");


    public void enterUsername(String username)
    {
        sendTextToElement(usernameField,username);
    }

    public void enterPassword(String password)
    {
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginButtonField);
    }


}
