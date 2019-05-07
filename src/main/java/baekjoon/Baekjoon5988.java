package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon5988 {
    public static String solution(BigInteger i) {
        int mod = i.mod(BigInteger.valueOf(10)).intValue();
        if (mod % 2 == 0)
            return "even";
        return "odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++)
            System.out.println(solution(sc.nextBigInteger()));
    }
}
