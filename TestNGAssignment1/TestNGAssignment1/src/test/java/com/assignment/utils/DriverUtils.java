package com.assignment.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

    static WebDriver driver;

    public static void createDvier() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbs\\Documents\\TestNGAssignment1\\TestNGAssignment1\\src\\test\\java\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    public static WebDriver getDriver(){
        if(driver==null){
            createDvier();
        }
        return driver;
    }

}
