package com.sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPage {

    @FindBy(id="nav_truck")
    WebElement txtTruck;

    public  FrontPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickTruckModule(){
        txtTruck.click();
    }


}
