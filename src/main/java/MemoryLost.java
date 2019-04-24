import java.util.Scanner;

public class MemoryLost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        while (sum <= n) {
            sum += a;
            if (sum >= n) {
                day++;
                System.out.println(day);
                break;
            }
            day++;
            sum -= b;
        }

    }
}
