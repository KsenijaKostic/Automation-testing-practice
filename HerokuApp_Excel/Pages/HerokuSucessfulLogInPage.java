package HerokuApp_Excel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuSucessfulLogInPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement confirmationMessage;
    WebElement subheaderMessage;
    WebElement logOutButton;


    public HerokuSucessfulLogInPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getConfirmationMessage() {
        return driver.findElement(By.id("flash"));
    }

    public WebElement getSubheaderMessage() {
        return driver.findElement(By.className("subheader"));
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.cssSelector(".button.secondary.radius"));
    }

    //---------------------------------------------------

    public String vratiPotvrdnuPorukuOLogovanju(){
        return getConfirmationMessage().getText();
    }

    public String vratiSubheaderPoruku(){
        return getSubheaderMessage().getText();
    }

    public void clickLogOut(){
        getLogOutButton().click();
    }
}
