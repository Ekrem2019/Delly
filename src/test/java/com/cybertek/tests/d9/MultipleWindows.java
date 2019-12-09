package com.cybertek.tests.d9;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public  void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void switchWindows(){
        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("Before new window is opened "+ driver.getTitle());
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("Before new window is opened "+(driver.getTitle()));

       // driver.switchTo().window("New Window");

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println("currentWindowHandle= "+currentWindowHandle);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String  windowHandle : windowHandles){
            System.out.println(windowHandle);
            if(!currentWindowHandle.equals((windowHandle))){
                driver.switchTo().window(windowHandle);
            }
        }

        System.out.println("After switching "+driver.getTitle());

    }
    @Test
    public void changebytitle(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targettitle = "New Window";
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getWindowHandles().size());

        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(targettitle)){
                break;
            }
        }
        System.out.println(driver.getTitle());





    }

}

