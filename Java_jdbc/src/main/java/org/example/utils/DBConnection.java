package org.example.utils;

import org.example.constant.ErrorMessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DBUrl = "jdbc:mysql://localhost:3306/inventory_db";
    private static final String userName = "root";
    private static final String password = "Ht@dieu2006";

    public static Connection connectToDB () {
        try {
            // 2. Mở kết nối (Lấy implementation từ Driver)
            return DriverManager.getConnection(DBUrl, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(ErrorMessage.connectionFail(e.getMessage()));
        }
    }

    public static void closeConnection(Connection c){
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(ErrorMessage.closeFail(e.getMessage()));
        }
    }
}
