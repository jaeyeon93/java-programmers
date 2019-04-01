import java.util.Arrays;
import java.util.List;

public class Persistance {

    public static Integer convert(int n) {
        int result = 1;
        while (n > 1) {
            int temp = n % 10;
            result *= temp;
            n /= 10;
        }
        return result;
    }

    public static Integer solution(int n, int count) {
        if (n == 4)
            return count;
        count++;
        return solution(convert(n), count);
    }

    public static void main(String[] args) {
        System.out.println(solution(39, 0));
    }
}
