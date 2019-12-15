package com.cybertek.odevler.TestCases4;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Case2  extends TestBase {

    @Test
    public void test1() throws InterruptedException{
        String url = ConfigurationReader.get("url");
        driver.get(url);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Calendar Events")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//a[@title='Grid Settings']"));
        Thread.sleep(2000);
        element.click();
        Thread.sleep(2000);
        driver.findElement(By.id("column-c343")).click();
        driver.findElement(By.id("column-c344")).click();
        driver.findElement(By.id("column-c345")).click();
        driver.findElement(By.id("column-c346")).click();
        driver.findElement(By.id("column-c347")).click();
        driver.findElement(By.id("column-c348")).click();
        Thread.sleep(2000);
        WebElement title = driver.findElement(By.id("column-c342"));
        if(title.isDisplayed()){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }







    }
}
