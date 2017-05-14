package camt.cbsd.systemtest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ranate on 14/5/2560.
 */

public class TestLoginpage {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver",
                this.getClass().getClassLoader().getResource("").getPath() + "/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://localhost:4200";
    }

    @Test
    public void loginPageTest() {
        driver.get(baseUrl+"/login");
        try {
            assertEquals("List", driver.findElement(By.linkText("List")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.linkText("View")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("View", driver.findElement(By.linkText("View")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.linkText("List")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

    }
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
