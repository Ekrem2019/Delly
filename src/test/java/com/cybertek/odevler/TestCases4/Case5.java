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
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Case5  extends TestBase {
    @Test
    public void test1() throws InterruptedException, ParseException {
        // create a report test
        extentLogger = report.createTest("Verify 1 hour difference between start and end time");
        extentLogger.info("Log in under store manager");
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        loginPage.login(username, password);


        DashboardPage dashboardPage = new DashboardPage();

        extentLogger.info("Go to Calaendar events ");
        dashboardPage.navigateToModule("Activities", "Calendar Events");


        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        extentLogger.info("Wait Loading element dissapear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        extentLogger.info("click on create create a calendar event");
        calendarEventsPage.createCalendarEvent.click();

        extentLogger.info("Wait Loading element dissapear");
        createCalendarEventsPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("get a start time");
        createCalendarEventsPage.startTime.click();


        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a");

        extentLogger.info(" get value in start time ");
        String start = createCalendarEventsPage.startTime.getAttribute("value");
        System.out.println("start = " + start);

        extentLogger.info("get value in end time");
        String end = createCalendarEventsPage.endTime.getAttribute("value");
        System.out.println("end = " + end);
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a");
//.parse helps us to convert string to actual time and getTime() method returns us time in milliseconds
//thats why we can use divided in milliseconds
//or basicly minus the meeting end time from start time
long elapsed = (sdf.parse(second).getTime() / 3600000) - (sdf.parse(first).getTime() / 3600000);
//System.out.println(elapsed/3600000);
Assert.assertEquals(elapsed, 1);
         */
        long difference = (sdf.parse(end).getTime() / 3600000) - (sdf.parse(start).getTime() / 3600000);
        System.out.println("difference = " + difference);
        extentLogger.info("Verify difference in one hour");
        Assert.assertEquals(difference, 1);

    }}

