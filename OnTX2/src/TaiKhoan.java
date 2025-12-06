import java.util.Scanner;

public abstract class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private double soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(String soTaiKhoan, String tenChuTK, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenChuTK() {
        return tenChuTK;
    }

    public void setTenChuTK(String tenChuTK) {
        this.tenChuTK = tenChuTK;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public abstract double tinhPhiDuyTri();

    public double getSoDuThucte() {
        return this.soDu - tinhPhiDuyTri();
    }

    @Override
    public String toString() {
        // Định dạng số cho dễ đọc
        String soDu = String.format("%,.2f", this.soDu);
        String phi = String.format("%,.2f", tinhPhiDuyTri());
        String soDuThucTe = String.format("%,.2f", getSoDuThucte());
        return "Số tài khoản: " + this.soTaiKhoan +
                ", Tên chủ tài khoản: " + this.tenChuTK +
                ", Số dư: " + this.getSoDu() + " VND" +
                ", Phí duy trì: " + this.tinhPhiDuyTri() + " VND" +
                ", Số dư thực tế: " + this.getSoDuThucte() + " VND";
    }

    public void nhapThongTin(Scanner scanner){
        System.out.println("Nhập số tài khoản: ");
        this.soTaiKhoan = scanner.nextLine();
        System.out.println("Nhập tên tài khoản: ");
        this.tenChuTK = scanner.nextLine();
        System.out.println("Nhập số dư: ");
        try {
            this.soDu = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng số, tự động gán là 0.");
            soDu = 0;
        }
    }
}
