package com.cybertek.tests.d9;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrames {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public  void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1()  {
        driver.get("http://practice.cybertekschool.com/iframe");


        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("hello000000000");
        driver.switchTo().defaultContent();

        driver.switchTo().parentFrame();
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("tinymce")).sendKeys("hello000000000");
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("next text");


    }

    @Test
    public  void manyFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        System.out.println(driver.getTitle());
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-right");



    }




}
