import java.util.Scanner;

public class Test {

    public static boolean check(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean result = check(i);
            if (result) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
