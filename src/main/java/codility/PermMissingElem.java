package codility;

import java.util.Arrays;

public class PermMissingElem {
    public static int solution(int [] arr) {
        Arrays.sort(arr);
        if (arr.length == 1)
            return 1;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != (i+arr[0]))
                return (arr[0]+1);
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 5 , 2, 4, 8, 6};
        int result = solution(arr);
        System.out.println(result);
    }
}
