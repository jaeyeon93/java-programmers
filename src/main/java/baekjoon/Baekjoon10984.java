package baekjoon;

import java.util.Scanner;

public class Baekjoon10984 {
    public static double convertGPA(double gpa) {
        if (gpa < 0.7)
            return 0;
        else if (gpa < 1)
            return 0.7;
        else if ( gpa < 1.3)
            return 1;
        else if (gpa < 1.7)
            return 1.3;
        else if (gpa < 2)
            return 1.7;
        else if (gpa < 2.3)
            return 2;
        else if (gpa < 2.7)
            return 2.3;
        else if (gpa < 3)
            return 2.7;
        else if (gpa < 3.3)
            return 3;
        else if (gpa < 3.7)
            return 3.3;
        else if (gpa < 4)
            return 3.7;
        else if (gpa < 4.3)
            return 4;
        return 4.3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semeter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < semeter; i++) {
            int numSubject = Integer.parseInt(sc.nextLine());
            int score = 0;
            float gpa = 0;
            for (int j = 0; j < numSubject; j++) {
                String [] input = sc.nextLine().split(" ");
                score += Integer.parseInt(input[0]);
                gpa += Double.parseDouble(input[1]);
            }
            System.out.println(score + " " + convertGPA((gpa / numSubject)));
        }
    }
}
