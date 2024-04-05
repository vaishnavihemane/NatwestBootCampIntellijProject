package com.pom3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage3 extends BasePage3{

    @FindBy(name="username")
    WebElement txtUsername;

    @FindBy(xpath="//input[@name='password']")
    WebElement txtPassword;

    @FindBy(xpath="//button[@type='submit']")
    WebElement buttonLogin;

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
