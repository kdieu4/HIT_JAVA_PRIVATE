import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập GPA: ");
        double gpa = sc.nextDouble();

        System.out.println("Tên của bạn là: " + name);
        System.out.println("Bạn " + age + " tuổi");
        System.out.println("GPA: " + gpa);
    }
}