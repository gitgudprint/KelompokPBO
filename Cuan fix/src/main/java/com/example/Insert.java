package com.example;

public abstract class Insert extends Database {
    public Insert(String url, String user, String pass) {
        super(url, user, pass);
    }

    public abstract boolean registerUser(String username, String password);
}