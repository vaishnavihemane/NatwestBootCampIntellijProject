package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NatwestOpen {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\IdeaProjects\\TestingAutomationDemo1\\AutomationTestingWithSeleniumDemo1\\src\\test\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.amazon.in/");
//
//        driver.navigate().to("https://www.google.com/");
//
//        driver.navigate().forward();
//        driver.navigate().back();
//        driver.navigate().refresh();
//
//        driver.manage().window().maximize();
//
//        System.out.println(driver.getTitle());
//
//        System.out.println(driver.getCurrentUrl());
//
//        driver.close();



        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        Thread.sleep(3000);

     WebElement element =   driver.findElement(By.xpath("//span[text()='PIM']"));
//        Thread.sleep(3000);
//
//
//        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.name("firstName")).sendKeys("Ravi");
//
//        driver.findElement(By.name("middleName")).sendKeys("Suresh");
//
//        driver.findElement(By.name("lastName")).sendKeys("Sharma");
//
//        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
//    // driver.close();
//


        Actions actions = new Actions(driver);

       // WebElement Admin = driver.findElement(By.xpath("//b[text()='Admin']"));

        actions.moveToElement(element).perform();
        actions.doubleClick().perform();




    }


}
