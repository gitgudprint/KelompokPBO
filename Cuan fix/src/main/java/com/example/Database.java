package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database extends DatabaseConnection {
    public Database(String url, String user, String pass) {
        super(url, user, pass); // Call the constructor of DatabaseConnection
    }

    protected boolean executeQuery(String query, String username, String password) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);

            if (query.startsWith("SELECT")) {
                ResultSet resultSet = statement.executeQuery();
                return resultSet.next();
            } else {
                int rowsAffected = statement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}