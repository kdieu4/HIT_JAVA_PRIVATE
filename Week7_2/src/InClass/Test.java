package InClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        String path = "";

        // Đọc file
        FileReader reader = new FileReader(path);
        int text = reader.read();
        while (text != -1) {
            System.out.println(text);
            text = reader.read();
        }

        // Ghi file
//        FileWriter writer = new FileWriter(path);
//        int text = reader.read();
//        while (text != -1) {
//            System.out.println(text);
//            text = reader.read();
//        }
    }
}
