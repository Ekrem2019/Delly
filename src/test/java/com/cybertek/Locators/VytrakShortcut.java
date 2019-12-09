package com.cybertek.Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrakShortcut {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager101");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
       WebElement dashboards = driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[1]/a/span"));
       Thread.sleep(2000);
        dashboards.click();
        WebElement dashboard = dashboards.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        Thread.sleep(2000);
        dashboard.click();
        Thread.sleep(2000);
        String expectedUrl = "https://qa2.vytrack.com/dashboard/view/1?change_dashboard=1";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        WebElement shortcut = driver.findElement(By.xpath("//i[@class='fa-share-square']"));
       Thread.sleep(2000);
        shortcut.click();


        WebElement seefulllist = driver.findElement(By.linkText("See full list"));
        Thread.sleep(2000);
        seefulllist.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='container']/div[2]/div/table/tbody/tr[21]/td/a")).click();
        Thread.sleep(2000);
        String expectedUrl1 = "https://qa2.vytrack.com/opportunity?grid%5Bsales-opportunity-grid%5D=i%3D1%26p%3D25%26s%255BcreatedAt%255D%3D1%26f%255Bstatus%255D%255Btype%255D%3D2%26f%255Bstatus%255D%255Bvalue%255D%255B%255D%3Dlost%26f%255Bstatus%255D%255Bvalue%255D%255B%255D%3Dwon%26c%3Did0.name1.createdAt1.updatedAt0.contactName1.closeRevenue0.closeReasonLabel0.closeDate1.budgetAmount1.probability1.status1.primaryEmail1.ownerName1.accountName0.timesContacted0.timesContactedIn0.timesContactedOut0.lastContactedDate0.lastContactedDateIn0.lastContactedDateOut0.daysSinceLastContact0%26v%3Dopportunity.open%26a%3Dgrid";
        String actualUrl1 = driver.getCurrentUrl();

        if (expectedUrl1.equals(actualUrl1)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header[@id='oroplatform-header']/div/div/div[2]/div/a/i")).click();
        Thread.sleep(2000);
        WebElement seefulllist1 = driver.findElement(By.linkText("See full list"));
        Thread.sleep(2000);
        seefulllist1.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='container']/div[2]/div/table/tbody/tr[17]/td/a")).click();

        Thread.sleep(2000);
        WebElement mesaj = driver.findElement(By.xpath("//div[@class='message']"));
        System.out.println(mesaj);

        Thread.sleep(2000);

        String expectedMessage= "You do not have permission to perform this action.";
        String actualMessage= mesaj.getText();

        if (expectedMessage.equals(actualMessage)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
Thread.sleep(2000);
        String expectedUr2="https://qa2.vytrack.com/entity/Extend_Entity_VehicleServicesLogs";
        String actualUrl2=driver.getCurrentUrl();

        if (expectedUr2.equals(actualUrl2)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }









        //String expected = ""

    }
}
