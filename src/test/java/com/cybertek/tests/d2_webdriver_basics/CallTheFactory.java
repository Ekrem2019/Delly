package com.cybertek.tests.d2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallTheFactory {

    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

       // WebDriver driver = WebDriverFactory.getDriver("firefox");

        WebDriver driver1 = WebDriverFactory.getDriver("chrome");
        driver1.get("https:google.com");


    }
    }

