package com.example.directdemocracy;

import com.example.directdemocracy.util.DatabaseConnection;

import java.sql.Connection;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            System.out.println("Connected to PostgreSQL!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
