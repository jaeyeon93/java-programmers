package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon4344 {
    public static String solution(List<Integer> list) {
        int sum = 0;
        for (Integer i : list)
            sum += i;
        double avg = sum / list.size();
        int count = 0;
        for (Integer i : list)
            if (i > avg)
                count++;

        float percent = (float)count/(float)list.size() * 100;
        String result = String.format("%.3f", percent) + "%";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int student = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < student; j++) {
                list.add(sc.nextInt());
            }
            System.out.println(solution(list));
        }
    }
}
