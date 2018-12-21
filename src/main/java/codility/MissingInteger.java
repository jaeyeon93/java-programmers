package codility;

import java.util.*;
import java.util.stream.Collectors;

public class MissingInteger {
    public static Integer solution2(int [] A) {
        Arrays.sort(A);
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        int result = 1;
        for (Integer i : list)
            if (list.contains(result))
                result++;
        return result;
    }

    public static Integer solution(int [] A) {
        int result = 1;
        Set<Integer> myset = new HashSet<>();
        for (int i = 0; i < A.length; i++)
            myset.add(A[i]);
        while (myset.contains(result))
            result++;
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,6,4,1,2};
        int [] arr2 = {1,2,3};
        int [] arr3 = {-1, -3};
        int result = solution(arr);
        System.out.println(result);
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }
}
