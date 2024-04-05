package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_1 extends BasePage{

//    @FindBy(className = "ico-login")
//    WebElement txtLogin;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement loginClick;
    @FindBy(name = "Email")
    WebElement txtEmail;

    @FindBy(name = "Password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement clickLoginButton;

//    public void clickLogin(){
//       txtLogin.click();
//    }
    public void startLogin(){
        loginClick.click();
    }

    public void enterEmail(String str){
       txtEmail.sendKeys(str);
    }

    public void enterPassword(String str){
        txtPassword.sendKeys(str);
    }

    public void clickLoginButton(){
        clickLoginButton.click();
    }

}
