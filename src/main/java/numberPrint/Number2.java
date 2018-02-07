package numberPrint;

import java.util.Scanner;

public class Number2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input :");
        int input = scanner.nextInt();
        for(int i = 1; i <= Math.pow(input, 2); i++){
            System.out.print(i + " ");
            if(i % 4 == 0){
                System.out.println();
            }
        }
    }
}
