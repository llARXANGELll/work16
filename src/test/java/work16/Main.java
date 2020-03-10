package work16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    private WebDriver webDriver;

    @Before
    public void setup(){
        WebDriverManager.edgedriver().setup();;
        webDriver = new EdgeDriver();
    }
    @Test
    public void savkk() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://savkk.github.io/selenium-practice/ ");
        WebElement input = webDriver.findElement(By.id("button"));
        input.click();
        WebElement clickMe = webDriver.findElement(By.id("first"));
        clickMe.click();
        webDriver.findElement(By.linkText("Excellent!")).getSize();
//        Assert.assertEquals(webDriver.get(By.linkText("//label[.=\"Excellent!\"]")));

    }

    @After
    public void driverOut() {
        webDriver.quit();
    }
}
