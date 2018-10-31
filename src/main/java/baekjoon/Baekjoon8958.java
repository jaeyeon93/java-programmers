package baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon8958 {
    public static Integer score(String input) {
        List<String> arr = Arrays.asList(input.split(""));
        int sum = 0;
        int score = 1;
        for (int i = 0; i < arr.size()-1; i++) {
            System.out.println(i + "번째 score : " + score);
            if (arr.get(i+1).equals("O")) {
                ++score;
            }

            if (arr.get(i+1).equals("X")) {
                score = 0;
            }
            sum += score;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = score(sc.nextLine());
        System.out.println(result);
    }
}
