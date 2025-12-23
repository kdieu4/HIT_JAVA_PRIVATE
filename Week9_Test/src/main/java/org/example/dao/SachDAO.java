package org.example.dao;

import org.example.database.JDBCUtil;
import org.example.model.Sach;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SachDAO implements DAOInterface<Sach> {

    public static SachDAO getInstance() {
        return new SachDAO();
    }

    @Override
    public int insert(Sach sach) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO Sach (id, tenSach, giaBan, namXuatBan)"
                    + " VALUES ('" + sach.getId() + "', '" + sach.getTenSach() + "', " + sach.getGiaBan() + ", " + sach.getNamXuatBan() + ")";

            ketQua = st.executeUpdate(sql);
            System.out.println("Ban da thuc thi");
            System.out.println("Co " + ketQua + " dong bi thay doi");

            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ketQua;
    }

    @Override
    public int update(Sach sach) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "UPDATE Sach"
                    + " SET "
                    + " tenSach='" + sach.getTenSach() + "\'"
                    + ", giaBan=" + sach.getGiaBan()
                    + ", namXuatBan=" + sach.getNamXuatBan()
                    + " WHERE id = '" + sach.getId() + "\'";
            System.out.println(sql);

            ketQua = st.executeUpdate(sql);
            System.out.println("Ban da thuc thi");
            System.out.println("Co " + ketQua + " dong bi thay doi");

            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ketQua;
    }

    @Override
    public int delete(Sach sach) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM Sach"
                    + " WHERE id = '" + sach.getId() + "\'";
            System.out.println(sql);

            ketQua = st.executeUpdate(sql);
            System.out.println("Ban da thuc thi");
            System.out.println("Co " + ketQua + " dong bi thay doi");

            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ketQua;
    }

    @Override
    public ArrayList<Sach> selectAll() {
        return null;
    }

    @Override
    public Sach selectById(Sach sach) {
        return null;
    }

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        return null;
    }
}
