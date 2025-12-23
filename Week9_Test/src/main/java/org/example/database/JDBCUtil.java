package org.example.database;

import java.sql.*;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection c = null;
        try {
//            DriverManager.registerDriver(new Driver());

//            String url = "jdbc:mySQL://localhost:3306/learn_jdbc";
            String url = "jdbc:mysql://localhost:3306/book_store";
            String username = "root";
            String password = "Ht@dieu2006";

            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void closeConnection(Connection c){
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printInfo (Connection c){
        try {
            if (c != null) {
                DatabaseMetaData metaData = c.getMetaData();
                System.out.println(metaData.getDatabaseMajorVersion());
                System.out.println((c.getMetaData().toString()));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
