package Domaci.BlazeDemo.PagesBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SideBarBlaze {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement phones;
    WebElement laptops;
    WebElement monitors;


    public SideBarBlaze(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getPhones() {
        return driver.findElement(By.linkText("Phones"));
    }

    public WebElement getLaptops() {
        return driver.findElement(By.linkText("Laptops"));
    }

    public WebElement getMonitors() {
        return driver.findElement(By.linkText("Monitors"));
    }

    //--------------------------------------------

    public void clickPhones(){
        this.getPhones().click();
    }

    public void clickLaptops(){
        this.getLaptops().click();
    }

    public void clickMonitors(){
        this.getMonitors().click();
    }
}
