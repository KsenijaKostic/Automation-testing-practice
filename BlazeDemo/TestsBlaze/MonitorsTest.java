package Domaci.BlazeDemo.TestsBlaze;

import Domaci.BlazeDemo.BasePage.BasePageBlaze;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MonitorsTest extends BasePageBlaze {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test
    public void goToMonitorsPage(){
        sidebarpage.clickMonitors();
    }

    @Test
    public void goToApple() throws InterruptedException {
        goToMonitorsPage();
        monitorsPage.clickApple();
    }

    @Test
    public void goToAsus() throws InterruptedException {
        goToMonitorsPage();
        monitorsPage.clickAsus();
    }


}
