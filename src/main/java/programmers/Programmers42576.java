package programmers;

import java.util.*;

public class Programmers42576 {
    public static String solution(String [] participant, String [] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < completion.length; i++)
            map.put(completion[i], 0);

        for (int i = 0; i < participant.length; i++) {
            if (map.get(participant[i]) == null)
                return participant[i];

            int count = map.get(participant[i]);
            map.put(participant[i], ++count);
        }
        for (String key : map.keySet())
            if (map.get(key) != 1)
                return key;
        return "hello";
    }

    public static String solution2(String [] participant, String [] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int length = completion.length;
        int i = 0;
        for (i = 0; i < length; i++)
            if (!participant[i].equals(completion[i]))
                return participant[i];
        return participant[i];
    }

    public static String solution3(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String [] participant = {"mislav", "stanko", "mislav", "ana"};
        String [] completion = {"stanko", "ana", "mislav"};

        String [] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] completion2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant, completion));
        System.out.println(solution(participant2, completion2));
    }
}
