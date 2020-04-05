package test;

import java.util.*;

public class BTest1 {
    static String [] braces(String [] values) {
        String [] result = new String[values.length];
        Map<String, String> pair = new HashMap<>();
        pair.put("{", "}");
        pair.put("(", ")");
        pair.put("[", "]");
        for (int i = 0; i < values.length; i++)
            result[i] = solution(values[i], pair);
        return result;
    }

    private static String solution(String value, Map<String, String> pair) {
        try {
            String [] input = value.split("");
            Stack<String> stack = new Stack<>();
            if (input[0].equals("}") || input[0].equals(")") || input[0].equals("]"))
                return "NO";

            for (int i = 0; i < input.length; i++) {
                if (input[i].equals("(")|| input[i].equals("{") || input[i].equals("[")) {
                    stack.push(input[i]);
                }
                else {
                    if (stack.empty())
                        return "NO";
                    String pop = stack.pop();
                    if (!pair.get(pop).equals(input[i]))
                        return "NO";
                }
            }

            if (stack.empty())
                return "YES";
            return "NO";
        } catch (EmptyStackException e) {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String [] input = new String[t];
        for (int i = 0; i < t; i++)
            input[i] = sc.nextLine();
        String [] result = braces(input);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
