package inflearnSorting;

public class QuickSort {

    int partition(int [] arr, int low, int high) {
        int pivot = arr[high];
        // pivot is last element;
        int i = low-1; // i is index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                // arr[j]가 피봇보다 작으면, i값을 먼저 증가시키고, 두 값을 교환하고, j++
                i++;

                // arr[i]와 arr[j]를 바꿔라
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // if arr[j] > pivot
        // arr[i+1]과 arr[high] (or pivot)을 바꿔라
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    // arr is sorted array
    // low -> starting index
    // high -> ending index
    void sort(int [] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index
            int pi = partition(arr, low, high);

            // recursively sort elements before
            sort(arr, low, pi -1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n -1);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
