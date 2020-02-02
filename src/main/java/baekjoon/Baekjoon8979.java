package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon8979 {
    private static class Nation implements Comparable<Nation> {
        int countryNum;
        int gold;
        int silver;
        int bronze;

        Nation(int countryNum, int gold, int silver, int bronze) {
            this.countryNum = countryNum;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }


        @Override
        public int compareTo(Nation o) {
            if (this.gold > o.gold)
                return -1;
            else if (this.gold == o.gold) {
                if (this.silver > o.silver)
                    return -1;
                else if (this.bronze == o.bronze) {
                    if (this.bronze > o.bronze)
                        return -1;
                    else if (this.bronze == o.bronze)
                        return 0;
                    return 1;
                }
                return 1;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int rank = Integer.parseInt(input[1]);
        Nation [] arr = new Nation[size];
        for (int i = 0; i < size; i++) {
            String [] line = sc.nextLine().split(" ");
            arr[i]  = new Nation(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            if (arr[i].countryNum == rank)
                System.out.println(i+1);

    }
}
