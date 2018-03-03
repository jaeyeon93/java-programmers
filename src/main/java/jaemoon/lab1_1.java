package jaemoon;

import java.util.Calendar;
import java.util.Scanner;

public class lab1_1 {
    public static void main(String [] args){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name? ");
        String name = scanner.next();
        System.out.print("Birth? ");
        int birth = scanner.nextInt();
        int age = year - birth + 1;
        System.out.printf("%s's %d years old", name, age);

    }
}
