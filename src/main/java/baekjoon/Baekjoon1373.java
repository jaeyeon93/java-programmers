package baekjoon;

import java.util.Scanner;

public class Baekjoon1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int decimal = Integer.parseInt(str, 10);
        int result = Integer.parseInt(String.valueOf(decimal), 8);
        System.out.println(result);
    }
}
