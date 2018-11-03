package codility;

public class TapeEquilibrium {
    public static Integer solution(int [] arr) {
        int front = 0;
        int last = 0;
        for (int i = 0; i < arr.length; i++)
            last += arr[i];

        int minDiff = Integer.MAX_VALUE;

        for (int j = 1; j < arr.length; j++) {
            front += arr[j-1];
            last -= arr[j-1];

            int diff = Math.abs(front - last);

            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int [] arr = {3, 1, 2, 4, 3};
        int result = solution(arr);
        System.out.println(result);
    }
}
