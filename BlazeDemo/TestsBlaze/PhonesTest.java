package Domaci.BlazeDemo.TestsBlaze;

import Domaci.BlazeDemo.BasePage.BasePageBlaze;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PhonesTest extends BasePageBlaze {
    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test
    public void goToPhonesPage() throws InterruptedException {
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.ispisiKategorijuTelefoni();
        System.out.println("Ukupna cena svih telefona iz kategorije je " + phonesPage.ukupnaSumaTelefona());

    }

    /*@Test
    public void goSamsung1() throws InterruptedException {
        goToPhonesPage();
        phonesPage.clickSamsung1();
    }

    @Test
    public void goSamsung2() throws InterruptedException {
        goToPhonesPage();
        phonesPage.clickSamsung2();
    }

    @Test
    public void goNokia() throws InterruptedException {
        goToPhonesPage();
        phonesPage.clickNokia();
    }

    @Test
    public void goNexus() throws InterruptedException {
        goToPhonesPage();

    }

    @Test
    public void goIphones() throws InterruptedException {
        goToPhonesPage();
        phonesPage.clickIphone();
    }

    @Test
    public void goSony() throws InterruptedException {
        goToPhonesPage();
        phonesPage.clickSony();
    }

    @Test
    public void goHTC() throws InterruptedException {
        goToPhonesPage();
        phonesPage.clickHtc();
    }*/
}
