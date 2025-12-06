package demo1;

public class NhanVien {
    private String ma, hoTen;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ma='" + ma + '\t' +
                ", hoTen='" + hoTen + '\t' +
                ", luong=" + luong +
                '}';
    }
}
