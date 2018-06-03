package inflearn;

// 순차 탐색
public class Recursion8 {
    public static void main(String[] args) {
        int [] data = {1, 3, 5, 6, 7, 9};
        int n = data.length;
        int target = 9;
        System.out.println(search(data, n, target));
    }

    public static int search(int [] data, int n, int tartget) {
        for (int i = 0; i < n; i++)
            if (data[i] == tartget)
                return i;
        return -1;
    }
}
