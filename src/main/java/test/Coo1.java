package test;

import java.util.*;
import java.util.stream.Collectors;

public class Coo1 {
    public static int solution(int [] s1, int [] s2) {
        List<Integer> list1 = Arrays.stream(s1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(s2).boxed().collect(Collectors.toList());
        int answer = 0;
        for (int i = 0; i < list1.size(); i++)
            if (list2.contains(list1.get(i)))
                continue;
            else
                answer = list1.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] s1 = {4,99,2,6,7,13,88,76};
        int [] s2 = {6,88,13,4,99,2,7};
        System.out.println(solution(s1, s2));
    }
}
