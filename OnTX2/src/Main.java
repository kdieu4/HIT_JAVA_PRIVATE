import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<TaiKhoan> danhSachTK = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        danhSachTK.add(new TaiKhoanThuong("TK001", "Nguyễn Văn An", 50000));
        danhSachTK.add(new TaiKhoanThuong("TK002", "Trần Thị Bình", 100000));
        danhSachTK.add(new TaiKhoanVip("TK003", "Lê Hà An", 1000000000));
        danhSachTK.add(new TaiKhoanVip("TK004", "Hoàng Xuân Thiên", 2000000000));
    }

    public static void main(String[] args) {
//        String name = "Diệu";
//        char symbol = '!';
//        MyInterface myInterface = (n, s) -> {
//            System.out.println("Hello World" + s);
//            System.out.println("It is a nice day " + n);
//        };
//        myInterface.message(name,  symbol);
//
//        MyFrame myFrame = new MyFrame();


        boolean isContinue = true;
        while (isContinue) {
            showMenu();
            int choice = 0;
            System.out.println("Nhập lựa chọn (1-6):");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ");
                System.out.println("Vui lòng nhập lại!");
                continue;
            }
            switch (choice) {
                case 1:
                    nhapTaiKhoan();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    xuatVIPKKhongPhi();
                    break;
                case 4:
                    sapXepGiamDan();
                    break;
                case 5:
                    xoaTaiKhoan();
                    break;
                case 6:
                    System.out.println("Đã thoát chương trình");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại!");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n---CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN---");
        System.out.println("1. Nhập danh sách tài khoản");
        System.out.println("2. Xuất danh sách tài khoản");
        System.out.println("3. Xuất danh sách tài khoản Vip không bị tính phí duy trì");
        System.out.println("4. Sắp xếp và xuất danh sách tài khoản giảm dần theo Số dư thực tế");
        System.out.println("5. Xoá tài khoản theo soTaiKhoan nhập từ bàn phím");
        System.out.println("6. Thoát");
    }

    private static void nhapTaiKhoan() {
        System.out.println("---NHẬP TÀI KHOẢN---");
        System.out.println("Nhập loại tài khoản bạn muốn tạo: \n"
                + "1. Tài khoản thường\n"
                + "2. Tài khoản VIP");
        int choice = Integer.parseInt(scanner.nextLine());

        TaiKhoan TKMoi = null;

        switch (choice) {
            case 1:
                System.out.println("Nhập tài khoản thường: ");
                TKMoi = new TaiKhoanThuong();
                break;
            case 2:
                System.out.println("Nhập tài khoản VIP: ");
                TKMoi = new TaiKhoanVip();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
        try {
            TKMoi.nhapThongTin(scanner);
            danhSachTK.add(TKMoi);
            System.out.println("Thêm tài khoản thành công!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void xuatDanhSach() {
        System.out.println("---DANH SÁCH TÀI KHOẢN NGÂN HÀNG---");
        if (danhSachTK.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        danhSachTK.forEach(System.out::println);
    }

    private static void xuatVIPKKhongPhi() {
        System.out.println("---DANH SÁCH TK VIP KHÔNG TÍNH PHÍ (Số dư >= 100tr)---");
        boolean found = false;
        for (TaiKhoan taiKhoan : danhSachTK) {
            if (taiKhoan instanceof TaiKhoanVip) {
                if (taiKhoan.tinhPhiDuyTri() == 0) {
                    System.out.println(taiKhoan);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy tài khảon VIP nào thỏa mãn.");
        }
    }

    private static void sapXepGiamDan() {
        if (danhSachTK.isEmpty()) {
            System.out.println("Danh sách rỗng, không thể sắp xếp!");
            return;
        }
        danhSachTK.sort(Comparator.comparingDouble(TaiKhoan::getSoDu).reversed());
        System.out.println("---DANH SÁCH SAU KHI SẮP XẾP GIẢM DẦN THEO SỐ DƯ THỰC TẾ---");
        xuatDanhSach();
    }

    private static void xoaTaiKhoan() {
        System.out.println("---XÓA TÀI KHOẢN---");
        System.out.println("Nhập số tài khoản cần xóa: ");
        String soTK = scanner.nextLine();
        boolean isRemoved = danhSachTK.removeIf(tk->tk.getSoTaiKhoan().equals(soTK));
        if (isRemoved) {
            System.out.println("Đã xóa tài khoản có STK: " + soTK);
            System.out.println("---DANH SÁCH TÀI KHOẢN SAU KHI XÓA---");
            xuatDanhSach();
        }
        else {
            System.out.println("Không tìm thấy tài khoản có STK: " + soTK);
        }

    }
}