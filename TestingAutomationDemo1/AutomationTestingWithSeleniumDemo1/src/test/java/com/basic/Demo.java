package com.basic;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\IdeaProjects\\TestingAutomationDemo1\\AutomationTestingWithSeleniumDemo1\\src\\test\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

      //  driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.get("https://www.meesho.com/");

        WebDriverWait wait = new WebDriverWait(driver,10);

        JavascriptExecutor j = (JavascriptExecutor)driver;
        String scrollDown = ("window.scrollBy(0,10000)");
        j.executeScript(scrollDown);


//        try {
//
//            wait.until(ExpectedConditions.titleContains("Meesho"));
//          System.out.println("passed");
//        }
//        catch (Exception e){
//            System.out.println("Failed");
//        }
//
//        TakesScreenshot t = (TakesScreenshot)driver ;
//        File src = t.getScreenshotAs(OutputType.FILE);
//        File dest = new File("C:\\Users\\rbs\\Downloads\\Screenshot.png");
//        FileUtils.copyFile(src,dest);

     //   driver.get("https://www.flipkart.com/");

//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

        System.out.println(driver.getCurrentUrl());
      //  System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());
        System.out.println(driver.manage());


//        driver.close();
//
//        driver.quit();



    }
}
