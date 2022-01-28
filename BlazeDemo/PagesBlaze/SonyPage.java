package Domaci.BlazeDemo.PagesBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SonyPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement addToCartButton;

    public SonyPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.cssSelector(".btn.btn-success.btn-lg"));
    }

    //------------------------------------------------------------

    public void AddSonyToCart() throws InterruptedException {
        Thread.sleep(2000);
        this.getAddToCartButton().click();
    }

    public void clickOk(){
        driver.switchTo().alert().accept();
    }
}

