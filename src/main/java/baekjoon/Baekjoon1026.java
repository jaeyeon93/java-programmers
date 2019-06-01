package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1026 {
    public static Integer solution(int [] arr1, int [] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum = 0;
        for (int i = 0; i < arr1.length; i++)
            sum += arr1[i] * arr2[arr2.length-1-i];
        return sum;
    }

    public static Integer solution2(List<Integer> list1, List<Integer> list2) {
        List<Integer> sorted2 = quickSort(list2);
        List<Integer> sorted1 = quickSort(list1);
        int sum = 0;
        for (int i = 0; i < list1.size(); i++)
            sum += sorted1.get(i) * sorted2.get(sorted2.size()-1-i);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list1.add(sc.nextInt());

        for (int i = 0; i < n; i++)
            list2.add(sc.nextInt());
        System.out.println(solution2(list1, list2));
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() < 2)
            return arr;

        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++)
            if (arr.get(i) < pivot)
                left.add(arr.get(i));
            else
                right.add(arr.get(i));

        List<Integer> sorted = quickSort(left);
        sorted.add(pivot);
        sorted.addAll(quickSort(right));

        return sorted;
    }
}
