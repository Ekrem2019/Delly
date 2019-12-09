package com.cybertek.tests.d12_Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setupMethod(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);
        driver.get("http://practice.cybertekschool.com/hovers");

    }
    @Test
    public void  test() throws InterruptedException {
        List<WebElement> images =driver.findElements(By.tagName("img"));

        for (int i = 1; i <= 3; i++){
            System.out.println(i);
        WebElement image = images.get(i);

            actions.moveToElement(image).perform();
            actions.pause(2000);
            String xpath= "//h5[.=‘name: user"+(i+1)+"']";

            WebElement text = driver.findElement(By.xpath(xpath));
            System.out.println("Verify element: "+i);
            Assert.assertTrue(text.isDisplayed());
        }

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public static void main(String[] args) {

    }

}
