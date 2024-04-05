package com.basic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class March_20 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\IdeaProjects\\TestingAutomationDemo1\\AutomationTestingWithSeleniumDemo1\\src\\test\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.amazon.in/");
//
//        TakesScreenshot t = (TakesScreenshot) driver;
//
//        File src = t.getScreenshotAs(OutputType.FILE);
//
//        File dest = new File("C:\\Users\\rbs\\Downloads");


//       driver.get("https://www.google.com");
//       driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("QSpiders");
//
//      List<WebElement> li =  driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]")) ;
//       Thread.sleep(3000);
//
//       int count = li.size();
//
//       Thread.sleep(3000);
//
//        System.out.println(count);
//
//        for(int i=0; i<count; i++){
//
//            Thread.sleep(3000);
//
//            WebElement element = li.get(i);
//
//            Thread.sleep(3000);
//            System.out.println(element.getText());
//
//        }


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/alerts");

        WebElement element =  driver.findElement(By.xpath("//button[text()='Click me']"));

        Actions actions = new Actions(driver);


        WebDriverWait wait = new WebDriverWait(driver,5);

        try{

            actions.doubleClick(element).perform();
            //Alert a = driver.switchTo().alert();
            wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Webpage loaded");
        }
        catch(Exception E){
            System.out.println("Webpage not loaded");
        }









    }
}
