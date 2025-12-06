import java.util.Scanner;

public class TaiKhoanThuong extends  TaiKhoan {
    private final double phiCoDinh = 50000;

    public TaiKhoanThuong() {
//        super();
    }

    public TaiKhoanThuong(String soTaiKhoan, String tenChuTK, double soDu) {
        super(soTaiKhoan, tenChuTK, soDu);
    }

    @Override
    public double tinhPhiDuyTri() {
        return phiCoDinh;
    }

    @Override
    public String toString() {
        return "[TK Thường] " + super.toString();
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
    }
}
