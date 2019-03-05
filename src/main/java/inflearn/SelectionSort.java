package inflearn;

public class SelectionSort {
    public void sort(int [] data) {
        int size = data.length;
        int min;
        int temp;

        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (data[min] > data[j])
                    min = j;
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] data = {66, 10, 1, 99, 5, 7, 33};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] : " + data[i]);
        }
    }
}
