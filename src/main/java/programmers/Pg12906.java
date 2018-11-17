package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pg12906 {
    public static List<Integer> solution(int [] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println("i:" + i + "일때 값은 : " + list.get(i) + " i+1의 값은 : " + list.get(i+1));
            if (list.get(i) == list.get(i+1))
                result.add(list.get(i+1));
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,1,3,3,0,1,1};
        System.out.println(solution(arr1));
        int [] arr2 = {4,4,4,3,3};
        System.out.println(solution(arr2));
    }
}
