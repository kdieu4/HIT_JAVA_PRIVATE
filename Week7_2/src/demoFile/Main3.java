package demoFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("test.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    // tất cả liên quan đến file đều ném ra ngoại lệ
}
