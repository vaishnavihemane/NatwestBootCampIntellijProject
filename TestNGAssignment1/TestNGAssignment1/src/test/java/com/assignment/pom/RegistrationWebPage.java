package com.assignment.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationWebPage extends BaseWebPage{

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
    WebElement registerUserTxt;

    public void clickOnRegisterButton(){
        registerUserTxt.click();
    }

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement txtFirstName;

    public void getFirstName(String str){
        txtFirstName.sendKeys(str);
    }

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement txtLastName;

    public void getLastName(String str){
        txtLastName.sendKeys(str);
    }
    @FindBy(xpath = "//input[@name='phone']")
    WebElement txtphoneNumber;
    public void getPhoneNumber(String str){
        txtphoneNumber.sendKeys(str);
    }


    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    public void getEmail(String str){
        email.sendKeys(str);
    }

    @FindBy(xpath = "//input[@name='address1']")
    WebElement txtaddress;


    public void getAddress(String str){
        txtaddress.sendKeys(str);
    }
    @FindBy(xpath = "//input[@name='city']")
    WebElement txtcity;

    public void getCity(String str){
        txtcity.sendKeys(str);
    }

    @FindBy(xpath = "//input[@name='state']")
    WebElement txtstate;

    public void getState(String str){
        txtstate.sendKeys(str);
    }
    @FindBy(xpath = "//input[@name='postalCode']")
    WebElement txtpostalcode;

    public void getPostalcode(String str){
        txtpostalcode.sendKeys(str);
    }

    @FindBy(xpath = "//select[@name='country']")
    private WebElement txtCountry;

    public void selectCountry(String country) {
        Select select = new Select(txtCountry);
        select.selectByVisibleText(country);
    }


    @FindBy(xpath = "//input[@name='userName']")
    WebElement txtusername;

    public void getUsername(String str){
        txtusername.sendKeys(str);
    }



    @FindBy(xpath = "//input[@name='password']")
    WebElement txtpassword;

    public void getPassword(String str){
        txtpassword.sendKeys(str);
    }


    @FindBy(xpath = "//input[@name='confirmPassword']")
    WebElement  txtconfirmPassword;

    public void getConfirmPassword(String str){
        txtconfirmPassword.sendKeys(str);
    }

    @FindBy(xpath = "//input[@name='submit']")
    WebElement  submitbutton;
    public void clickSubmitButton(){
        submitbutton.click();
    }


}
















