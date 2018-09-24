package baekjoon;

import java.util.List;
import java.util.Scanner;

public class Baekjoon11005 {
    public static void main(String[] args) {
        // int a = 11 int b = 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder stb = new StringBuilder();
        while (n > 0) {
            int r = n % b;
            if (r < 10)
                stb.append((char)(r + '0'));
            stb.append((char)(10 - r + 'A'));
            n /= b;
        }
        System.out.println(stb.reverse());
    }
}
