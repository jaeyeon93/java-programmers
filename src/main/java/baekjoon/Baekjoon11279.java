package baekjoon;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Baekjoon11279 {
    private static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
        if (o1 > o2) return -1;
        else if (o1 == o2) return 0;
        else return 1;
    });
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (priorityQueue.isEmpty()) System.out.println(0);
                else
                    System.out.println(priorityQueue.poll());
            } else {
                priorityQueue.add(num);
            }
        }
    }
}
