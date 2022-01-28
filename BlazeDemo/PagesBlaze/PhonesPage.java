package Domaci.BlazeDemo.PagesBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PhonesPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement samsung1;
    WebElement nokia;
    WebElement nexus;
    WebElement samsung2;
    WebElement iphone;
    WebElement sony;
    WebElement htc;
    List<WebElement> phones;


    public PhonesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getPhones(){
        List<WebElement> telefoni = driver.findElements(By.cssSelector(".col-lg-4.col-md-6.mb-4"));
        return telefoni;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getSamsung1() throws InterruptedException {
        Thread.sleep(2000);
        WebElement samsung1 = driver.findElement(By.linkText("Samsung galaxy s6"));
       // wdwait.until(ExpectedConditions.textToBePresentInElement(samsung1, "Samsung galaxy s6")); ovo sam probala, i u nekim slucajevima radi, u nekim slucajevima ne radi.
        //kada pustim da se svih 7 telefona za redom u posebnim testovima klikne, 5 testova prodje, 2 padnu, sl put 6 testova prodje 1 padne, u sledecem 4 prodje 3 padnu. volela bih da imam objasnjenje za ovo ali nemam
        //pa sam odlucila da ostavim thred.sleep, jer sa tim radi, pa ako dodjem do boljeg resenje koje stvarno radi promenicu
        samsung1.getText();
        return samsung1;
    }

    public WebElement getNokia() throws InterruptedException {
        Thread.sleep(2000);
        WebElement nokia = driver.findElement(By.linkText("Nokia lumia 1520"));
       // wdwait.until(ExpectedConditions.textToBePresentInElement(nokia, "Nokia lumia 1520"));
        nokia.getText();
        return nokia;
    }

    public WebElement getNexus() throws InterruptedException {
        Thread.sleep(2000);
        WebElement nexus = driver.findElement(By.linkText("Nexus 6"));
        //wdwait.until(ExpectedConditions.textToBePresentInElement(nexus, "Nexus 6"));
        nexus.getText();
        return nexus;
    }

    public WebElement getSamsung2() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(250,350)");
        Thread.sleep(2000);
        WebElement samsung2 = driver.findElement(By.linkText("Samsung galaxy s7"));
        //wdwait.until(ExpectedConditions.textToBePresentInElement(samsung2, "Samsung galaxy s7"));
        samsung2.getText();
        return samsung2;
    }

    public WebElement getIphone() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(250,350)");
        Thread.sleep(2000);
        WebElement iphone = driver.findElement(By.linkText("Iphone 6 32gb"));
        //wdwait.until(ExpectedConditions.textToBePresentInElement(iphone, "Iphone 6 32gb"));
        iphone.getText();
        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", iphone); //probala sam sa ovim ali nije radilo pa sam dosla do drugog resenja sa scrollom
        return iphone;
    }

    public WebElement getSony() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(250,350)");
        Thread.sleep(2000);
        WebElement sony = driver.findElement(By.linkText("Sony xperia z5"));
       // wdwait.until(ExpectedConditions.textToBePresentInElement(sony, "Sony xperia z5"));
        sony.getText();
        return sony;
    }

    public WebElement getHtc() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(350,450)");
        Thread.sleep(2000);
        WebElement htc = driver.findElement(By.linkText("HTC One M9"));
        //wdwait.until(ExpectedConditions.textToBePresentInElement(htc, "HTC One M9"));
        htc.getText();
        return htc;
    }

    //-------------------------------------------------------------------------

    public void clickSamsung1() throws InterruptedException {
        this.getSamsung1().click();
    }

    public void clickNokia() throws InterruptedException {
        this.getNokia().click();
    }

    public void clickNexus() throws InterruptedException {
        this.getNexus().click();
    }

    public void clickSamsung2() throws InterruptedException {
        this.getSamsung2().click();
    }

    public void clickIphone() throws InterruptedException {
        this.getIphone().click();
    }

    public void clickSony() throws InterruptedException {
        this.getSony().click();
    }

    public void clickHtc() throws InterruptedException {
        this.getHtc().click();
    }

    public void ispisiKategorijuTelefoni() throws InterruptedException {
        System.out.println("Kategorija telefoni ima " + this.getPhones().size() + " stavki.");
        for (int i = 0; i < this.getPhones().size(); i++){
            System.out.println(getPhones().get(i).getText());
        }
    }

    public int ukupnaSumaTelefona() throws InterruptedException {
        int sumPhones = 0;
        Thread.sleep(1000);
        for(WebElement telefon : getPhones()){
            sumPhones = sumPhones + (Integer.parseInt(telefon.findElement(By.tagName("h5")).getText().substring(1)));
        }
        return sumPhones;
    }
}
