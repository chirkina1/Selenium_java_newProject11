package selenium;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

    WebDriver drv;

    @BeforeEach
    void setUp() {
        //WebDriverManager.chromedriver().setup();
        drv = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {

        drv.quit();
    }

    @Test
    void name() {

        drv.get("http://google.com");
        drv.findElement(By.name("q")).sendKeys("Test" + Keys.ENTER);
    }
}
