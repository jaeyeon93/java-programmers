package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baekjoon2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger result = new BigInteger("1");

        for (int i =  n; i > n-m; i--)
            result = result.multiply(BigInteger.valueOf(i));

        for (int i = 1; i <= m; i++)
            result = result.divide(BigInteger.valueOf(i));
        System.out.println(result);
    }
}
