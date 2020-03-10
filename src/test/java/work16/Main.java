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

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    private WebDriver webDriver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }
    @Test
    public void savkk() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://savkk.github.io/selenium-practice/ ");
        WebElement input = webDriver.findElement(By.id("button"));
        input.click();
        WebElement clickMe = webDriver.findElement(By.id("first"));
        clickMe.click();
        String excellent = webDriver.findElement(By.xpath("//label[.=\"Excellent!\"]")).getText();
        Assert.assertEquals("Excellent!", excellent);


    }

    @After
    public void driverOut() {
        webDriver.quit();
    }
}
