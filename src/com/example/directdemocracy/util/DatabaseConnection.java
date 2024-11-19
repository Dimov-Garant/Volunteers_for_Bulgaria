package com.example.directdemocracy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/directdemocracy";
        String user = "postgres";
        String password = "Thought1161324";
        return DriverManager.getConnection(url, user, password);
    }
}
