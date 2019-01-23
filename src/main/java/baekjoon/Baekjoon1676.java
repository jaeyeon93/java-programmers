package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon1676 {
    public static Integer solution(BigInteger n) {
        int count = 0;
        while (true) {
            if (n.mod(BigInteger.TEN) == BigInteger.ZERO) {
                count++;
            }
            n = n.divide(BigInteger.TEN);
            if (n.mod(BigInteger.TEN) != BigInteger.ZERO)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger [] arr = new BigInteger[n+1];
        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i-1].multiply(BigInteger.valueOf(i));
        System.out.println(solution(arr[n]));
    }
}
