package com.assignment.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseWebPage {
    WebDriver driver;

    public BaseWebPage(){
        driver= com.assignment.utils.DriverUtils.getDriver();
        PageFactory.initElements(driver,this);
    }
}
