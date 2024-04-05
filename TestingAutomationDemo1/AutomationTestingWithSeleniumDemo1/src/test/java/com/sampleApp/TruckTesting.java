package com.sampleApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TruckTesting {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbs\\IdeaProjects\\TestingAutomationDemo1\\AutomationTestingWithSeleniumDemo1\\src\\test\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://sampleapp.tricentis.com/101/");

        FrontPage frontPage = new FrontPage(driver);
        VehicleData vehicleData = new VehicleData(driver);
        
        frontPage.clickTruckModule();

        vehicleData.enterMake("Honda");
        vehicleData.enterEngienePerf("110");
        vehicleData.enterDateOfManufacture("12/04/1995");
        vehicleData.enterNoOfSeat("4");
        vehicleData.enterFuelType("Petrol");
        vehicleData.enterPayload("50");
        vehicleData.enterTotalWeight("1000");
        vehicleData.enterListPrice("12000");
        vehicleData.enterLicensePlateNumer("1234");
        vehicleData.enterAnnualMileague("100");
        vehicleData.selectNextButton();







    }

}
