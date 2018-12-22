package coder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class My2 {
    public static Integer solution(String [] words) {
        int count = 0;
        for (int i = 0; i < words.length-1; i++)
            for (int j = i+1; j < words.length; j++) {
                if (check(structure(words[i]), structure(words[j]))) {
                    count++;
                }
            }

        return count;
    }

    public static boolean check(String word1, String word2) {
        if (structure(word1).equals(structure(word2)))
            return true;
        return false;
    }

    public static String structure(String str) {
        List<String> list = Arrays.asList(str.split(""));
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            sb.append(String.valueOf(map.get(s)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String [] words = {"abca", "zbxz", "opqr"};
        String [] word2 = {"aa","ab","bb","cc","cd"};
        System.out.println(solution(words));
        System.out.println(solution(word2));
    }
}
