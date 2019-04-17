package baekjoon;

import java.util.Scanner;

public class Baekjoon2292 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long [] arr = new long[n+1];
//        arr[1] = 1;
//        int current_layer = 2;
//        int count = 0;
//        for (int i = 2; i < arr.length; i++) {
//            if (i == n) {
//                arr[i] = current_layer;
//                System.out.println(arr[i]);
//                return;
//            }
//            arr[i] = current_layer;
//            count++;
//            if (count == 6*(current_layer-1)) {
//                current_layer++;
//                count = 0;
//            }
//        }
//        System.out.println(arr[n]);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current_layer = 2;
        int count = 0;
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 2; i <= n; i++) {
            if (i == n) {
                System.out.println(current_layer);
                return;
            }
            count++;
            if (count == 6*(current_layer-1)) {
                current_layer++;
                count = 0;
            }
        }
    }
}
