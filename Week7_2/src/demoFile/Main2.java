package demoFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("numbers.dat"));
        double sum = 0.0;
        for (int i = 1; i <= 5; i++) {
            double next = in.nextDouble();
            System.out.println("Number = " + i + " " + next);
            sum = sum + next;
        }
        System.out.println("Sum = " + sum);

        File f = new File("input.txt");
        try {
            Scanner sc = new Scanner(f);
            double x;
            double t = 0;
            DecimalFormat ft = new  DecimalFormat("##.##");
            while (sc.hasNextDouble()) {
                x = sc.nextDouble();
                System.out.println("Number: " + ft.format(x));
                t += x;
            }
            sc.close();
            System.out.println("Sum: t = " + ft.format(t));

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    // tất cả liên quan đến file đều ném ra ngoại lệ
}
