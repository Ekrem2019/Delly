package com.cybertek.odevler.TestCases4;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Case4 extends TestBase {
    @Test
    public void test1() throws  InterruptedException {
        String url = ConfigurationReader.get("url");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Calendar Events")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Create Calendar event']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='container']/form/div/div/div/div[2]/div/div[2]/a")).click();
        Thread.sleep(2000);
        WebElement all = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div/div/div/div/div/div/h1"));
        System.out.println(all.getText());
        Assert.assertTrue(all.isDisplayed());




    }}