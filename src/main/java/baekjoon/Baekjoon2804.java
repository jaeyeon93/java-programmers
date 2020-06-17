package baekjoon;

import java.util.Scanner;

public class Baekjoon2804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int findCol = findCol(a, b);
        int findRow = findRow(a, b);
        for (int row = 0; row < b.length(); row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < a.length(); col++) {
                if (col == findCol) sb.append(b.charAt(row));
                else sb.append(".");
            }
            if (row == findRow) {
                System.out.println(a);
            } else {
                System.out.println(sb.toString());
            }
        }
    }

    private static int findRow(String a, String b) {
        String [] aArr = a.split("");
        String [] bArr = b.split("");
        int row = 0;
        for (int i = 0; i < aArr.length; i++)
            for (int j = 0; j < bArr.length; j++) {
                if (aArr[i].equals(bArr[j])) {
                    return j;
                }
            }

        return row;
    }

    private static int findCol(String a, String b) {
        String [] aArr = a.split("");
        String [] bArr = b.split("");
        int col = 0;
        for (int i = 0; i < aArr.length; i++)
            for (int j = 0; j < bArr.length; j++)
                if (aArr[i].equals(bArr[j])) {
                    return i;
                }
        return col;
    }
}

// 반례
//    ABCD DCBA
//정답 :
//        D...
//        C...
//        B...
//        ABCD
