package algorithm;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class Hackerrank2 {
    static int[] breakingRecords(int[] score) {
        int [] result = {0, 0};
        int hightNumber = score[0];
        int lowNumber = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > hightNumber) {
                hightNumber = score[i];
                result[0] += 1;
            }

            if (score[i] < lowNumber) {
                lowNumber = score[i];
                result[1] +=1;
            }
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
