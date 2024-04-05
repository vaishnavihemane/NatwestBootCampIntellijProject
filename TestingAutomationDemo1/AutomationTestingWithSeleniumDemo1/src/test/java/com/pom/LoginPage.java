package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //declaration

    @FindBy(name="username")
    WebElement txtUsername;

    @FindBy(xpath="//input[@name='password']")
    WebElement txtPassword;

    @FindBy(xpath="//button[@type='submit']")
    WebElement buttonLogin;



    //Initialization

    LoginPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }


    //utilization
    public  void enterUsername(String str){
        txtUsername.sendKeys(str);
    }

    public void enterPassword(String str){
        txtPassword.sendKeys(str);
    }

    public void clickLogin(){
        buttonLogin.click();
    }



}
