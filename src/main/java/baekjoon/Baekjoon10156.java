package baekjoon;

import java.util.Scanner;

public class Baekjoon10156 {
    public static Integer solution(int result) {
        if (result <= 0)
            return 0;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = k*n - m;
        System.out.println(solution(result));
    }
}
