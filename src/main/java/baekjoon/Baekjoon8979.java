package baekjoon;

import java.util.*;

public class Baekjoon8979 {
    static class Country implements Comparable<Country> {
        private int country;
        int gold;
        int silver;
        int bronze;
        int rank;

        public Country(int country, int gold, int silver, int bronze) {
            this.country = country;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Country country = (Country) o;
            return gold == country.gold &&
                    silver == country.silver &&
                    bronze == country.bronze;
        }

        @Override
        public int hashCode() {
            return Objects.hash(gold, silver, bronze);
        }

        public int getRank() {
            return rank;
        }

        public Country setRank(int rank) {
            this.rank = rank;
            return this;
        }

        @Override
        public int compareTo(Country o) {
            if (this.gold > o.gold)
                return 1;
            else if (this.gold < o.gold)
                return -1;

            // silver is same;
            if (this.silver > o.silver)
                return 1;
            else if (this.silver < this.silver)
                return -1;

            // bronze is same;
            if (this.bronze > o.bronze)
                return 1;
            else if (this.bronze < this.bronze)
                return -1;

            // everything is same
            return 0;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "country=" + country +
                    ", gold=" + gold +
                    ", silver=" + silver +
                    ", bronze=" + bronze +
                    ", rank=" + rank +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        List<Country> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            input = sc.nextLine().split(" ");
            int country = Integer.parseInt(input[0]);
            int gold = Integer.parseInt(input[1]);
            int silver = Integer.parseInt(input[2]);
            int bronze = Integer.parseInt(input[3]);
            result.add(new Country(country, gold, silver, bronze));
        }
        // 등수대로 정렬
        Collections.sort(result);
        Collections.reverse(result);
        System.out.println(result);

        // 등수매기기
        int currentRank = 1;
        for (int i = 0; i < result.size()-1; i++) {
            if (result.get(i).equals(result.get(i+1))) {
                currentRank++;
                result.get(i).setRank(currentRank+1);
                result.get(i+1).setRank(currentRank+1);
            } else {
                result.get(i).setRank(currentRank);
                currentRank++;
            }
        }

        System.out.println(result);
    }
}
