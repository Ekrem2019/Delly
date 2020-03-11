package com.cybertek.odevler.TestCases4;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.List;

public class Case6 extends TestBase{
    @Test
    public void test1() throws InterruptedException, ParseException {
    extentLogger = report.createTest("Choose start time 9 and Verify that end time is 10");
    extentLogger.info("Log in under store manager");
    LoginPage loginPage = new LoginPage();

    String username = ConfigurationReader.get("sales_manager_username");
    String password = ConfigurationReader.get("sales_manager_password");
    extentLogger.info("username: "+username);
    extentLogger.info("password: "+password);
    loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();

        extentLogger.info("Go to Calendar Events");
        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        extentLogger.info("Wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        extentLogger.info("click on create calendar event");
        calendarEventsPage.createCalendarEvent.click();

        extentLogger.info("wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("click on start time");
        createCalendarEventsPage.startTime.click();

        extentLogger.info("choose 9 pm");
//        WebElement date = driver.findElement(By.xpath("//input[@id='time_selector_oro_calendar_event_form_start-uid-5df6c20ccff7e']"));
//        date.click();
        Thread.sleep(2000);

        List<WebElement> options=driver.findElements(By.id("time_selector_oro_calendar_event_form_start-uid-5df6cc8ccea2d"));
        for (WebElement option:options
        ) {
            System.out.println(option.getText());


        }
      //  driver.findElement(By.className("ui-timepicker-pm ui-timepicker-selected")).click();
        // dragAndDrop --> drags the source to target


        driver.findElement(By.xpath("//li[.='9:00 PM']")).click();
      //  createCalendarEventsPage.NinePM.click();



        extentLogger.info("get time from end time ");
        createCalendarEventsPage.endTime.getAttribute("value");
        System.out.println(createCalendarEventsPage.endTime.getAttribute("value"));

        extentLogger.info("verify time equal 10:00 pm ");

        Assert.assertEquals(createCalendarEventsPage.endTime.getAttribute("value"),"10:00 PM");


}}
