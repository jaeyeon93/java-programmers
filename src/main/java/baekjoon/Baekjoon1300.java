package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        if (n == 1)
            System.out.println(1);
        int [] arr = new int[n*n+1];
        for (int i = 0; i < 2*n-1; i++) {
            // n = 3; 0 < i < 5; => 0,1,2,3,4
        }
    }
}

// 1
// 1 2 2 4 => n=2일때, 2 2 4 추가
// 1 2 2 3 3 4 6 6 9 => n=3일때, 3 3 6 6 9 추가
// 1 2 2 3 3 4 4 6 6 8 8 9 12 12 16 => n=4일때, 4 4 8 8 12 12 16
// 1 2 2 3 3 4 4 4 5 5 6 6 6 8 8 9 10 10 12 12 12 15 15 16 18 20 20 25 => n=5일떄, 5 5 10 10 15 15 20 20 25
