import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
macOS, JDK1.8
 */
public class Superb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(solution(k));
    }

    /*
    시간 복잡도 O(N)
    1~9는 주어진 조건을 만족한다. 초기값으로 1~9를 큐에다가 넣는다.
    k번 반복하면서 큐를 순회한다.
    슈퍼브 넘버라는 정의는 주어진 수 n에 대하여 n*10+n%10에서 +1, -1을 해줘야되는데 예외적인 상황은 마지막 자리수가 0,9일때 발생한다.
    끝자리가 1~8에 대해서는 n*10+n%10+1, n*10+n%10-1을 하면된다.
    끝자리가 0인경우는 +1만 가능하고, 끝자리가 9인 경우는 -1만 가능하다.
    if문에서 분기처리할때 끝자리가 0,9에 대한 예외처리를 한다.
    새로 추가되는 숫자의 경우 큐의 대기열에 계속 추가가 되므로 반복적인 작업을 수행할 수 있다.
    */
    public static int solution(int k) {
        Queue<Integer> q = new LinkedList<>();
        int num = 0;
        for (int i = 1; i < 10; i++)
            q.offer(i);

        for (int i = 1; i <= k; i++) {
            num = q.peek();
            q.remove();

            if (num % 10 != 0)
                q.add(num * 10 + num % 10 - 1);

            if (num % 10 != 9)
                q.add(num * 10 + num % 10 + 1);

        }
        return num;
    }
}
