package com.natwest.utility;

import java.math.BigDecimal;

public class AppConstant {

    public static final String INSUFFICIENT_BALANCE_EXCEPTION =  "Sorry, Balance is not sufficient for withdrawl operation !!";
    public static final String OTP_EXPIRED_EXCEPTION = "Your OTP Time Is Expired, Try after 10 min. !!";
    public static final String MISSED_ALL_ATTEMPT_FOR_OTP =  "You missed your all attempt, Please try after 24 hrs. !!";
    public static final String TRANSACTION_FAILED_MESSAGE = "Transaction Failed Because Of Internal Server Error !!";

    public static final String TRANSACTION_LIMIT_OF_MONEY_FOR_TODAY_EXCEEDED_MESSAGE = "Transaction Limit Of Money For Today Is Exceeded, Only Upto 30000Rs Transaction Is Allowed In A Single Day, Try Tommorrow";

    public static final BigDecimal TRANSACTION_LIMIT_FOR_TODAY = BigDecimal.valueOf(30000);
}
