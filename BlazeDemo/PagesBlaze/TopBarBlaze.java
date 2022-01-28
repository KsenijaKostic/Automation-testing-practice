package Domaci.BlazeDemo.PagesBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopBarBlaze {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement home;
    WebElement contact;
    WebElement aboutUs;
    WebElement cart;
    WebElement logIn;
    WebElement signUp;


    public TopBarBlaze(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getHome() {
        return driver.findElement(By.partialLinkText("Home"));
    }

    public WebElement getContact() {
        return driver.findElement(By.linkText("Contact"));
    }

    public WebElement getAboutUs() {
        return driver.findElement(By.linkText("About us"));
    }

    public WebElement getCart() {
        return driver.findElement(By.linkText("Cart"));
    }

    public WebElement getLogIn() {
        return driver.findElement(By.id("login2"));
    }

    public WebElement getSignUp() {
        return driver.findElement(By.id("signin2"));
    }

    //-----------------------------------

    public void clickHome(){
        this.getHome().click();
    }
    public void clickContact(){
        this.getContact().click();
    }
    public void clickAboutUs(){
        this.getAboutUs().click();
    }
    public void clickCart(){
        this.getCart().click();
    }
    public void clickLogIn(){
        this.getLogIn().click();
    }
    public void clickSignUp(){
        this.getSignUp().click();
    }

}
