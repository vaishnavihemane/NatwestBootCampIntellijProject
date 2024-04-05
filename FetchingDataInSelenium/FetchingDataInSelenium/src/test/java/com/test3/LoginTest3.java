package com.test3;

import com.pom3.LoginPage3;
import com.utils3.DriverUtils;
import com.utils3.ExcelData;
import org.testng.annotations.Test;

public class LoginTest3 {


    @Test
    public void verifyLogin(){

        LoginPage3 lp = new LoginPage3();
        DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String username = ExcelData.getData( "C:\\Users\\rbs\\Documents\\FetchingDataInSelenium\\FetchingDataInSelenium\\src\\test\\java\\data\\ExcelSheetApachePath.xlsx", "Sheet1", 0, 0 );
        String password = ExcelData.getData( "C:\\Users\\rbs\\Documents\\FetchingDataInSelenium\\FetchingDataInSelenium\\src\\test\\java\\data\\ExcelSheetApachePath.xlsx", "Sheet1", 0, 1 );
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.clickLogin();


    }
}
