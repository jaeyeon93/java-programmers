package inflearnSorting;

public class MergePrac {
    public void merge(int [] arr, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;


        // 두개의 배열을 만든다.
        int [] leftArr = new int[leftSize];
        int [] rightArr =  new int[rightSize];

        for (int i = 0; i < leftSize; ++i)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < rightSize; ++j)
            rightArr[j] = arr[middle + 1 + j];

    }
}
