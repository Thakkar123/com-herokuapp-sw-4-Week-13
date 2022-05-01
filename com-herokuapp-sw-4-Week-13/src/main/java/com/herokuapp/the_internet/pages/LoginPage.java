package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

By usernameField = (By.id("username"));
By passwordField = (By.id("password"));
By loginButton = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
By secureareaText = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
By invalidUserNameText = By.xpath("//div[@id='flash']");
By invalidPasswordText = By.xpath("//div[@id='flash']");

    public void enterUsername(String email)
    {
        sendTextToElement(usernameField,email);
    }

    public void enterPassword(String password)
    {
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }
    public String getSecureAreaText(){
        return getTextFromElement(secureareaText);

    }
    public String getInvalidUserNameText(){
        return getTextFromElement(invalidUserNameText);
    }

    public String getInvalidPasswordText(){
        return getTextFromElement(invalidPasswordText);
    }
}
