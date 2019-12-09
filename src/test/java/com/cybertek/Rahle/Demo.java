package com.cybertek.Rahle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        // create driver object for chrome browser
        // we will strictly implement methods of webdriver
        /* Class name = ChromeDriver,
            X driver = new (); */
         

    System.setProperty("webdriver.chrome.driver","C:\\Users\\egule\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com"); // hit url on the browser
        System.out.println(driver.getTitle()); // validate if your page title is correct
        System.out.println(driver.getCurrentUrl()); // validate if you are landed on correct url

       // System.out.println(driver.getPageSource()); // print page source
    driver.get("http://yahoo.com");
    //driver.navigate().back();
    //  driver.navigate().forward();
    driver.close();//it closes current browser
   // driver.quit(); // it closes all the browser opened by selenium script
    }

}
