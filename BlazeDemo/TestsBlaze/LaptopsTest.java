package Domaci.BlazeDemo.TestsBlaze;

import Domaci.BlazeDemo.BasePage.BasePageBlaze;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaptopsTest extends BasePageBlaze {
    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test
    public void goToLaptopsPage() throws InterruptedException {
        sidebarpage.clickLaptops();
        Thread.sleep(2000);
        laptopsPage.ispisiKategorijuLaptops();
        System.out.println("Ukupna cena svih laptopova iz kategorije je " + laptopsPage.ukupnaSumaLaptopova());
    }
    @Test
    public void goToSonyVayoI5() throws InterruptedException{
        goToLaptopsPage();
        laptopsPage.clickSonyVayoI5();
    }
    @Test
    public void goToSonyVayoI7() throws InterruptedException{
        goToLaptopsPage();
        laptopsPage.clickSonyVayoI7();
    }
    @Test
    public void goToMacBookAir() throws InterruptedException{
        goToLaptopsPage();
        laptopsPage.clickMacBookAir();
    }
    @Test
    public void goToDellI78gb() throws InterruptedException{
        goToLaptopsPage();
        laptopsPage.clickDellI78gb();
    }
    @Test
    public void goToDellInch() throws InterruptedException{
        goToLaptopsPage();
        laptopsPage.clickDellInch();
    }
    @Test
    public void goToMacBookPro() throws InterruptedException{
        goToLaptopsPage();
        laptopsPage.clickMacBookPro();
    }

}
