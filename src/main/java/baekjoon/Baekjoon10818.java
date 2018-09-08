package baekjoon;

import java.util.*;

public class Baekjoon10818 {
    public static void getSolution(String size, String input) {
        List<String> list = Arrays.asList(input.split(" "));
        List<Integer> list2 = new ArrayList<>();
        for (String s : list)
            list2.add(Integer.parseInt(s));
        Collections.sort(list2);
        System.out.println(list2.get(0) + " " + list2.get(Integer.parseInt(size) - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        String input = scanner.nextLine();
        getSolution(size, input);
    }
}
