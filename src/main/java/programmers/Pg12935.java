package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Pg12935 {
    public static int [] solution(int [] arr) {
        if (arr.length == 1) {
            int [] answer = {-1};
            return answer;
        }
        int [] answer;
        Arrays.sort(arr);
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        list.remove(list.size()-1);
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static int[] solution2(int[] arr) {
        if(arr.length > 1) {
            int min = Arrays.stream(arr).sorted().findFirst().getAsInt();
            ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

            list.remove((Object)min);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
        else {
            return new int[]{-1};
        }
    }
    public static void main(String[] args) {
        int [] arr1 = {4,3,2,1};
        int [] arr2 = {10};
        int [] result1 = solution(arr1);
        int [] result2 = solution(arr2);
        for (int i : result1)
            System.out.print(i + " ");
        System.out.println();

        for (int i : result2)
            System.out.print(i + " ");
    }
}
