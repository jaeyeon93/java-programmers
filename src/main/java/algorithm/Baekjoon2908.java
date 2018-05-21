package algorithm;

import java.util.Scanner;

public class Baekjoon2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = String.valueOf(scanner.nextInt());
        String str2 = String.valueOf(scanner.nextInt());
        StringBuffer stringBuffer1 = new StringBuffer(str1).reverse();
        StringBuffer stringBuffer2 = new StringBuffer(str2).reverse();
        int num1 = Integer.parseInt(stringBuffer1.toString());
        int num2 = Integer.parseInt(stringBuffer2.toString());
        if (num1 > num2) {
            System.out.println(num1);
            return;
        }
        System.out.println(num2);
    }
}
