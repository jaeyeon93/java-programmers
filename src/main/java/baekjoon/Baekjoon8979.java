package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon8979 {
    private static class Nation implements Comparable<Nation> {
        int countryNum;
        int gold;
        int silver;
        int bronze;
        int rank;

        Nation(int countryNum, int gold, int silver, int bronze) {
            this.countryNum = countryNum;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Nation o) {
            if (this.gold > o.gold) return 1;
            if (this.gold == o.gold) {
                if (this.silver > o.silver) return 1;
                else if (this.silver == o.silver) {
                    if (this.bronze > o.bronze) return 1;
                    else if (this.bronze == o.bronze) return 0;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            return "Nation{" +
                    "countryNum=" + countryNum +
                    ", gold=" + gold +
                    ", silver=" + silver +
                    ", bronze=" + bronze +
                    ", rank=" + rank +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Nation> nationList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            nationList.add(new Nation(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }


        for (int i = 0; i < n; i++) {
            int currentRank = 1;
            Nation current = nationList.get(i);
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                Nation next = nationList.get(j);
                if (current.compareTo(next) == -1) currentRank++;
            }
            current.rank = currentRank;
        }

        for (Nation nation : nationList)
            if (nation.countryNum == k) {
                System.out.println(nation.rank);
                return;
            }
    }
}
