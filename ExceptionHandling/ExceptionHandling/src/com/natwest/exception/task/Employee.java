package com.natwest.exception.task;

class InvalidUserNameException extends Exception{

    String msg;
    public InvalidUserNameException(String msg){
        super(msg);
    }
}


public class Employee {

    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean validate() throws InvalidUserNameException {

        if (firstName.length() < 3 && lastName.length() > 3) {
            throw new InvalidUserNameException("Name should be valid");
        }

        if (firstName == null || lastName == null) {
            throw new NullPointerException();
        }

        return true;

    }
}



class Validation{


    public static void main(String[] args) {

        Employee employee = new Employee("Vaishnavi", null);

        try{

            System.out.println(employee.validate());
        }
        catch (InvalidUserNameException ex){
            System.out.println(ex.getMessage());
        }


    }
}
