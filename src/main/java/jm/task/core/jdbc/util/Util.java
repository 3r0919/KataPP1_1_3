package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (
                SQLException e) {
            throw new RuntimeException("Failed to connect to database", e);
        }
    }
}