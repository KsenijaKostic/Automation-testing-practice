package saucedemo.SaucePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement products;
    WebElement cart;

    public InventoryPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getProducts() {
        return driver.findElement(By.className("title"));
    }

    public WebElement getCart() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    //--------------------------------------------------

    public String textProducts() {
        return this.getProducts().getText();
    }

}
