package com.assignment.test;

import com.assignment.pom.LoginWebPage;
import com.assignment.pom.RegistrationWebPage;
import com.assignment.utils.DriverUtils;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void verifyRegistrationWebPage() {
        RegistrationWebPage registrationWebPagep = new RegistrationWebPage();
        DriverUtils.getDriver().get("https://demo.guru99.com/test/newtours/index.php");

         registrationWebPagep.clickOnRegisterButton();
          registrationWebPagep.getFirstName("Vaishnavi");
        registrationWebPagep.getLastName("Hemane");
       registrationWebPagep.getPhoneNumber("5352346096");
       registrationWebPagep.getEmail("vaishnavihemane786@gmail.com");
       registrationWebPagep.getAddress("Sangludkar Nagar,Amravati");
       registrationWebPagep.getCity("Daryapur");
        registrationWebPagep.getState("Maharashtra");
       registrationWebPagep.getPostalcode("444803");
       registrationWebPagep.selectCountry("INDIA");

       registrationWebPagep.getUsername("Vaishnavi");
       registrationWebPagep.getPassword("4444");
       registrationWebPagep.getConfirmPassword("4444");
       registrationWebPagep.clickSubmitButton();

    }




    @Test(dependsOnMethods = "verifyRegistrationWebPage")
    public void verifySignonWebPage() {
        LoginWebPage loginWebPage = new LoginWebPage();
        DriverUtils.getDriver().get("https://demo.guru99.com/test/newtours/index.php");
        loginWebPage.clickSignonButton();
        loginWebPage.enterUsername("Vaishnavi");
        loginWebPage.enterPassword("4444");
        loginWebPage.clickSubmitButton();

    }

}
