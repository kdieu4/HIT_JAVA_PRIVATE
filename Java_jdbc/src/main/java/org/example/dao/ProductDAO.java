package org.example.dao;

import org.example.dto.ProductDTO;
import org.example.model.Product;
import org.example.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void insert(Product product) {
        try {
            Connection connection = DBConnection.connectToDB();
            String sql = "INSERT INTO product VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setString(4, product.getCategoryId());

            int res = preparedStatement.executeUpdate();
            System.out.println("Ban da thuc thi");
            System.out.println("Co " + res + " dong bi thay doi!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<ProductDTO> findAllWithCategoryName() {
        List<ProductDTO> list = new ArrayList<>();
        String sql = "SELECT p.id, p.name, p.price, p.category_id, c.name as category_name " +
                "FROM product p JOIN category c ON p.category_id = c.id";
        try {
            Connection connection = DBConnection.connectToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                ProductDTO dto = new ProductDTO();
                dto.setId(resultSet.getString("id"));
                dto.setName(resultSet.getString("name"));
                dto.setPrice(resultSet.getDouble("price"));
                dto.setCategoryId(resultSet.getString("category_id"));
                dto.setCategoryName(resultSet.getString("category_name"));
                list.add(dto);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}
