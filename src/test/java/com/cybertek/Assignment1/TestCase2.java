package com.cybertek.Assignment1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class TestCase2 {

//    Step 1. Go to https://practicecybertekschool.herokuapp.com
//    Step 2. Verify that number of listed examples is equals to 48.
//    Hint: use findElemnts() and size() methods.

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");

        ArrayList <WebElement> Element = new ArrayList<>(driver.findElements(By.className("list-group-item")));
        System.out.println(Element.size());

        if (Element.size()==48){
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }


        Thread.sleep(3000);

        driver.quit();








    }


}
