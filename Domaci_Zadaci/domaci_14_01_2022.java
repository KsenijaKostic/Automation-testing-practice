package Domaci.Domaci_Zadaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class domaci_14_01_2022 {
    //Ulogovati se na sajt https://demoqa.com/ preko kolacica, izlogovati se i asertovati da je korisnik izlogovan

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/login");

        Cookie kolacic3 = new Cookie("userID", "568b636c-0f3b-4111-be45-dfdea70dcb44");
        driver.manage().addCookie(kolacic3);
        driver.navigate().refresh();

        Cookie kolacic4 = new Cookie("expires", "2022-01-22T14%3A07%3A56.249Z");
        driver.manage().addCookie(kolacic4);
        driver.navigate().refresh();

        Cookie kolacic5 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImtzZW5pamEiLCJwYXNzd29yZCI6IlF3ZXJ0eTEyMyEiLCJpYXQiOjE2NDIyNTU2NzZ9.PT8H8KKG5OVKLLDfZ1Hl37upje_2hPpS8z5VqnXeO9I");
        driver.manage().addCookie(kolacic5);
        driver.navigate().refresh();

        WebElement profile = driver.findElement(By.linkText("profile"));
        profile.click();

        WebElement logOut = driver.findElement(By.id("submit"));
        logOut.click();

        //ovde proveravam da li postoji dugme za kreiranje novog korisnika koje je jedinstveno za pocetnu stranicu
        Assert.assertTrue(driver.findElement(By.id("newUser")).isDisplayed());

        //ovde dodatno proveram da li postoji polje za unosenje passworda koje je jedinstveno za slucaj kada korisnik nije ulogovan
        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());

    }
}
