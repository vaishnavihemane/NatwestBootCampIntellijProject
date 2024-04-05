package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationOfWebDemoWebsite {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbs\\IdeaProjects\\TestingAutomationDemo1\\AutomationTestingWithSeleniumDemo1\\src\\test\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://demowebshop.tricentis.com/register");

        driver.manage().window().maximize();
        Thread.sleep(3000);

//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin@123");
//
//        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//

        //driver.findElement(By.xpath("//input='gender-female']")).click();

        driver.navigate().to("https://demowebshop.tricentis.com/register");

//        WebElement element = driver.findElement(By.xpath("//input[@id='gender-female']"));
//        System.out.println(element.getText());
//        element.click();
//        driver.findElement(By.name("FirstName")).sendKeys("Vaishnavi");
//        driver.findElement(By.name("LastName")).sendKeys("Hemane");
//        driver.findElement(By.name("Email")).sendKeys("vaishnavihemane786@gmail.com");
//        driver.findElement(By.name("Password")).sendKeys("Vaishnavi");
//        driver.findElement(By.name("ConfirmPassword")).sendKeys("Vaishnavi");
//        driver.findElement(By.xpath("//input[@id='register-button']")).click();

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.name("Email")).sendKeys("vaishnavihemane786@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Vaishnavi");
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'/books')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='25.00']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt='Picture of Fiction']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button-45")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='termsofservice']")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(3000);
//
//        Thread.sleep(3000);

//        driver.findElement(By.name("BillingNewAddress.City")).sendKeys("Daryapur");
//        Thread.sleep(3000);
//        driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("Amravati, Maharashtra");
//        Thread.sleep(3000);
//        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Sangludkar Nagar, Banosa,Daryapur");
//        Thread.sleep(3000);
//        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("444803");
//        Thread.sleep(3000);
//        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9730246096");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/div/input")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[5]/div[2]/div/input")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[6]/div[2]/div[2]/input")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
      //driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();

//
//        driver.findElement(By.xpath("//input[@class='button-1 cart-button']")).click();

    }
}
