package Domaci.BlazeDemo.TestsBlaze;

import Domaci.BlazeDemo.BasePage.BasePageBlaze;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPageBlaze extends BasePageBlaze {


    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test
    public void goToPhonesPage() throws InterruptedException {
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.ispisiKategorijuTelefoni();
        System.out.println("Ukupna cena svih telefona iz kategorije je " + phonesPage.ukupnaSumaTelefona());

        String actualString = phonesPage.getSamsung1().getText();
        String expectedString = "Samsung galaxy s6";
        Assert.assertEquals(actualString, expectedString);
    }

    @Test
    public void goToLaptopsPage() throws InterruptedException {
        sidebarpage.clickLaptops();
        Thread.sleep(2000);
        laptopsPage.ispisiKategorijuLaptops();
        System.out.println("Ukupna cena svih laptopova iz kategorije je " + laptopsPage.ukupnaSumaLaptopova());

        String actualString = laptopsPage.getSonyVayoI5().getText();
        String expectedString = "Sony vaio i5";
        Assert.assertEquals(actualString, expectedString);
    }

    @Test
    public void goToMonitorsPage() throws InterruptedException {
        sidebarpage.clickMonitors();
        Thread.sleep(2000);
        monitorsPage.ispisiKategorijuMonitori();
        System.out.println("Ukupna cena svih monitora iz kategorije je " + monitorsPage.ukupnaSumaMonitora());

        String actualString = monitorsPage.getAsus().getText();
        String expectedString = "ASUS Full HD";
        Assert.assertEquals(actualString, expectedString);
    }

    @Test
    public void addThreeItemsToCart() throws InterruptedException {
        sidebarpage.clickMonitors();
        monitorsPage.clickAsus();
        asusPage.AddAsusToCart();
        Thread.sleep(2000);
        asusPage.clickOk();

        topBarBlaze.clickHome();
        Thread.sleep(2000);
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.clickSamsung1();
        samsung1Page.AddSamsung1ToCart();
        Thread.sleep(2000);
        samsung1Page.clickOk();

        topBarBlaze.clickHome();
        Thread.sleep(2000);
        sidebarpage.clickPhones();
        phonesPage.clickNexus();
        nexusPage.AddNexusToCart();
        Thread.sleep(2000);
        nexusPage.clickOk();

        topBarBlaze.clickCart();
        Thread.sleep(2000);

        String actualText = cartPage.textDelete();
        String expectedText = "Delete";

        Assert.assertTrue(cartPage.getPlaceOrder().isDisplayed());
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void addThreePhonesToCart() throws InterruptedException {
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.clickSamsung1();
        samsung1Page.AddSamsung1ToCart();
        Thread.sleep(2000);
        samsung1Page.clickOk();

        topBarBlaze.clickHome();
        Thread.sleep(2000);
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.clickSamsung1();
        samsung1Page.AddSamsung1ToCart();
        Thread.sleep(2000);
        samsung1Page.clickOk();

        topBarBlaze.clickHome();
        Thread.sleep(2000);
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.clickSamsung1();
        samsung1Page.AddSamsung1ToCart();
        Thread.sleep(2000);
        samsung1Page.clickOk();

        topBarBlaze.clickCart();
        Thread.sleep(2000);

        String actualText = cartPage.textDelete();
        String expectedText = "Delete";

        Assert.assertTrue(cartPage.getPlaceOrder().isDisplayed());
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void addThreeDifferentPhonesToCart() throws InterruptedException {
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.clickSamsung1();
        samsung1Page.AddSamsung1ToCart();
        Thread.sleep(2000);
        samsung1Page.clickOk();

        topBarBlaze.clickHome();
        Thread.sleep(2000);
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.clickNokia();
        nokiaPage.AddNokiaToCart();
        Thread.sleep(2000);
        nokiaPage.clickOk();

        topBarBlaze.clickHome();
        Thread.sleep(2000);
        sidebarpage.clickPhones();
        Thread.sleep(2000);
        phonesPage.clickSony();
        sonyPage.AddSonyToCart();
        Thread.sleep(2000);
        sonyPage.clickOk();

        topBarBlaze.clickCart();
        Thread.sleep(2000);

        String actualText = cartPage.textDelete();
        String expectedText = "Delete";

        Assert.assertTrue(cartPage.getPlaceOrder().isDisplayed());
        Assert.assertEquals(actualText, expectedText);

    }

}
