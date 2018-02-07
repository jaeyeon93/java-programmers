package numberPrint;

import java.util.Scanner;

public class Number6 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        int input = scanner.nextInt();
        for(int i = 0; i <= input; i++){
            System.out.print((input-i) + " ");
            System.out.print(i);
            System.out.println();
        }
    }
}
