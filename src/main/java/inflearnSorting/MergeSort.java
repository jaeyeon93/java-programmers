package inflearnSorting;

public class MergeSort {

    public static void merge(int [] data, int p, int q, int r) {
        int i = p;
        int j = q+1;
        int k = p;
        int [] tmp = new int[data.length];
        // tmp라는 합쳐질 배열의 이름
        while (i <= q && j <= r) {
            // i<=q는 아직 앞쪽에 데이터가 남아있다는 뜻이다. j<=r은 뒷쪽배열에 아직 데이터가 있다.
            if (data[i] <= data[j])
                tmp[k++] = data[i++];
            // data[i]가 data[j]보다 작으면 data[i]가 tmp[k]로 내려오고, k와 i의 값을 1씩 증가시킨다.
            tmp[k++] = data[j++];
            // data[i]와 data[j]를 비교를 해서 더 작은값을 tmp[k]에다가 넣는다.
        }
        // 위의 while문을 빠져나온것은 i가 q를 넘어갔거나. j가 r을 넘어간것이다.

        while (i <= q)
            tmp[k++] = data[i++];
        // 앞쪽 배열에 데이터가 남아있다면 그대로 데이터를 옮겨라
        while (j <= r)
            tmp[k++] = data[j++];
        // 뒤쪽 배열에 데이터가 남아있으면 그대로 데이터를 옮겨라

        //tmp에 있는 데이터를 원래데이터 data[]에 그대로 다시 옮겨줘야한다.
        for (int a = p; a <= r; a++)
            data[a] = tmp[a];
    }
}
