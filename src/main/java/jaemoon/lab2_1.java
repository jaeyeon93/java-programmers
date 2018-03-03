package jaemoon;

import java.util.Scanner;

public class lab2_1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String first = str.toLowerCase();
        System.out.println(first);
        String second = str.replace("Test","JAVA");
        System.out.println(second);
        int index = second.indexOf("J");
        System.out.println(index);
        System.out.println(str.substring(10));

    }
}
