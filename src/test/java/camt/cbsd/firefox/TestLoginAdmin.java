package camt.cbsd.firefox;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ranate on 14/5/2560.
 */

public class TestLoginAdmin {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors =new StringBuffer();


    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver",
                this.getClass().getClassLoader().getResource("").getPath() + "/geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:4200";
    }

    @Test
    public void TestUsernameandPasswordblank() {
        driver.get(baseUrl + "/login");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        try {
            assertTrue(isElementPresent(By.linkText("Course list")));
        } catch (Error e) {

            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.linkText("Add course")));
        } catch (Error e) {

            verificationErrors.append(e.toString());
        }

        //assertTrue(isElementPresent(By.linkText("Course list")));

// ERROR: Caught exception [unknown command []]

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

