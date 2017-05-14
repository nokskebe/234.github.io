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

public class TestPasswordBlank {
    private WebDriver driver;
    private String baseUrl;



    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver",
                this.getClass().getClassLoader().getResource("").getPath() + "/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://localhost:4200";
    }

    @Test
    public void TestUsernameandPasswordblank() {
        driver.get(baseUrl + "/login");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("qweqwe");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        assertEquals("Password is required", driver.findElement(By.cssSelector("span.help-block")).getText());

    }



}

