package programmers;

import java.util.Arrays;
import java.util.List;

public class Algorithm1 {
    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        List<String> nubmers = Arrays.asList(str.split(""));
        for (String s : nubmers)
            answer += Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        int reuslt = solution(123);
        System.out.println("result : " + reuslt);
    }
}
