package baekjoon;

import java.util.Scanner;

public class Baekjoon11816 {
//    public static Integer solution(String input) {
//        String [] arr = input.split("");
//        StringBuilder sb = new StringBuilder();
//
//        if (!arr[0].equals("0")) {
//            return Integer.parseInt(input);
//        } else if (arr[1].equals("x")) {
//            // 16진수
//            int result = 0;
//            for (int i = 2; i < arr.length; i++) {
//                int temp = Integer.parseInt(arr[i]) * (int)Math.pow(16, arr.length-i-1);
//                result += temp;
//            }
//            return result;
//        } else {
//            // 8진수
//            int result = 0;
//            for (int i = 1; i < arr.length; i++) {
//                int temp = Integer.parseInt(arr[i]) * (int)Math.pow(8, arr.length-i-1);
//                result += temp;
//            }
//            return result;
//        }
//    }
    public static Integer solution(String input) {
        String [] arr = input.split("");
        if (arr[1].equals("x")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < arr.length; i++)
                sb.append(arr[i]);
            return Integer.parseInt(sb.toString(), 16);
        } else if (!arr[0].equals("0"))
            return Integer.parseInt(input);
        return Integer.parseInt(input, 8);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }
}
