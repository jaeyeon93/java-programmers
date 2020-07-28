import java.util.*;

public class KaKaoSummer {
    private static Queue<String> q = new LinkedList<>();
    private static Set<String> germs = new HashSet<>();
    private static Map<String, Integer> map = new HashMap<>();
    private static int startPoint = 0;
    private static int length = Integer.MAX_VALUE;

    public int[] solution(String[] input) {

        // 보석 넣기
        for (String germ : input)
            germs.add(germ);

        int start = 0;
        for (int i = 0; i < input.length; i++) {
            // HashMap에 보석이 있으면 갯수증가.
            if (map.containsKey(input[i]))
                map.put(input[i], map.get(input[i])+1);
            else // 보석이 없으면 넣기
                map.put(input[i], 1);
            // 큐에 보석담기
            q.add(input[i]);

            while (true) {
                String tmp = q.peek();
                if (map.get(tmp) > 1) {
                    map.put(tmp, map.get(tmp)-1);
                    q.poll();
                    startPoint++;
                } else {
                    break;
                }
            }

            if (map.size() == germs.size() && length > q.size()) {
                length = q.size();
                start = startPoint;
            }
        }
        return new int[]{start + 1, start + length};
    }

}
