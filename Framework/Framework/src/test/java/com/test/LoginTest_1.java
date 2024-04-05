package com.test;

import com.Utils.DriverUtils;
import com.pom.LoginPage_1;
import org.testng.annotations.Test;

public class LoginTest_1 {

    @Test
    public void verifyLogin(){

        LoginPage_1 lp = new LoginPage_1();
        DriverUtils.getDriver().get("https://demowebshop.tricentis.com/register");
        lp.startLogin();
//        lp.enterEmail("vaishnavihemane786@gmail.com");
//        lp.enterPassword("Vaishnavi");
//
//        lp.clickLoginButton();

    }

}
