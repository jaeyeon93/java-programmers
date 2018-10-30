package baekjoon;


import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1152
public class Baekjoon1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        System.out.println(tokenizer.countTokens());
    }
}
