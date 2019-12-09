package com.cybertek.Rahle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByIdByNameByLinkText {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\egule\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        Thread.sleep(2000);
  //      driver.findElement(By.className("_56bg _4u9z _5ruq")).sendKeys("hello");
//        driver.findElement(By.id("email")).sendKeys("This is my first code");
//        Thread.sleep(2000);
//        driver.findElement(By.name("pass")).sendKeys("123456");
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Forgot account?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("emailadres");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
        driver.quit();




    }
}
