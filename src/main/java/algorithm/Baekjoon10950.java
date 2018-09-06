package algorithm;

import java.util.Scanner;
//https://www.acmicpc.net/problem/10950
public class Baekjoon10950 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}