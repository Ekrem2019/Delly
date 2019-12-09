package com.cybertek.Rahle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClassName {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\egule\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("reg_form_1-UserFirstName")).sendKeys("hello");
        driver.findElement(By.name("UserLastName")).sendKeys("123456");

    }
}
