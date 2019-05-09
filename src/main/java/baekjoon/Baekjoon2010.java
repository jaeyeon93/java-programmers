package baekjoon;

import java.util.Scanner;

public class Baekjoon2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        result += sc.nextInt();
        for (int i = 0; i < num-1; i++)
            result += (sc.nextInt()-1);
        System.out.println(result);
    }
}
