package topcoder;

import java.util.Scanner;

public class VasyaAndConrnField {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt(); // number of grasshooper
        int x [] = new int[m];
        int y [] = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++)
            System.out.println(check(x[i], y[i], n, d));
    }

    public static String check(int x, int y, int n, int d) {
        if (y >= (-x+d) && y <= (-x-d+2*n) && y >= (x-d) && y <= (x+d))
            return "YES";
        return "NO";
    }
}
