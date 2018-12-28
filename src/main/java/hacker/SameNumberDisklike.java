package hacker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SameNumberDisklike {
    public static int [] solution(int [] arr) {
        List<Integer> answer = new ArrayList<>();
        int value = arr[0];
        answer.add(value);

        for (int i = 1; i < arr.length; i++) {
            if (value != arr[i]) {
                answer.add(arr[i]);
                value = arr[i];
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int [] arr = {1,1,3,3,0,1,1};
        solution(arr);

        int [] arr2 = {4,4,4,3,3};
        solution(arr2);
    }
}
