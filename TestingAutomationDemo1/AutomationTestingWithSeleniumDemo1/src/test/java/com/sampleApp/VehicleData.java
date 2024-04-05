package com.sampleApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.print.Pageable;

public class VehicleData {

    @FindBy(id = "make")
    WebElement txtMake;

    @FindBy(name = "[kW]")
    WebElement txtEngienePerf;
    
    @FindBy(id = "dateofmanufacture")
    WebElement txtDateOfManf;

    @FindBy(id="numberofseats")
    WebElement txtNumberOfSeat;

    @FindBy(id="fuel")
    WebElement txtFuel;

    @FindBy(id="payload")
    WebElement txtPayload;


    @FindBy(id="totalweight")
    WebElement txtTotalWt;

    @FindBy(id = "listprice")
    WebElement txtListPrice;

    @FindBy(name = "License Plate Number")
    WebElement txtLicensePlateNumber;

    @FindBy(id="annualmileage")
    WebElement txtAnnualMileage;

    @FindBy(xpath = "//button[@class='next button']")
    WebElement txtNextButton;

    public VehicleData(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void enterMake(String str){

        Select sel = new Select(txtMake);
        sel.selectByVisibleText(str);
    }

    public void enterEngienePerf(String str){
       txtEngienePerf.sendKeys(str);
    }

    public void enterDateOfManufacture(String str){
        txtDateOfManf.sendKeys(str);
    }

    public void enterNoOfSeat(String str){
        Select select = new Select(txtNumberOfSeat);
        select.selectByVisibleText(str);

    }

    public void enterFuelType(String str){
        Select select= new Select(txtFuel);
        select.selectByVisibleText(str);
    }

   public  void enterPayload(String str){
       txtPayload.sendKeys(str);
   }


   public void enterTotalWeight(String str){
        txtTotalWt.sendKeys(str);
   }

   public void enterListPrice(String str){
        txtListPrice.sendKeys(str);
   }

   public void enterLicensePlateNumer(String str){
        txtLicensePlateNumber.sendKeys(str);
   }

   public void enterAnnualMileague(String str){
        txtAnnualMileage.sendKeys(str);
   }

   public void selectNextButton(){
        txtNextButton.click();
   }



}
