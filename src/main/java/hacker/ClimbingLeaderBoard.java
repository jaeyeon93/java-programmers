package hacker;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingLeaderBoard {
    static int [] climbingLeaderboard(int[] scores, int[] alice) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.stream(scores).boxed().collect(Collectors.toList()));
        List<Integer> ranks = new ArrayList<>();
        for (int i = 0; i < alice.length; i++) {
            int temp = alice[i];
            linkedList.add(temp);
            Collections.sort(linkedList, Collections.reverseOrder());
            ranks.add(ranking(linkedList, temp));
            linkedList.remove(linkedList.indexOf(temp));
        }
        int [] arr = ranks.stream().mapToInt(i->i).toArray();
        return arr;
    }

    static Integer ranking(LinkedList<Integer> linkedList, Integer compare) {
        int rank = 1;
        Set<Integer> set = new HashSet<>();
        for (Integer i : linkedList)
            set.add(i);
        Iterator<Integer> itr=  set.iterator();
        while (itr.hasNext()) {
            if (compare < itr.next())
                rank++;
        }
        return rank;
    }

    public static void main(String[] args) {
        int [] scores = {100, 100, 50, 40, 40, 20, 10};
        int [] alices = {5, 25, 50, 120};

        int [] scores2 = {100, 90, 90, 80, 75, 60};
        int [] aclies2= {50, 65, 77, 90, 102};
        climbingLeaderboard(scores, alices);
        climbingLeaderboard(scores2, aclies2);
    }
}
