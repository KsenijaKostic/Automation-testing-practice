package HerokuApp_Excel.HerokuBasePage;

import HerokuApp_Excel.Pages.HerokuLogIn;
import HerokuApp_Excel.Pages.HerokuSucessfulLogInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class HerokuBasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homeURL;
    public HerokuLogIn herokuLogIn;
    public HerokuSucessfulLogInPage herokuSucessfulLogInPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("C:\\Users\\Xenia\\IdeaProjects\\SeleniumProjekat\\src\\test\\java\\HerokuApp_Excel\\TestBook.xlsx");
        homeURL = excelReader.getStringData("URL", 1, 0);
        herokuLogIn = new HerokuLogIn(driver, wdwait);
        herokuSucessfulLogInPage = new HerokuSucessfulLogInPage(driver, wdwait);
    }

    public void waitVisibility(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitClicability(WebElement element){
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @AfterClass
    public void tearDown() {
       /* driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();*/
    }

}
