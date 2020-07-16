package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1620 {
    private static Map<Integer, Monster> map = new HashMap<>();
    private static List<Monster> monsters = new ArrayList<>();
    private static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            Monster monster = new Monster(i+1, br.readLine());
            monsters.add(monster);
            map.put(i+1, monster);
        }
        Collections.sort(monsters);
        for (int i = 0; i < m; i++)
            solution(br.readLine());
    }

    private static void solution(String input) {
        try {
            int index = Integer.parseInt(input);
            System.out.println(map.get(index).name);
            return;
        } catch (NumberFormatException e) {
            // Binary Search
            int left = 0;
            int right = monsters.size()-1;
            int mid = (left + right) / 2;
            int count = 0;
            while (right >= left || count < 10) {
                Monster next = monsters.get(mid);
                count++;
                if (next.name.equals(input)) {
                    System.out.println(next.pocketNum);
                    break;
                }

                if (next.name.compareTo(input) > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                mid = (right + left) / 2;
            }

            return;
        }
    }

    private static class Monster implements Comparable<Monster> {
        int pocketNum;
        String name;

        public Monster(int pocketNum, String name) {
            this.pocketNum = pocketNum;
            this.name = name;
        }

        @Override
        public int compareTo(Monster o) {
            return this.name.compareTo(o.name);
        }
    }
}
