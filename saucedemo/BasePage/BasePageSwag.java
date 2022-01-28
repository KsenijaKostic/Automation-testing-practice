package saucedemo.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import saucedemo.SaucePages.InventoryPage;
import saucedemo.SaucePages.LogInPage;

import java.time.Duration;

public class BasePageSwag {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public LogInPage logInPage;
    public InventoryPage inventoryPage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        logInPage = new LogInPage(driver, wdwait);
        inventoryPage = new InventoryPage(driver, wdwait);
    }

    @AfterClass
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
