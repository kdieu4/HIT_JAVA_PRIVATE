package BTTL;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        double firstNumber =  sc.nextDouble();
        System.out.println("Nhập số thứ hai: ");
        double secondNumber =  sc.nextDouble();

        System.out.println("Tổng của hai số: " + (firstNumber + secondNumber));
        System.out.println("Hiệu của hai số: " + (firstNumber - secondNumber));
        System.out.println("Tích của hai số: " + (firstNumber * secondNumber));
        System.out.println("Thương của hai số: " + (firstNumber / secondNumber));
        System.out.println("Phần dư của hai số: " + (firstNumber % secondNumber));
    }
}
