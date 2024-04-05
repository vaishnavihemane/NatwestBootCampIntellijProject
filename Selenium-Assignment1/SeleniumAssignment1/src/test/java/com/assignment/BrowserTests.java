package com.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTests {

    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbs\\IdeaProjects\\TestingAutomationDemo1\\AutomationTestingWithSeleniumDemo1\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");


       driver.navigate().to("https://www.google.com/");

       String str = driver.getTitle();

       if(str.equals("Google"))
        {
            System.out.println("Greeting is correct");
        }
       else{
           System.out.println("Greeting is not correct");
       }


        driver.close();







    }
}
