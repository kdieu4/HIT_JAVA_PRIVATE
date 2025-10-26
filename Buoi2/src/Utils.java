import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void output(int[] arr) {
        for (int x : arr) {
            System.out.printf(x + " ");
        }
    }

    public static long sum(int[] arr) {
        long sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i + 1 < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println(arr[i] + " " + arr[j]);
//                    Utils.swap(arr[i], arr[j]);
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
//        Arrays.sort(arr);
    }

    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        else {
            for (int i = 2; i * i <= n; i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static int maxPrime(int[] arr) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) && res < arr[i]){
                res = arr[i];
            }
        }
        return res;
    }
}
