package Domaci.BlazeDemo.BasePage;

import Domaci.BlazeDemo.PagesBlaze.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePageBlaze {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public SideBarBlaze sidebarpage;
    public PhonesPage phonesPage;
    public LaptopsPage laptopsPage;
    public MonitorsPage monitorsPage;
    public MonitorAsusPage asusPage;
    public Samsung1Page samsung1Page;
    public NexusPage nexusPage;
    public TopBarBlaze topBarBlaze;
    public CartPage cartPage;
    public NokiaPage nokiaPage;
    public SonyPage sonyPage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        sidebarpage = new SideBarBlaze(driver, wdwait);
        phonesPage = new PhonesPage(driver, wdwait);
        laptopsPage = new LaptopsPage(driver, wdwait);
        monitorsPage = new MonitorsPage(driver, wdwait);
        asusPage = new MonitorAsusPage(driver, wdwait);
        samsung1Page = new Samsung1Page(driver, wdwait);
        nexusPage = new NexusPage(driver, wdwait);
        topBarBlaze = new TopBarBlaze(driver, wdwait);
        cartPage = new CartPage(driver, wdwait);
        nokiaPage = new NokiaPage(driver, wdwait);
        sonyPage = new SonyPage(driver, wdwait);
    }
    @AfterClass
    public void tearDown() {
       /* driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();*/
    }
}
