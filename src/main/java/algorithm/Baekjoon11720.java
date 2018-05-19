package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        List<String> result = Arrays.asList(str2.split(""));
        int sum = 0;
        for (String s : result)
            sum += Integer.parseInt(s);
        System.out.println(sum);
    }
}
