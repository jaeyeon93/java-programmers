package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            xList.add(sc.nextInt());
            yList.add(sc.nextInt());
        }
        System.out.println(xList);
        System.out.println(yList);
        System.out.println("---");
        System.out.println(xList.indexOf(10));
    }
}
