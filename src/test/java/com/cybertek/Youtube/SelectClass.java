package com.cybertek.Youtube;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        WebElement day = driver.findElement(By.id("day"));
        Select oselect = new Select(day);
        Thread.sleep(3000);
        oselect.selectByIndex(6);
        WebElement month = driver.findElement(By.id("month"));
        Select month1 = new Select(month);
        Thread.sleep(3000);
        month1.selectByVisibleText("Jul");
        WebElement year = driver.findElement(By.id("year"));
        Select year1 = new Select(year);
        Thread.sleep(3000);
        year1.selectByValue("2000");

        List<WebElement> day1 = oselect.getOptions();
        int totaldays = day1.size();
        System.out.println("total count is : "+totaldays);
        for (WebElement ele:day1
             ) {String day0 = ele.getText();
            System.out.println("days are: "+day0);
                    }
        List<WebElement> month2 = month1.getOptions();
        int totalmonths = month2.size();
        System.out.println("total count is : "+totalmonths);
        for (WebElement el:month2
        ) {String month0 = el.getText();
            System.out.println("months are: "+month0);
        }

        driver.quit();
    }
}
