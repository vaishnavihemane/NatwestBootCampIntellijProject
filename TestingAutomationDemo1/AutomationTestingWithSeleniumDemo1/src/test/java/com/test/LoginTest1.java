package com.test;

import com.Utils.DriverUtils;
import com.pom.LoginPage;
import com.pom1.LoginPage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest1 {

    @Test
    public void verifyLogin(){

        LoginPage1 lp = new LoginPage1();
        DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();


    }


}
