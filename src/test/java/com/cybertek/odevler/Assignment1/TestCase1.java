package com.cybertek.odevler.Assignment1;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase1 {
//    Step 1. Go to https://practicecybertekschool.herokuapp.com
//    Step 2. Click on “Sign Up For Mailing List”
//    Step 3. Enter any valid name
//    Step 4. Enter any valid email
//    Step 5. Click on “Sign Up” button
//    Expected result: Following message should be displayed: “Thank you for signing up. Click the button below to return to the home page.” Home button should be displayed.

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();

        Faker faker = new Faker();
        String name =faker.name().fullName();
        String email =faker.internet().emailAddress();


        driver.findElement(By.name("full_name")).sendKeys(name);

        driver.findElement(By.name("email")).sendKeys(email);

        driver.findElement(By.name("wooden_spoon")).click();

        String expected = "Thank you for signing up. Click the button below to return to the home page.";
        String actual = driver.findElement(By.className("subheader")).getText();

        if ( expected.equals(actual)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
System.out.println("Osman Abi sen iyi adamsin");
System.out.println("Osman Abi sen iyi adamsin");  
System.out.println("salatalik");  
        
        
driver.quit();



    }

}
