package algorithm;

import java.util.Scanner;

public class Baekjoon2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = "";
        for (int i = 0; i < num; i++)
            System.out.println(result += "*");
    }
}
