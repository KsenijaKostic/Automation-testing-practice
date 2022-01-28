package saucedemo.SaucePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogInPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement credentials;
    WebElement pass;
    WebElement username;
    WebElement password;
    WebElement logIn;
    WebElement errorMessage;

    public LogInPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getCredentials() {
        return driver.findElement(By.id("login_credentials"));
    }

    public WebElement getPass() {
        return driver.findElement(By.className("login_password"));
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLogIn() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.cssSelector(".error-message-container.error"));
    }

    //----------------------------------------

    public void inputUsername1() {
        String a = getCredentials().getText();
        List<String> nicks = new ArrayList<>();
        String str[] = a.split("\n");
        nicks = Arrays.asList(str);
        getUsername().clear();
        getUsername().sendKeys(nicks.get(1));
    }

    public void inputUsername2() {
        String a = getCredentials().getText();
        List<String> nicks = new ArrayList<>();
        String str[] = a.split("\n");
        nicks = Arrays.asList(str);
        getUsername().clear();
        getUsername().sendKeys(nicks.get(2));
    }

    public void inputUsername3() {
        String a = getCredentials().getText();
        List<String> nicks = new ArrayList<>();
        String str[] = a.split("\n");
        nicks = Arrays.asList(str);
        getUsername().clear();
        getUsername().sendKeys(nicks.get(3));
    }

    public void inputUsername4() {
        String a = getCredentials().getText();
        List<String> nicks = new ArrayList<>();
        String str[] = a.split("\n");
        nicks = Arrays.asList(str);
        getUsername().clear();
        getUsername().sendKeys(nicks.get(4));
    }

    public void inputPassword() {
        String a = getPass().getText();
        List<String> pass = new ArrayList<>();
        String str[] = a.split("\n");
        pass = Arrays.asList(str);

        getPassword().clear();
        getPassword().sendKeys(pass.get(1));
    }

    public void clickLogin() {
        this.getLogIn().click();
    }

    public String errorMesage() {
        return this.getErrorMessage().getText();
    }
}
