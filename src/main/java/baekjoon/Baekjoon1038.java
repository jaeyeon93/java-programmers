package baekjoon;

import java.util.Scanner;

public class Baekjoon1038 {
    public static Boolean check(int n) {
        if (n <= 10)
            return true;
        int temp = n % 10; // 첫번쨰 자리수
        while (n > 0) {
            n /= 10;
            int temp2 = n % 10; // 두번째 자리수
            if (n == 0)
                break;
            if (temp >= temp2)
                return false;
            temp = n % 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int i = 0;
        while (i <= 1000000) {

            if (count == N)
                System.out.println(i);

            if (check(i)) {
                count++;
            }
            i++;

            if (N > count) {
                System.out.println(-1);
                break;
            }

        }
    }
}
