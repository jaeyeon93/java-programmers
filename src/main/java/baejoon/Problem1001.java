package baejoon;

import java.util.Scanner;

public class Problem1001 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] array = input.split(" ");
        int first = Integer.parseInt(array[0]);
        int second = Integer.parseInt(array[1]);
        System.out.print(first - second);
    }
}
