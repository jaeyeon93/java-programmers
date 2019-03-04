package inflearnSorting;

public class MergeSort2 {
    void merge(int [] arr, int left, int middle, int right) {
        // Find size of two subArrays to be merged
        int leftSize = middle - left + 1;
        int rightSize = right - middle;
        // 원래는 right - (middle + 1) + 1;

        //create Two Arrays
        int [] leftArr = new int [leftSize];
        int [] rightArr = new int [rightSize];

        // copy data to temp arrays
        for (int i = 0; i < leftSize; ++i)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < rightSize; ++j)
            rightArr[j] = arr[middle + 1 + j];

        // merge the temp arrays

        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // leftArr에 아직 데이터가 남아있다.
        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // rightArr 아직 데이터가 남아있다.
        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    void sort(int [] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Given array");
        printArray(arr);

        MergeSort2 ob = new MergeSort2();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\n Sorted Array");
        printArray(arr);
    }
}
