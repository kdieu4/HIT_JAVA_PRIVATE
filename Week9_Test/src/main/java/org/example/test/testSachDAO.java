package org.example.test;

import org.example.dao.SachDAO;
import org.example.model.Sach;

public class testSachDAO {
    public static void main(String[] args) {
//        Sach sach1 = new Sach("LTJA", "Lap trinh java", 50000, 2025);
//        Sach sach2 = new Sach("LTC", "Lap trinh C", 70000, 2030);
//
//        for (int i = 0; i < 1000; i++) {
//            SachDAO.getInstance().insert(new Sach("LT" + i, "Lap trinh " + i, 20000, 2015));
//        }

        // test update
//        Sach sach2 = new Sach("LT999", "Lap trinh C", 100000, 2030);
//        SachDAO.getInstance().update(sach2);

        for (int i = 0; i < 999; i++) {
            Sach sach = new Sach("LT" + i, "Lap trinh " + i, 20000, 2015);
            SachDAO.getInstance().delete(sach);
        }


//
    }
}
