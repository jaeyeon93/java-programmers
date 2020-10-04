package kakao;

import java.util.*;

public class KakaoBlind2018Jakad {
    public static void main(String[] args) {
        int test1 = solution("FRANCE", "FRENCH");
        System.out.println(test1);
        System.out.println(solution("handshake", "shake hands"));
        System.out.println(solution("aa1+aa2", "AAAA12"));
        System.out.println(solution("E=M*C^2","e=m*c^2"));
    }

    private static int solution(String str1, String str2) {
        char [] chars1 = str1.toLowerCase().toCharArray();
        char [] chars2 = str2.toLowerCase().toCharArray();
        List<String> list1 = new ArrayList<>(1000);
        List<String> list2 = new ArrayList<>(1000);
        List<String> smaller;
        List<String> larger;
        for (int i = 0; i+1 < chars1.length; i++) {
            if (Character.isLetter(chars1[i]) && Character.isLetter(chars1[i+1]))
                list1.add(""+chars1[i]+chars1[i+1]);
        }
        for (int i = 0; i+1 < chars2.length; i++) {
            if (Character.isLetter(chars2[i]) && Character.isLetter(chars2[i+1]))
                list2.add(""+chars2[i]+chars2[i+1]);
        }
        List<String> intersect = new ArrayList<>();
        if (list1.size() > list2.size()) {
            larger = new ArrayList<>(list1);
            smaller = new ArrayList<>(list2);
        } else {
            larger = new ArrayList<>(list2);
            smaller = new ArrayList<>(list1);
        }

        for (String s : smaller) {
            if (larger.contains(s))
                intersect.add(s);
            else
                larger.add(s);
        }

        if (intersect.size() == 0) return 65536;
        double result = (intersect.size() / (double)larger.size());
        result *= 65536;
        return (int)result;
    }
}
