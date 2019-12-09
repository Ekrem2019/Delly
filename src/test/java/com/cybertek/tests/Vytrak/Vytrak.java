package com.cybertek.tests.Vytrak;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Vytrak {

    public static void main(String[] args) throws InterruptedException {

        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // go to https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");
        //  enter any email
        WebElement emailInput = driver.findElement(By.name("_username"));
        // sendKeys --> enters given text
        String expectedEmail = "user9";
        emailInput.sendKeys(expectedEmail);
        // verify that email is displayed in the input box
        // .getAttribute("value")  --> get text from the input box
        String actualEmail = emailInput.getAttribute("value");
        Thread.sleep(2000);

        //  enter any email
        WebElement passwordInput = driver.findElement(By.name("_password"));
        // sendKeys --> enters given text
        String expectedpassword = "UseUser123";
        passwordInput.sendKeys(expectedpassword);
        // verify that email is displayed in the input box
        // .getAttribute("value")  --> get text from the input box
        String actualPassword = passwordInput.getAttribute("value");
        Thread.sleep(2000);
        // click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("_submit"));
        retrievePassword.click();


        // verify that url changed to http://practice.cybertekschool.com/email_sent
        String expected = "Invalid user name or password.";
        String actual = driver.findElement(By.xpath("//div[@class='alert alert-error']/div")).getText();


        if (expected.equals(actual)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }






        Thread.sleep(5000);
       driver.close();
    }

}
