package Domaci.Domaci_Zadaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class domaci_18_01_2022 {
    public static void main(String[] args) throws InterruptedException {
        //Vas domaci zadatak je da otvorite pretrazivac, odete na youtube i pustite Rick Astley-a

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input")).sendKeys("Rick Astley");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(2000);

        WebElement naslov = driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Official Music Video)"));
        naslov.getText();
        naslov.click();


    }
}
