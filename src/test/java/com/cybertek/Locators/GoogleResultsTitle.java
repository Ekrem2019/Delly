package com.cybertek.Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultsTitle {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        WebElement searchStrs = driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input"));
        searchStrs.sendKeys("Selenium");
        searchStrs.submit();
        WebElement link = driver.findElement(By.xpath("(//span[@class='S3Uucc'])[1]"));
        link.click();
        String expectedUrl = "https://www.seleniumhq.org/";
        String actualUrl = driver.getCurrentUrl();

        if ( expectedUrl.equals(actualUrl)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }







    }

}
