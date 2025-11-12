import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
    Scanner sc = new Scanner(System.in) ;
    private String id;
    private String name;
    private double basicSalary;

    public Doctor() {
    }

    public Doctor(String id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }
    public void input(){
        while (true) {
            System.out.print("Nhập mã bác sỹ: ");
            this.id = sc.nextLine().trim();
            if (!id.isEmpty()) {
                break;
            }
            System.out.println("Lỗi: Mã bác sỹ không được để trống!");
        }

        while (true) {
            System.out.print("Nhập họ tên: ");
            this.name = sc.nextLine().trim();
            if (!name.isEmpty()) {
                break;
            }
            System.out.println("Lỗi: Họ tên không được để trống!");
        }

        while (true) {
            try {
                System.out.print("Nhập lương cơ bản: ");
                this.basicSalary = Double.parseDouble(sc.nextLine());
                if (basicSalary >= 0) {
                    break;
                }
                System.out.println("Lỗi: Lương phải >= 0!");
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ!");
            }
        }

    }
    public void output(){
        System.out.printf("%-8s , %-20s , %,15.9f \n" , id , name , basicSalary);
    }

}
