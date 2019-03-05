package topcoder;

import java.util.Scanner;

public class CoverPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        for (int i = 0; i < n ;i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int b = x[0] + y[0];
        for (int i = 0; i < x.length; i++)
            if (x[i]+y[i] > b)
                b = x[i]+y[i];
        System.out.println(b);
    }
}
