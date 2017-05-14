package camt.cbsd;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

/**
 * Created by goes__000 on 5/14/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSystemlink {
    @Test
    public void Testlink() {
        System.setProperty("webdriver.gecko.driver",
                this.getClass().getClassLoader().getResource("").getPath() + "/geckodriver.exe"
        );

        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://localhost:4200/";


        driver.get(baseUrl + "/logins");
        assertEquals("The resource you have asked is not in the server", driver.findElement(By.cssSelector("h2")).getText());

    }
}
