package demoFile;

import jdk.jshell.spi.ExecutionControl;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String fileName = "nv.dat";
        try {
            Scanner sc = new Scanner(new File(fileName));
            String line;
            DecimalFormat df = new DecimalFormat("##.#");
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] s = line.split("; ");
                String st = s[1] + "(ID#" + s[0] + ") worked ";
                int count = 0;
                double nums = 0.0;
                for (int i = 2; i < s.length; i++) {
                    nums += Double.parseDouble(s[i]);
                    count++;
                }
                double average = nums / count;
                st += df.format(nums) + " hours (" + df.format(average) + " hours a day)";
                System.out.println(st);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
