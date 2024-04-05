package com.pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage3 {

    WebDriver driver;

    public  BasePage3(){
        driver= com.utils3.DriverUtils.getDriver();
        PageFactory.initElements(driver,this);
    }
}
