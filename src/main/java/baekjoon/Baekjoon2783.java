package baekjoon;

import java.util.Scanner;

public class Baekjoon2783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input [] = sc.nextLine().split(" ");
        double price = Double.parseDouble(input[0]);
        double perGram = Double.parseDouble(input[1]);
        double average = price / perGram;
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String [] line = sc.nextLine().split(" ");
            double compare = Double.parseDouble(line[0]) / Double.parseDouble(line[1]);
            if (compare < average)
                average = compare;
        }
        System.out.println(String.format("%.2f", average*1000));
    }
}
