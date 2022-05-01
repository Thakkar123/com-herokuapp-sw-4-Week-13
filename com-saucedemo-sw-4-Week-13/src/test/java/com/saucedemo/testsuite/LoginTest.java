package com.saucedemo.testsuite;

import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String actualMessage = inventoryPage.getProductsText();
        Assert.assertEquals(actualMessage,"PRODUCTS","error");
    }
    @Test

    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int actualProductNumber = inventoryPage.findActualNumberOfProducts();
        int expectedProductNumber = 6;
        Assert.assertEquals(actualProductNumber,expectedProductNumber, "error");
    }
}
