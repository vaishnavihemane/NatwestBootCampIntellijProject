package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment2 {

        public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Documents\\SeleniumAssignment-2\\SeleniumAssignment2\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/samples.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();

        driver.findElement(By.id("subject")).sendKeys("Automation Testing");
        driver.findElement(By.id("email")).sendKeys("vaishnavihemane786@gmail.com");

        driver.findElement(By.id("q1")).sendKeys("Assignment Task");

        driver.findElement(By.xpath("//*[@id=\"q2\"]")).sendKeys("Assignment of Selenium Testing");
        WebElement element= driver.findElement(By.xpath("//*[@id=\"q3\"]"));
        Select select = new Select(element);
        select.selectByVisibleText("Fourth Option");
        driver.findElement(By.id("q4")).click();
        driver.findElement(By.xpath("//*[@id=\"q5\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"q7\"]")).sendKeys("27-03-2024");
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"q8\"]"));
        Select select1 = new Select(element1);
        select1.selectByVisibleText("CA");





        }

}
