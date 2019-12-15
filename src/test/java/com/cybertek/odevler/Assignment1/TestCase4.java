package com.cybertek.odevler.Assignment1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase4 {
    public static void main(String[] args) {
// Step 1. Go to https://practicecybertekschool.herokuapp.com
// Step 2. Click on “Registration Form”
// Step 3. Enter “123” into ﬁrst name input box.
// Step 4. Verify that warning message is displayed: “ﬁrst name can only consist of alphabetical letters”

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a [@href='/registration_form']")).click();
        driver.findElement(By.name("firstname")).sendKeys("123");

        String expected = "first name can only consist of alphabetical letters";
        String actual = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[3]")).getText();

        if (expected.equals(actual)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
driver.quit();







    }



}
