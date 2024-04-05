package com.natwest.authentication;

import com.natwest.exception.OTPTimeExpiredException;
import com.natwest.utility.AppConstant;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

@Component
public class OTPValidation {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public boolean validateOtp() throws OTPTimeExpiredException {

        String validOtp = "" + random.nextInt(1000,10000);
        long startTimeOfOTP = new Date().getTime();
        int count =0;

        do{

            System.out.println("Please,Enter OTP " + validOtp);
            String inputOTP = sc.next();
            long inputTimeOfOTP = new Date().getTime();

            if((inputTimeOfOTP - startTimeOfOTP) > 60000){
                throw new OTPTimeExpiredException(AppConstant.OTP_EXPIRED_EXCEPTION);
            }

            if(inputOTP.equals(validOtp)){
                return true;
            }

            System.err.println("Invalid otp, You have " +  (2 - count) + " chance " + ", Enter Valid OTP ");
            count++;

        }
        while(count < 3);

        return false;

    }


}
