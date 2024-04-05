package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class March_21 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbs\\IdeaProjects\\TestingAutomationDemo1\\AutomationTestingWithSeleniumDemo1\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();
        //ScrollDown and ScrollUp
        Thread.sleep(3000);

       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
       driver.findElement(By.id("nav-search-submit-button")).click();

       Thread.sleep(3000);

        JavascriptExecutor j=(JavascriptExecutor)driver;
        Thread.sleep(3000);

        String Scrolldown="window.scrollTo(0,1000)";
        j.executeScript(Scrolldown);
        Thread.sleep(3000);
        String ScrollUP="window.scrollTo(0,-1000)";
        j.executeScript(ScrollUP);





    }

}
