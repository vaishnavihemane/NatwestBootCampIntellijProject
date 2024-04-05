package com.basic;

import org.testng.annotations.Test;

public class Anno_Test {

    @Test
    public void OrangeHRMVerifyLogin(){
        System.out.println("Login Validated");
    }

    @Test(groups = {"TestNGVerifyLogin","OrangeHRMVerifyLogin"})
    public void TestNGVerifyLogin(){
        System.out.println("Test Login Validated");
    }

    @Test(dependsOnGroups = {"TestNGVerifyLogin","OrangeHRMVerifyLogin"})
    public void AmazonVerifyLogout()
    {
        System.out.println("Logout validated");
    }




}
