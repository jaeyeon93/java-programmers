package numberPrint;

import java.util.Scanner;

public class Number5 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
