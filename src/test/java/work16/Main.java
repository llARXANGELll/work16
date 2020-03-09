package work16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    private WebDriver webDriver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }
    @Test
    public void yandexx() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://yandex.com/ncr");
        WebElement input = webDriver.findElement(By.name("text"));
        input.sendKeys("руддщ цкщдв", Keys.ENTER);
        webDriver.findElement(By.xpath("//div[.=\"Hello, world!\"]"));

    }

    @After
    public void driverOut() {
        webDriver.quit();
    }
}
