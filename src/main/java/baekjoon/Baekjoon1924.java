package baekjoon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Baekjoon1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.of(2007, sc.nextInt(), sc.nextInt());
        DayOfWeek week = date.getDayOfWeek();
        int value = week.getValue();
        if (value == 1)
            System.out.println("MON");
        else if (value == 2)
            System.out.println("TUE");
        else if (value == 3)
            System.out.println("WED");
        else if (value == 4)
            System.out.println("THU");
        else if (value == 5)
            System.out.println("FRI");
        else if (value == 6)
            System.out.println("SAT");
        else if (value == 7)
            System.out.println("SUN");

    }
}
