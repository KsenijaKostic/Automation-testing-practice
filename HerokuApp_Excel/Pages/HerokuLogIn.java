package HerokuApp_Excel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuLogIn {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement usernameTB;
    WebElement passwordTB;
    WebElement logInButton;
    WebElement errorMessage;

    public HerokuLogIn(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getUsernameTB() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordTB() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLogInButton() {
        return driver.findElement(By.className("radius"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.cssSelector(".flash.error"));
    }

    //------------------------------------------------

    public void inputUserName(String str){
        getUsernameTB().clear();
        getUsernameTB().sendKeys(str);
    }

    public void inputPassword(String pass){
        getPasswordTB().clear();
        getPasswordTB().sendKeys(pass);
    }

    public void clickLogIn(){
        getLogInButton().click();
    }

    public String vratiErrorMessageText(){
        return getErrorMessage().getText();
    }
}
