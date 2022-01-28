package Domaci.BlazeDemo.PagesBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement placeOrder;
    List<WebElement> tableOfOrders;
    WebElement delete;

    public CartPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getPlaceOrder() {
        return driver.findElement(By.cssSelector(".btn.btn-success"));
    }

    public List<WebElement> getTableOfOrders() {
        return driver.findElements(By.id("tbodyid"));
    }

    public WebElement getDelete() {
        return driver.findElement(By.linkText("Delete"));
    }
//---------------------------------------------------

    public String textDelete(){
        return getDelete().getText();
    }

}
