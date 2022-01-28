package Domaci.BlazeDemo.PagesBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LaptopsPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement sonyVayoI5;
    WebElement sonyVayoI7;
    WebElement macBookAir;
    WebElement dellI78gb;
    WebElement dellInch;
    WebElement macBookPro;
    List<WebElement> laptops;

    public LaptopsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getLaptops() {
        return driver.findElements(By.cssSelector(".col-lg-4.col-md-6.mb-4"));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getSonyVayoI5() throws InterruptedException {
        Thread.sleep(2000);
        WebElement sony1 = driver.findElement(By.linkText("Sony vaio i5"));
        sony1.getText();
        return sony1;
    }

    public WebElement getSonyVayoI7() throws InterruptedException {
        Thread.sleep(2000);
        WebElement sony2 = driver.findElement(By.linkText("Sony vaio i7"));
        sony2.getText();
        return sony2;
    }

    public WebElement getMacBookAir() throws InterruptedException {
        Thread.sleep(2000);
        WebElement macB = driver.findElement(By.linkText("MacBook air"));
        macB.getText();
        return macB;
    }

    public WebElement getDellI78gb() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(250,350)");
        Thread.sleep(2000);
        WebElement dell1 = driver.findElement(By.linkText("Dell i7 8gb"));
        dell1.getText();
        return dell1;
    }

    public WebElement getDellInch() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(250,350)");
        Thread.sleep(2000);
        WebElement dell2 = driver.findElement(By.linkText("2017 Dell 15.6 Inch"));
        dell2.getText();
        return dell2;
    }

    public WebElement getMacBookPro() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(250,350)");
        Thread.sleep(2000);
        WebElement macP = driver.findElement(By.linkText("MacBook Pro"));
        return macP;
    }

    //-----------------------------------------------------------------------------

    public void clickSonyVayoI5() throws InterruptedException {
        this.getSonyVayoI5().click();
    }
    public void clickSonyVayoI7() throws InterruptedException {
        this.getSonyVayoI7().click();
    }
    public void clickMacBookAir() throws InterruptedException {
        this.getMacBookAir().click();
    }
    public void clickDellI78gb() throws InterruptedException {
        this.getDellI78gb().click();
    }
    public void clickDellInch() throws InterruptedException {
        this.getDellInch().click();
    }
    public void clickMacBookPro() throws InterruptedException {
        this.getMacBookPro().click();
    }

    public void ispisiKategorijuLaptops() {
        System.out.println("Kategorija laptopovi ima " + this.getLaptops().size() + " stavki.");
        for (int i = 0; i < this.getLaptops().size(); i++){
            System.out.println(getLaptops().get(i).getText());
        }
    }

    public int ukupnaSumaLaptopova() throws InterruptedException {
        int sumLaptops = 0;
        Thread.sleep(1000);
        for(WebElement telefon : getLaptops()){
            sumLaptops = sumLaptops + (Integer.parseInt(telefon.findElement(By.tagName("h5")).getText().substring(1)));
        }
        return sumLaptops;
    }
}
