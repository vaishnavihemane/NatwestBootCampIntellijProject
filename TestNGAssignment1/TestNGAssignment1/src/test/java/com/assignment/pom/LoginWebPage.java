package com.assignment.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWebPage extends BaseWebPage {

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
    WebElement txtSignonButton;

    public void clickSignonButton(){
        txtSignonButton.click();
    }

    @FindBy(xpath = "//input[@name='userName']")
    WebElement textUsername;

    public void enterUsername(String str){
        textUsername.sendKeys(str);
    }


    @FindBy(xpath = "//input[@name='password']")
    WebElement textPassword;

    public void enterPassword(String str){
        textPassword.sendKeys(str);
    }

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")
    WebElement txtSubmitButton;

    public void clickSubmitButton(){
        txtSubmitButton.click();
    }


}

