package saucedemo.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import saucedemo.BasePage.BasePageSwag;

public class testSwag extends BasePageSwag {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void verifyThatUserCanLogInWithFirstUsername() {
        logInPage.inputUsername1();
        logInPage.inputPassword();
        logInPage.clickLogin();

        String expectedText = "PRODUCTS";
        String actualText = inventoryPage.textProducts();

        Assert.assertEquals(actualText, expectedText);
        Assert.assertTrue(inventoryPage.getCart().isDisplayed());
    }

    @Test
    public void verifyThatUserCanNotLogInWithSecondUsername() {
        logInPage.inputUsername2();
        logInPage.inputPassword();
        logInPage.clickLogin();

        String expectedMessage = "Epic sadface: Sorry, this user has been locked out.";
        String actualMessage = logInPage.errorMesage();
        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(logInPage.getLogIn().isDisplayed());
    }

    @Test
    public void verifyThatUserCanLogInWithThirdUsername() {
        logInPage.inputUsername3();
        logInPage.inputPassword();
        logInPage.clickLogin();

        String expectedText = "PRODUCTS";
        String actualText = inventoryPage.textProducts();

        Assert.assertEquals(actualText, expectedText);
        Assert.assertTrue(inventoryPage.getCart().isDisplayed());
    }

    @Test
    public void verifyThatUserCanLogInWithFourthUsername() {
        logInPage.inputUsername4();
        logInPage.inputPassword();
        logInPage.clickLogin();

        String expectedText = "PRODUCTS";
        String actualText = inventoryPage.textProducts();

        Assert.assertEquals(actualText, expectedText);
        Assert.assertTrue(inventoryPage.getCart().isDisplayed());
    }
}
