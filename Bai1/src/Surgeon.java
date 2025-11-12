import java.util.Scanner;

public class Surgeon extends Doctor{
    private int surgeryCount ;
    private double feePerSurgery;

    public Surgeon() {
    }

    public Surgeon(String id, String name, double basicSalary, int surgeryCount, double feePerSurgery) {
        super(id, name, basicSalary);
        this.surgeryCount = surgeryCount;
        this.feePerSurgery = feePerSurgery;
    }

    public int getSurgeryCount() {
        return surgeryCount;
    }

    public void setSurgeryCount(int surgeryCount) {
        this.surgeryCount = surgeryCount;
    }

    public double getFeePerSurgery() {
        return feePerSurgery;
    }

    public void setFeePerSurgery(double feePerSurgery) {
        this.feePerSurgery = feePerSurgery;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "surgeryCount=" + surgeryCount +
                ", feePerSurgery=" + feePerSurgery +
                '}';
    }
    @Override
    public void input(){
        super.input();
        while (true) {
            try {
                System.out.print("Nhập số ca phẫu thuật: ");
                this.surgeryCount = Integer.parseInt(sc.nextLine());
                if (surgeryCount >= 0) {
                    break;
                }
                System.out.println("Lỗi: Số ca phải >= 0!");
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ!");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập phí mỗi ca: ");
                this.feePerSurgery = Double.parseDouble(sc.nextLine());
                if (feePerSurgery >= 0) {
                    break;
                }
                System.out.println("Lỗi: Phí mỗi ca phải >= 0!");
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ!");
            }
        }
    }
    @Override
    public void output() {
        super.output();
        
        System.out.printf("┃ %-8s │ %-20s │ %,15.0f │ %,10d │ %,12.0f │ %,15.0f │ %,15.0f ┃\n",
                getId(), getName(), getBasicSalary(), surgeryCount, feePerSurgery, calcIncome(), calcIncome(0.1));
    }
    public double calcIncome() {
        return  getBasicSalary()+ (surgeryCount * feePerSurgery);
    }
    public double calcIncome(double bonusRate) {
        double surgeryIncome = surgeryCount * feePerSurgery;
        double bonus = surgeryIncome * bonusRate;
        return getBasicSalary() + surgeryIncome + bonus;
    }

}
