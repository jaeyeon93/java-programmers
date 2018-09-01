package programmers;

import java.util.Arrays;
import java.util.List;

public class Algorithm3 {
    public static String solution(String s, int n) {
        String answer = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = (char)(s.charAt(i) + n);
            if (c > 'z')
                answer += (char)(s.charAt(i) - (26 - n));
            answer += (char)(s.charAt(i) + n);
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("z", 1);
        System.out.println("결과 : " + result);
    }
}
