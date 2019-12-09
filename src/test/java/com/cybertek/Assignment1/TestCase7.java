package com.cybertek.Assignment1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase7 {
    public static void main(String[] args) {
//        Step 1. Go to https://practicecybertekschool.herokuapp.com
//        Step 2. Click on “Registration Form”
//        Step 3. Enter “testers@email” into email input box.
//        Step 4. Verify that warning message is displayed: “email address is not a valid
//        Email format is not correct”
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a [@href='/registration_form']")).click();
        driver.findElement(By.name("email")).sendKeys("testers@email");

        String expected1 = "email address is not a valid";
        String expected2 = "Email format is not correct";

        String actual1 = driver.findElement(By.xpath("//*[@id='registrationForm']/div[4]/div/small[2]")).getText();
        String actual2 = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/small[3]")).getText();

        if (expected1.equals(actual1)&&expected2.equals(actual2)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.quit();







    }

}
