package topcoder;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BrokenContest2 {
    public static String check(String input, List<String> freinds) {
        int count = 0;
        for (String freind : freinds)
            if (input.contains(freind))
                count++;

        if (count == 1)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        List<String> friends = Arrays.asList("Danil", "Olya", "Slava", "Ann", "Nikita");
        System.out.println(check(input, friends));
    }
}
