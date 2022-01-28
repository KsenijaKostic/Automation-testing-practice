package Domaci.BlazeDemo.PagesBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MonitorsPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement  apple;
    WebElement  asus;
    List<WebElement> monitors;

    public MonitorsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getMonitors() {
        return driver.findElements(By.cssSelector(".col-lg-4.col-md-6.mb-4"));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getApple() throws InterruptedException {
        Thread.sleep(2000);
        WebElement apple = driver.findElement(By.linkText("Apple monitor 24"));
        apple.getText();
        return apple;
    }

    public WebElement getAsus() throws InterruptedException {
        Thread.sleep(2000);
        WebElement asus = driver.findElement(By.linkText("ASUS Full HD"));
        asus.getText();
        return asus;
    }

    //---------------------------------------------------------------------
    public void clickApple() throws InterruptedException {
        this.getApple().click();
    }

    public void clickAsus() throws InterruptedException {
        this.getAsus().click();
    }

    public void ispisiKategorijuMonitori() throws InterruptedException {
        System.out.println("Kategorija monitori ima " + this.getMonitors().size() + " stavke.");
        for (int i = 0; i < this.getMonitors().size(); i++){
            System.out.println(getMonitors().get(i).getText());
        }
    }
    public int ukupnaSumaMonitora() throws InterruptedException {
        int sumMonitors = 0;
        Thread.sleep(1000);
        for(WebElement telefon : getMonitors()){
            sumMonitors = sumMonitors + (Integer.parseInt(telefon.findElement(By.tagName("h5")).getText().substring(1)));
        }
        return sumMonitors;
    }
}
