package com.cybertek.Assignment2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignmentTestNG {
    //public static void main(String[] args) throws InterruptedException {
        @Test
            public void test1() throws InterruptedException {
            WebDriver driver= WebDriverFactory.getDriver("chrome");
           // driver = WebDriverFactory.getDriver("chrome");
            driver.get("https://practice-cybertekschool.herokuapp.com");
            WebElement element = driver.findElement(By.xpath("//div/ul/li[40]/a"));
            element.click();
            WebElement birth = driver.findElement(By.xpath("//form/div[8]/div/input"));
            birth.sendKeys("wrong_dob");
            birth.click();
            String error = driver.findElement(By.xpath("//form/div[8]/div/small[2]")).getText();
            System.out.println(error);
            Assert.assertEquals(error, "The date of birth is not valid");
            Thread.sleep(3000);
        }
        @BeforeMethod

        public void setupMethod(){
            System.out.println("before method");
        }
        @AfterMethod

        public void teardownMethod(){
            System.out.println("after method");
        }

    }




