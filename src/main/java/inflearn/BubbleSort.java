package inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static int [] BubbleSortAsc(int [] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - 1; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j]; // 앞 원소를 임시저장
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }

    public static List<Integer> BubbleSortAsc(List<Integer> items) {
        Collections.sort(items);
        return items;
    }

    public static int [] BubbleSortDesc(int [] items) {
        for (int i = 0; i <items.length - 1; i++) {
            for (int j = 0; j < items.length - 1; j++) {
                if (items[j] < items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }

    public static List<Integer> BubbleSortDesc(List<Integer> items) {
        Collections.reverse(items);
        return items;
    }

    public static void main(String[] args) {
        int [] temp = {3, 5, 7, 9, 1, 8};
        temp = BubbleSortAsc(temp);
        System.out.print("Array Asc : ");
        for (int z : temp) {
            System.out.print(z + " ");
        }

        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.add(3);
        tempList.add(5);
        tempList.add(7);
        tempList.add(9);
        tempList.add(1);
        tempList.add(8);

        System.out.println("");
        System.out.print("List Asc : ");
        BubbleSortAsc(tempList);
        for (int z : tempList) {
            System.out.print(z + " ");
        }

        System.out.println("\n");
        temp = BubbleSortDesc(temp);
        System.out.print("Array Desc : ");
        for (int z : temp) {
            System.out.print(z + " ");
        }

        System.out.println();
        System.out.print("List Desc : ");
        BubbleSortDesc(tempList);
        for (int z : tempList) {
            System.out.print(z + " ");
        }
    }
}
