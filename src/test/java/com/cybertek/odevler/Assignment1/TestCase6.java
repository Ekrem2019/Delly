package com.cybertek.odevler.Assignment1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase6 {
    public static void main(String[] args) {
//Step 1. Go to https://practicecybertekschool.herokuapp.com
//Step 2. Click on “Registration Form”
//Step 3. Enter “user” into username input box.
//Step 4. Verify that warning message is displayed: “The username must be more than 6 and less than 30 characters long”

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a [@href='/registration_form']")).click();
        driver.findElement(By.name("username")).sendKeys("user");

        String expected = "The username must be more than 6 and less than 30 characters long";
        String actual = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/small[2]")).getText();

        if (expected.equals(actual)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.quit();



    }
}
