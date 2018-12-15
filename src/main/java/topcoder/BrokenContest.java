package topcoder;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BrokenContest {
    public static List<String> split(String input) {
        if (input.contains("_"))
            return Arrays.asList(input.split("_"));
        return Arrays.asList(input.split("And"));
    }

    public static String check(List<String> list, List<String> friends) {
        if (list.contains("Alex"))
            return "NO";

        int count = 0;
        for (String friend : friends) {
            if (list.contains(friend))
                count++;
        }

        if (count > 1)
            return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        List<String> friends = Arrays.asList("Danil", "Olya", "Slava", "Ann", "Nikita");
        System.out.println(check(split(input), friends));
    }
}
