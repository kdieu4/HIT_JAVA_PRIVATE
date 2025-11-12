import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<Surgeon> surgeons = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);


    public static void addSurgeon() {
        Surgeon surgeon = new Surgeon();
        surgeon.input();
        surgeons.add(surgeon);
    }

    public static void showALLSurGeons() {
        System.out.println("Danh sách bác sĩ ");
        for (Surgeon s : surgeons) {
            s.output();
        }
    }

    public static void searchById() {
        if (surgeons.isEmpty()) {
            System.out.println("Danh sach trong! Khong the tim kiem.");
            return;
        }

        System.out.println("\nCac ma bac sy hien co:");
        for (Surgeon s : surgeons) {
            System.out.println("- " + s.getId());
        }

        String searchId;
        do {
            System.out.print("\nNhap ma bac sy can tim: ");
            searchId = sc.nextLine().trim();

            if (searchId.isEmpty()) {
                System.out.println("Ma bac sy khong duoc de trong. Vui long nhap lai.");

            }
        } while (searchId.isEmpty());

        boolean found = false;
        for (Surgeon s : surgeons) {
            if (s.getId() != null && s.getId().trim().equalsIgnoreCase(searchId)) {
                System.out.println("=> Tim thay:");
                s.output();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay bac sy co ma: '" + searchId + "'");
            System.out.println("Hay kiem tra lai ma bac sy hoac chon chuc nang 2 de xem danh sach.");
        }
    }

    public static void sortBySurgeryCount() {
        Collections.sort(surgeons, new Comparator<Surgeon>() {
            @Override
            public int compare(Surgeon s1, Surgeon s2) {
                return Integer.compare(s1.getSurgeryCount(), s2.getSurgeryCount());
            }
        });
        System.out.println("Đã sắp xếp theo số ca phẫu thuật!");
        Main.showALLSurGeons();
    }

    public static void main(String[] args) {
       surgeons.add(new Surgeon("112","Panh",200000,23,4000));
       surgeons.add(new Surgeon("113","Panh",200000,20,4000));
       surgeons.add(new Surgeon("114","Panh",200000,19,4000));
       surgeons.add(new Surgeon("115","Panh",200000,24,4000));
        int chose;
        do {
            System.out.println("\n===== QUẢN LÝ BÁC SỸ =====");
            System.out.println("1. Thêm bác sỹ phẫu thuật");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm theo mã BS");
            System.out.println("4. Sắp xếp theo số ca");
            System.out.println("0. Thoát");

            System.out.print("Lựa chọn: ");

            chose = sc.nextInt();
            sc.nextLine();

            switch (chose) {
                case 1:
                    addSurgeon();
                    break;
                case 2:
                    showALLSurGeons();
                    break;
                case 3:
                    searchById();
                    break;

                case 4:
                    sortBySurgeryCount();
                    break;


            }

        }while(chose !=0);

    }
}