package baekjoon;

import java.util.Scanner;

public class Baekjoon1357 {
    public static Long convertDecimal(String str) {
        long result = 0;
        for (int i = str.length()-1; i >= 0; i--)
            if (str.charAt(i) == '1')
                result += Math.pow(2, str.length()-1-i);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long result = convertDecimal(str);
        StringBuilder sb = new StringBuilder();
        while (result > 0) {
            long temp = result % 8;
            sb.append(temp);
            result /= 8;
        }
        System.out.println(sb.reverse().toString());
    }
    /*
    110010101101100101011011001010110
    62554533126

     */
}
