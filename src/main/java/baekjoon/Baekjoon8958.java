package baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon8958 {
    public static Integer solution(String input) {
        List<String> arr = Arrays.asList(input.split(""));
        int sum = 0;
        int score = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals("O")) {
                ++score;
                sum += score;
            }

            if (arr.get(i).equals("X"))
                score = 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.println(solution(sc.next()));
    }
}
