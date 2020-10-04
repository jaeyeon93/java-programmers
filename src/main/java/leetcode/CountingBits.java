package leetcode;

public class CountingBits {
    public static int [] countBits(int num) {
        int [] arr = new int[num+1];
        for (int i = 0; i <= num; i++)
            arr[i] = Integer.bitCount(i);
        return arr;
    }

    public static void main(String[] args) {

    }
}
