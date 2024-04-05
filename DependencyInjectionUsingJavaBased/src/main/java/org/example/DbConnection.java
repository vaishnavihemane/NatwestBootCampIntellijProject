package org.example;

public class DbConnection {


    String userName;
    String password;

    public DbConnection(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public DbConnection(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
