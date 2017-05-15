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

public class TestLoginFail {
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
        driver.get(baseUrl + "/login");
        driver.get(baseUrl + "/login?source=student");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("asdasda");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("asdasdasd");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        assertEquals("Unauthorized", driver.findElement(By.cssSelector("div.alert.alert-error")).getText());



    }



}

