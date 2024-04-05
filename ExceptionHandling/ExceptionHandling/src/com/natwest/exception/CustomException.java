package com.natwest.exception;



class AgeException extends RuntimeException
{
    String msg;
    public AgeException(String msg) {
        super(msg);
        this.msg = msg;
    }

//    public String getMsg() {
//        return msg;
//    }
}



class Vote{

    public void checkEligibility(int age) throws AgeException{

        if(age>=18){
            System.out.println("you are eligible to vote");
        }
        else{

            //parameterised
            throw new AgeException("Invalid age, minimum 18");
        }
    }
}
public class CustomException {
    public static void main(String[] args) throws AgeException {


        Vote vote = new Vote();

        try {
            vote.checkEligibility(16);
        }
        catch (AgeException exception){
            System.out.println(exception.getMessage());
        }


    }
}
