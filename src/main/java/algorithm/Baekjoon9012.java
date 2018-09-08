package algorithm;

import java.util.Scanner;

public class Baekjoon9012 {
//    public static void solution(String input) {
//        String [] arr = input.split("");
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals("(")) {
//                count++;
//            } else {
//                count--;
//            }
//            if (count < 0)
//                System.out.println("NO");;
//        }
//        if (count == 0)
//            System.out.println("YES");
//        else System.out.println("NO");
//    }
    public static void solution(String s) {
        s = s.trim();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0)
                System.out.println("NO");;
        }
        if (count == 0)
            System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++)
            solution(sc.nextLine());
    }
}
