package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static Integer search(List<Integer> arr, int item) {
        int low = 0;
        int high = arr.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr.get(mid);
            if (guess == item)
                return mid;

            if (guess > item)
                high = mid - 1;

            if (guess < item)
                low = high + 1;

            low = mid + 1;
        }
        return null;
    }


    public static void main(String[] args) {
        List<Integer> myArr = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println(search(myArr, 3));
    }
}
