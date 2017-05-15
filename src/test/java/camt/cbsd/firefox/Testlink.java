package camt.cbsd.firefox;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ranate on 14/5/2560.
 */

public class Testlink {
    private WebDriver driver;
    private String baseUrl;


    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver",
                this.getClass().getClassLoader().getResource("").getPath() + "/geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:4200";
    }

    @Test
    public void loginPageLink() {
        driver.get(baseUrl + "/logins");
        assertEquals("The resource you have asked is not in the server", driver.findElement(By.cssSelector("h2")).getText());

    }



}

