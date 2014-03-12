package functional.hellotwu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class HelloMessageJourneyTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        this.driver = new FirefoxDriver();
    }

    @Test
    public void shouldDisplayHelloTWUMessage() {
        this.driver.get("http://localhost:8080/");

        final String message = this.driver.findElement(By.tagName("h1")).getText();

        assertEquals("Hello TWU!!", message);
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

}
