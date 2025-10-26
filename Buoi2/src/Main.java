//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
* --- Menu ---
1. Tính tổng các phẩn tử trong mảng
2. In ra phần tử lớn nhất, nhỏ nhất trong mảng
3. Sắp xếp lại mảng theo chiều tăng dần
4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra "Không có")
Nhập lựa chọn:
* */

/*
1. Các dữ liệu liên quan đến String hoặc Hard Code nên được khai báo public static final trong một file khác, tăng tính tái sử dụng code.
2. Ở Main (Lớp thực thi / Implement class) chỉ nên gọi hàm, không nên in ra màn hình hay làm thứ gì khác.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Constants.ENTER_SIZE);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Utils.input(arr);

        boolean isContinue = true;
        while (isContinue) {
            System.out.println(Constants.MENU);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(Constants.RESULT_SUM + Utils.sum(arr));
                    break;
                case 2:
                    System.out.printf(Constants.RESULT_MAX_MIN, Utils.max(arr), Utils.min(arr));
                    break;
                case 3:
                    Utils.sort(arr);
                    System.out.println(Constants.RESULT_SORTED + java.util.Arrays.toString(arr));
                    break;
                case 4:
                    int maxPrime = Utils.maxPrime(arr);
                    if (maxPrime == -1) {
                        System.out.println(Constants.RESULT_NO_PRIME);
                    } else {
                        System.out.println(Constants.RESULT_MAX_PRIME + maxPrime);
                    }
                    break;
                default:
                    System.out.println(Constants.INVALID_CHOICE);
                    isContinue = false;
                    break;
            }
        }
//        Utils.output(arr);
    }
}