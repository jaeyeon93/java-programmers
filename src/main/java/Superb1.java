import java.util.*;
/*
macOS, JDK1.8
 */
public class Superb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(a, b, k));
    }

    /*
    시간 복잡도 O(N)
    a,b의 배수를 우선 List에 입력받는다.
    list에는 중복된 값(a,b의 공배수)가 들어가지만 TreeSet을 이용하면 정렬과 동시에 중복이 제거된다.
    k번째 값을 가져올때, List<Integer> result = new ArrayList<>(set)을 하는 방법과 Iterator를 이용한 방법이 있지만, List를 새로 만들면 새로 만드는거 자체가 비용이기 때문에 Iterator를 이용해서 순회하는 방식을 이용
    */
    public static int solution(int a, int b, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++)
            if (i % a == 0 || i % b == 0) list.add(i);
        TreeSet<Integer> sortedSet = new TreeSet<>(list);
        int count = 0;
        int result = 0;
        Iterator<Integer> itr = sortedSet.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            count++;
            if (count == k) {
                result = num;
                break;
            }
        }
        return result;
    }
}
