package HerokuApp_Excel;

import HerokuApp_Excel.HerokuBasePage.HerokuBasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGeneral extends HerokuBasePage {

    @BeforeMethod
    public void PageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);

    }

    @Test(priority = 10)
    public void inputValidCredentialsAndLogIN() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        herokuLogIn.inputUserName(validUsername);

        String validPassword = excelReader.getStringData("Login", 1, 1);
        herokuLogIn.inputPassword(validPassword);

        herokuLogIn.clickLogIn();

        String actualMessage = herokuSucessfulLogInPage.vratiPotvrdnuPorukuOLogovanju();
        String expectedMessage = excelReader.getStringData("Message", 1, 0);

        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(herokuSucessfulLogInPage.getConfirmationMessage().isDisplayed());
        Assert.assertTrue(herokuSucessfulLogInPage.getLogOutButton().isDisplayed());

        herokuSucessfulLogInPage.clickLogOut();
    }

    @Test(priority = 20)
    public void inputInvalidUserNameAndValidPassword() {
        String invalidUsername = excelReader.getStringData("Login", 1, 2);
        herokuLogIn.inputUserName(invalidUsername);

        String validPassword = excelReader.getStringData("Login", 1, 1);
        herokuLogIn.inputPassword(validPassword);
        herokuLogIn.clickLogIn();

        String actualErrMessage = herokuLogIn.vratiErrorMessageText();
        String expectedErrMessage = excelReader.getStringData("Message", 1, 1);

        Assert.assertEquals(actualErrMessage, expectedErrMessage);
        Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());
    }

    @Test(priority = 30)
    public void inputValidUserNameAndInvalidPassword() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        herokuLogIn.inputUserName(validUsername);

        String invalidPassword = excelReader.getStringData("Login", 1, 3);
        herokuLogIn.inputPassword(invalidPassword);
        herokuLogIn.clickLogIn();

        String actualErrMessage = herokuLogIn.vratiErrorMessageText();
        String expectedErrMessage = excelReader.getStringData("Message", 1, 2);

        Assert.assertEquals(actualErrMessage, expectedErrMessage);
        Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());
    }

    @Test(priority = 40)
    public void inputPasswordAndClickLogInButton() {
        String invalidPassword = excelReader.getStringData("Login", 1, 3);
        herokuLogIn.inputPassword(invalidPassword);
        herokuLogIn.clickLogIn();

        String actualErrMessage = herokuLogIn.vratiErrorMessageText();
        String expectedErrMessage = excelReader.getStringData("Message", 1, 1);

        Assert.assertEquals(actualErrMessage, expectedErrMessage);
        Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());
    }

    @Test(priority = 50)
    public void inputInvalidUsername5Times(){
        String invalidUsername1 = excelReader.getStringData("Login", 1, 2);
        herokuLogIn.inputUserName(invalidUsername1);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        herokuLogIn.inputPassword(validPassword);
        herokuLogIn.clickLogIn();

        waitVisibility(herokuLogIn.getErrorMessage());
        String actualErrMessage = herokuLogIn.vratiErrorMessageText();
        String expectedErrMessage = excelReader.getStringData("Message", 1, 1);
        Assert.assertEquals(actualErrMessage, expectedErrMessage);
        Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());

        String invalidUsername2 = excelReader.getStringData("Login", 2, 2);
        herokuLogIn.inputUserName(invalidUsername2);
        herokuLogIn.inputPassword(validPassword);
        herokuLogIn.clickLogIn();
        waitVisibility(herokuLogIn.getErrorMessage());
        Assert.assertEquals(actualErrMessage, expectedErrMessage);
        Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());

        String invalidUsername3 = excelReader.getStringData("Login", 3, 2);
        herokuLogIn.inputUserName(invalidUsername3);
        herokuLogIn.inputPassword(validPassword);

        herokuLogIn.clickLogIn();
        waitVisibility(herokuLogIn.getErrorMessage());
        Assert.assertEquals(actualErrMessage, expectedErrMessage);
        Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());

        String invalidUsername4 = excelReader.getStringData("Login", 4, 2);
        herokuLogIn.inputUserName(invalidUsername4);
        herokuLogIn.inputPassword(validPassword);

        herokuLogIn.clickLogIn();
        waitVisibility(herokuLogIn.getErrorMessage());
        Assert.assertEquals(actualErrMessage, expectedErrMessage);
        Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());

        String invalidUsername5 = excelReader.getStringData("Login", 5, 2);
        herokuLogIn.inputUserName(invalidUsername5);
        herokuLogIn.inputPassword(validPassword);

        herokuLogIn.clickLogIn();
        waitVisibility(herokuLogIn.getErrorMessage());
        Assert.assertEquals(actualErrMessage, expectedErrMessage);
        Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());
    }

    @Test
    public void userCanNotLogInWithInvalidPassAndUsername(){
        for (int i = 1; i <= excelReader.getLastRow("Login"); i++){
            String invalidUsername1 = excelReader.getStringData("Login", i, 2);
            String invalidPassword = excelReader.getStringData("Login", i, 3);

            herokuLogIn.inputUserName(invalidUsername1);
            herokuLogIn.inputPassword(invalidPassword);
            herokuLogIn.clickLogIn();
            Assert.assertTrue(herokuLogIn.getErrorMessage().isDisplayed());
        }

    }

}
