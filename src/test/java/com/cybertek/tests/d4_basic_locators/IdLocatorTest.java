package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement element = driver.findElement(By.id("disappearing_button"));
        Thread.sleep(2000);

        String txt = element.getText();
        System.out.println("txt = " + txt);
        Thread.sleep(2000);

        element.click();
        Thread.sleep(2000);

        driver.quit();

    }

}
