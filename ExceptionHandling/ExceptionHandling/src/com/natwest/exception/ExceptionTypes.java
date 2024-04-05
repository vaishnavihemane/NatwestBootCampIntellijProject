package com.natwest.exception;


//uncheck exception (extends runtimeexception)
//checked exception (extends exception)
class IdNotFoundException extends RuntimeException
{

}
public class ExceptionTypes {

    public static void main(String[] args) {

        throw new IdNotFoundException();
    }
}
