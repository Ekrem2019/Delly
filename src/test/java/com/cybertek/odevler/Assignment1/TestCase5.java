package com.cybertek.odevler.Assignment1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase5 {
    public static void main(String[] args) {
//Step 1. Go to https://practicecybertekschool.herokuapp.com
//Step 2. Click on “Registration Form”
//Step 3. Enter “123” into last name input box.
//Step 4. Verify that warning message is displayed: “The last name can only consist of alphabetical letters and dash”

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a [@href='/registration_form']")).click();
        driver.findElement(By.name("lastname")).sendKeys("123");

        String expected = "The last name can only consist of alphabetical letters and dash";
        String actual = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[3]")).getText();

        if (expected.equals(actual)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
       driver.quit();





    }
}
