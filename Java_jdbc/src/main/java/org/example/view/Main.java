package org.example.view;

import org.example.dao.CategoryDAO;
import org.example.dao.ProductDAO;
import org.example.dto.ProductDTO;
import org.example.model.Category;
import org.example.model.Product;
import org.example.utils.DBConnection;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Connection connection = DBConnection.connectToDB();
        CategoryDAO categoryDAO = new CategoryDAO();
        ProductDAO productDAO = new ProductDAO();

        System.out.println("---BẮT ĐẦU TEST CHƯƠNG TRÌNH---");
//        Category newCategory = new Category("C06", "Mobile");
//        categoryDAO.insert(newCategory);
//        System.out.println(">> Đã thêm danh mục: Tablet");

        Product newProduct = new Product("P10", "MacBook Air M3", 1200.0, "C03");
        productDAO.insert(newProduct);
        System.out.println(">> Đã thêm sản phẩm: MacBook Air M2");

        System.out.println("\n---DANH SÁCH SẢN PHẨM HIỆN CÓ---");
        List<ProductDTO> listProduct = productDAO.findAllWithCategoryName();

        for (ProductDTO dto : listProduct){
            System.out.printf("ID: %s | Name: %-20s | Price %.1f | Category: %s \n",
                    dto.getId(), dto.getName(), dto.getPrice(), dto.getCategoryName());

        }
    }
}