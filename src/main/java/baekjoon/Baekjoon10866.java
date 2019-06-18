package baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Deque<String> deque = new LinkedList<>();
        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            if (input.contains("push_back"))
                deque.addLast(input.split(" ")[1]);

            if (input.contains("push_front"))
                deque.addFirst(input.split(" ")[1]);

            if (input.equals("front")) {
                if (deque.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(deque.getFirst());
            }

            if (input.equals("back")) {
                if (deque.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(deque.getLast());
            }

            if (input.equals("empty")) {
                if (deque.size() == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            }

            if (input.equals("size"))
                System.out.println(deque.size());

            if (input.contains("pop_front")) {
                if (deque.size() == 0) {
                    System.out.println(-1);
                }
                else {
                    String pollFirst = deque.pollFirst();
                    System.out.println(pollFirst);
                }
            }

            if (input.contains("pop_back")) {
                if (deque.size() == 0)
                    System.out.println(-1);
                else {
                    String pollLast = deque.pollLast();
                    System.out.println(pollLast);
                }
            }
        }
    }
}

