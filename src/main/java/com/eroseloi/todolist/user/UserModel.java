package com.eroseloi.todolist.user;

public class UserModel {
    
    //Atributos
    private String username;
    private String name;
    private int password;


    // Get e Set - Username
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    // Get e Set - Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Get e Set - Password
    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }



}
