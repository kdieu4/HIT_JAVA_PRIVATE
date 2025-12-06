package demo1;

import java.io.*;
import java.net.FileNameMap;
import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
    private ArrayList<NhanVien> danhSachNV;

    public QLNV() {
        this.danhSachNV = new ArrayList<>();
    }

    public ArrayList<NhanVien> getDanhSachNV() {
        return danhSachNV;
    }

    public void setDanhSachNV(ArrayList<NhanVien> danhSachNV) {
        this.danhSachNV = danhSachNV;
    }

    public int tonTai(String ma) {
        for (NhanVien nv : this.danhSachNV) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
                return danhSachNV.indexOf(nv);
            }
        }
        return -1;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        String ma, ten;
        double luong = 0;
        String re = "^B\\d[2]";
        while (true) {
            try {
                System.out.println("Ma: ");
                ma = scanner.nextLine().toUpperCase();
                if ((ma.matches(re)) && (tonTai(ma) == -1)) {
                    break;
                } else {
                    throw new ValidException("Mã không đúng định dạng hoặc trùng mã");
                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        re = "[a-zA-Z] +";
        while (true) {
            try {
                System.out.println("Họ và tên: ");
                ten = scanner.nextLine();
                if (ten.matches(re)) {
                    break;
                } else {
                    throw new ValidException("Ten chi gom chu va dau cach");
                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        re = "[\\d.]";
        while (true) {
            try {
                System.out.println("Lương: ");
                luong = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
            danhSachNV.add(new NhanVien(ma, ten, luong));
        }
    }

    public void writeFile(String fileName) {
        ArrayList<NhanVien> nv = new ArrayList<>();
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            while ((line = br.readLine()) != null) {
                String[] s = line.split(";");
                nv.add(new NhanVien(s[0], s[1], Double.parseDouble(s[2])));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        setDanhSachNV(nv);
    }

    public void show() {
        System.out.println("Danh sách nhân viên");
        danhSachNV.forEach(System.out::println);
        System.out.println("---------------------");
    }

    public void luuFile(String fileName) {
        String st = "";
        for (int i = 0; i < danhSachNV.size() - 1; i++) {
            st += danhSachNV.get(i).getMa() + "; " + danhSachNV.get(i).getHoTen() + "; " + danhSachNV.get(i).getLuong() + "\n";
        }
        int n = danhSachNV.size();
        st += danhSachNV.get(n - 1) + "; " + danhSachNV.get(n - 1).getHoTen() + "; " + danhSachNV.get(n - 1).getLuong() + "\n";
        try {
            PrintWriter pt = new PrintWriter(fileName);
            pt.println(st);
            pt.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
