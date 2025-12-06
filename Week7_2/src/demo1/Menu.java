package demo1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLNV q = new QLNV();
        String fileName = "src/demo1/nv.dat";
        while (true){
            showMenu();
            int chon;
            Scanner scanner = new Scanner(System.in);
            chon = Integer.parseInt(scanner.nextLine());
            switch(chon) {
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1: q.nhap();
                    break;
                case 2: q.show();
                    break;
                case 3: q.luuFile(fileName);
                    break;
                case 4: q.writeFile(fileName);
                    break;
                default:

            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Nhập nhân viên");
        System.out.println("2. Hiển thị nhân viên");
        System.out.println("3. Lưu vào file");
        System.out.println("4. Đọc từ file");
        System.out.println("0. Thoát");
    }
}
