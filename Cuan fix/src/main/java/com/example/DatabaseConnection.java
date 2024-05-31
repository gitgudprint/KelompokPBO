package com.example;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    public static DatabaseConnection INSTANCE;

    public Connection connection;

    public DatabaseConnection() {
        this.connection = this.getConnection();
    }

    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnection();
        }

        return INSTANCE;
    }

    public Connection getConnection() {
        String databaseUser = "root";
        String databasePassword = "";
        String databaseUrl = "http://localhost/phpmyadmin/cuan";

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(databaseUrl, databaseUser, databasePassword);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return conn;
    }
}
