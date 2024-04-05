package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;

public class TestingOfTruckModule {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\IdeaProjects\\TestingAutomationDemo1\\AutomationTestingWithSeleniumDemo1\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://sampleapp.tricentis.com/101/");


        driver.findElement(By.id("nav_truck")).click();

        WebElement element = driver.findElement(By.id("make"));
        Select sel = new Select(element);

        Thread.sleep(3000);
        sel.selectByVisibleText("Honda");

        driver.findElement(By.name("[kW]")).sendKeys("110");


     //   driver.findElement(By.xpath("//i[@class='fa fa-calendar-plus-o']")).click();

        driver.findElement( By.id("dateofmanufacture")).sendKeys("12/04/1995");

        Thread.sleep(3000);
        WebElement element1 = driver.findElement(By.id("numberofseats"));
        Thread.sleep(3000);
        Select sel1 = new Select(element1);

        Thread.sleep(3000);
        sel1.selectByVisibleText("4");

        WebElement element2 = driver.findElement(By.id("fuel")) ;
        Thread.sleep(3000);
        Select sel2 = new Select(element2);
        sel2.selectByVisibleText("Petrol");

        Thread.sleep(3000);
        driver.findElement(By.id("payload")).click();
        driver.findElement(By.id("payload")).sendKeys("50");

        driver.findElement(By.id("totalweight")).sendKeys("1000");

        driver.findElement(By.id("listprice")).sendKeys("12000");
        driver.findElement(By.name("License Plate Number")).sendKeys("1234");
        driver.findElement(By.id("annualmileage")).sendKeys("100");
        driver.findElement(By.xpath("//button[@class='next button']")).click();
        driver.findElement(By.id("firstname")).sendKeys("Vaishnavi");
        driver.findElement(By.id("lastname")).sendKeys("Hemane");
        //driver.findElement(By.xpath("//i[@class='fa fa-calendar-plus-o']")).click();
        driver.findElement(By.id("birthdate")).sendKeys("02/15/2001");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.id("streetaddress")).sendKeys("Sangludkar Nagar, Amravati, Maharashtra");
        WebElement element3 = driver.findElement(By.name("Country"));
        Select sel3 = new Select(element3);
        sel3.selectByVisibleText("India");

        driver.findElement(By.id("zipcode")).sendKeys("444803");

        driver.findElement(By.name("City")).sendKeys("Daryapur");

        WebElement webElement = driver.findElement(By.id("occupation"));
        Select select = new Select(webElement);
        select.selectByVisibleText("Employee");

        driver.findElement(By.xpath(" //label[text()=' Speeding']")).click();

        driver.findElement(By.name("Website")).sendKeys("https://www.hondacarindia.com/");
     //   driver.findElement(By.xpath("//input[@class='ideal-file-filename']")).sendKeys("ideal-file-filename");

        driver.findElement(By.id("nextenterproductdata")).click();
        driver.findElement(By.id("startdate")).sendKeys("04/25/2024");

        WebElement element4 = driver.findElement(By.name("Insurance Sum"));
        Select sel4 = new Select(element4);
        sel4.selectByVisibleText("5.000.000,00");

        WebElement element5 = driver.findElement(By.id("damageinsurance"));
        Select sel5 = new Select(element5);
        sel5.selectByVisibleText("No Coverage");

        driver.findElement(By.xpath("//label[text()='Legal Defense Insurance']")).click();
        driver.findElement(By.id("nextselectpriceoption")).click();

        Thread.sleep(3000);

       // driver.findElement(By.id("Select Option")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]")).click();


        driver.findElement(By.id("email")).sendKeys("vaishnavihemane786@gmail.com");

        driver.findElement(By.name("Phone")).sendKeys("9730246096");


        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("VaishnaviHemane");
        driver.findElement(By.name("Password")).sendKeys("1234Vaish");

        driver.findElement(By.id("confirmpassword")).sendKeys("1234Vaish");
        driver.findElement(By.id("Comments")).sendKeys("null");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
        

    //   driver.findElement(By.xpath("//button[@class='confirm']")).click();

    //    Actions actions = new Actions(driver);

//        WebDriverWait wait = new WebDriverWait(driver,5);
//
//        try{
//
//            actions.doubleClick(element6).perform();
//            //Alert a = driver.switchTo().alert();
//            wait.until(ExpectedConditions.alertIsPresent());
//            System.out.println("Webpage loaded");
//        }
//        catch(Exception E){
//            System.out.println("Webpage not loaded");
//        }





    }
}
