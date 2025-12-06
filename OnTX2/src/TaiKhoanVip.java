import java.util.Scanner;

public class TaiKhoanVip extends TaiKhoan {
    private final double soDuToiThieuVip = 100000000;

    public TaiKhoanVip() {
//        super();
    }

    public TaiKhoanVip(String soTaiKhoan, String tenChuTK, double soDu) {
        super(soTaiKhoan, tenChuTK, soDu);
    }

    @Override
    public double tinhPhiDuyTri() {
        if (super.getSoDu() < soDuToiThieuVip) {
            return 10000;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "[TK VIP] " + super.toString();
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
    }
}
