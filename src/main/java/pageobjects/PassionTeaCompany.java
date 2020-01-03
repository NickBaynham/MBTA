package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class PassionTeaCompany {

    public static WebDriver startBrowser(WebDriver driver) {
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.practiceselenium.com/");
        return driver;
    }

    public static WebDriver welcomePage(WebDriver driver) {
        assertEquals(driver.getTitle(), "Welcome" );
        return driver;
    }
}
