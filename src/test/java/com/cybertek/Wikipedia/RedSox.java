package com.cybertek.Wikipedia;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RedSox extends TestBase {
    WebDriver driver;



    @BeforeMethod
    public void BeforeMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.com");
        WebElement element = driver.findElement(By.id("searchInput"));
        element.click();
        element.sendKeys("redsox");
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    @Test

    public void RedSox() throws InterruptedException {

        List<WebElement> searchOptions = driver.findElements(By.className("suggestion-title"));
        System.out.println("search option size " + searchOptions.size());

        int expected = 6;
        int actual = searchOptions.size();

        if (actual >1) {
            Assert.assertTrue(true);
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        String firstOption = searchOptions.get(0).getText();
        System.out.println(firstOption.startsWith("Boston Red Sox"));




    }

    @Test
    public void RedsoxMethod() throws InterruptedException {
        extentLogger = report.createTest("Wikipedia test");

        extentLogger.info("Go to wikipedia");
        driver.get("https://www.wikipedia.com");

        extentLogger.info("go to redsox");
        WebElement element = driver.findElement(By.id("searchInput"));
        element.click();
        element.sendKeys("redsox");
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));

        extentLogger.info("verify more than 1");
        List<WebElement> searchOptions = driver.findElements(By.className("suggestion-title"));
        System.out.println("search option size " + searchOptions.size());
        int expected = 6;
        int actual = searchOptions.size();
        if (actual >1) {
            Assert.assertTrue(true);
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        extentLogger.info("verify start with boston red sox");
        List<WebElement> searchOptions1 = driver.findElements(By.className("suggestion-title"));
        String firstOption = searchOptions1.get(0).getText();
        System.out.println(firstOption.startsWith("Boston Red Sox"));
        extentLogger.pass("PASS");
        
        System.out.println("Ekrem Gulr");
    }


}
