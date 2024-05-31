package com.example;

public abstract class Authenticate extends Database {
    public Authenticate(String url, String user, String pass) {
        super(url, user, pass);
    }

    public abstract boolean checkLogin(String username, String password);
}
