package topcoder;

import java.util.Scanner;

public class DiplomasCertificates {
    public static void solution(long student, long k) {
        long diplomas = (student/(k+1))/2;
        long certificate = k*diplomas;
        long others = student - (diplomas + certificate);
        System.out.println(diplomas + " " + certificate + " " + others);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long student = sc.nextLong();
        long k = sc.nextLong();
        solution(student, k);
    }
}
