package coder;

import java.util.*;

public class MinbinaryNumber {
    public static String solution(String input) {
        if (input.length() == 1)
            return input;
        List<String> list = new LinkedList<>(Arrays.asList(input.split("")));
        for (int i = list.size()-1; i > 0; i--)
            if (list.get(i) != list.get(i-1))
                Collections.swap(list, i-1, i);

        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals("1") && list.get(i+1).equals("1"))
                list.remove(i+1);

        StringBuilder sb = new StringBuilder();

        for (String s: list)
            sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String input = sc.next();
        String result = solution(input);
        System.out.println(result);
    }

}
