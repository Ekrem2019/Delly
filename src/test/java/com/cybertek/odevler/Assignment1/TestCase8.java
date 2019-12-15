package com.cybertek.odevler.Assignment1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase8 {
    public static void main(String[] args) {

//Step 1. Go to https://practicecybertekschool.herokuapp.com
//Step 2. Click on “Registration Form”
//Step 3. Enter “5711234354” into phone number input box.
//Step 4. Verify that warning message is displayed: “Phone format is not correct”
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a [@href='/registration_form']")).click();
        driver.findElement(By.name("phone")).sendKeys("5711234354");

        String expected = "Phone format is not correct";
        String actual = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/small[2]")).getText();

        if (expected.equals(actual)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.quit();



    }
}
