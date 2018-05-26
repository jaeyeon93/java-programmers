package baejoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());
        int num5 = Integer.parseInt(scanner.nextLine());
        List<Integer> result = new ArrayList<>();
        List<Integer> list = Arrays.asList(num1, num2, num3, num4, num5);
        for (Integer i : list) {
            if (i > 40)
                result.add(i);
            else if (i <= 40) {
                result.add(40);
            }
        }
        int sum = result.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum / list.size());
    }
}
