package com.solera.global.qa.bootcamp.web.behavior.data.types;

public class User {

    private String userName;
    private String password;

    //User constructors, getters and setters

    public User(){

    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
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
