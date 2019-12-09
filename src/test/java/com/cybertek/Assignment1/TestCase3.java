package com.cybertek.Assignment1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase3 {
//    Step 1. Go to https://practicecybertekschool.herokuapp.com
//    Step 2. Click on “Multiple Buttons”
//    Step 3. Click on “Button 1”
//    Verify that result message is displayed: “Clicked on button one!”

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a [@href='/multiple_buttons']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        String expected = "Clicked on button one!";
        String actual = driver.findElement(By.xpath("//p[@id='result']")).getText();

        if (expected.equals(actual)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        Thread.sleep(3000);
driver.quit();

    }
}