package baekjoon;

public class Baekjoon4673 {
    public static Integer solution(int n) {
        int sum = n;
        while (true) {
            if (n == 0)
                break;
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean [] arr = new boolean[10001];
        for (int i = 1; i < arr.length; i++)
            arr[i] = false;
        for (int i = 1; i < arr.length; i++)
            if (solution(i) <= 10000)
                arr[solution(i)] = true;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] == false)
                System.out.println(i);
    }
}
