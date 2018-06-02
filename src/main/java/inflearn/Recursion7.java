package inflearn;

// 배열의 합
public class Recursion7 {
    public static void main(String[] args) {
        int [] data = {1, 3, 4, 5,6};
        int result = sum(5, data);
        System.out.println("result is " + result);
    }

    public static int sum(int n, int [] data) {
        if (n <= 0)
            return 0;
        return sum(n - 1, data) + data[n - 1];
    }
}
