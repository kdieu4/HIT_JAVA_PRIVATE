package org.example.dao;

import org.example.model.Category;
import org.example.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CategoryDAO {

    public List<Category> findAll() {
        List<Category> result = new ArrayList<>();
        try {
            Connection connection = DBConnection.connectToDB();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM category";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                result.add(new Category(id, name));
            }

            result.forEach(System.out::println);

            DBConnection.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public void insert(Category category) {
        //int result = 0;
        try {
            Connection connection = DBConnection.connectToDB();
            String sql = "insert into category values(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.println(sql);
            statement.setString(1,category.getId());
            statement.setString(2,category.getName());
            int res = statement.executeUpdate();
            System.out.println("Ban da thuc thi");
            System.out.println("Co " + res + " dong bi thay doi!");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }
    }

    public void update(Category category) {
        int result = 0;
        try {
            Connection connection = DBConnection.connectToDB();
            Statement statement = connection.createStatement();
            String sql = "UPDATE category"
                    + " SET "
                    + " name='" + category.getName() + "\'"
                    + " WHERE id = '" + category.getId() + "\'";
            result = statement.executeUpdate(sql);
            System.out.println("Ban da thuc thi");
            System.out.println("Co " + result + " dong bi thay doi!");

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Category category) {
        int result = 0;
        try {
            Connection connection = DBConnection.connectToDB();
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM category"
                    + " WHERE id= '" + category.getId() + "\'";
            result = statement.executeUpdate(sql);
            System.out.println("Ban da thuc thi");
            System.out.println("Co " + result + " dong bi thay doi!");

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
