package numberPrint;

import java.util.Scanner;

public class Number4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        int input = scanner.nextInt();
        for(int i = 0; i < input; i++){
            print(i);
            System.out.println();
        }
    }
    public static void print(int i){
        if (i % 2 ==0 ){
            for(int j = 4*i + 1; j < 4*i + 5 ;j++){
                System.out.print(j + " ");
            }
        } else {
            for(int j = 4*i + 4; j > 4*i ;j--){
                System.out.print(j + " ");
            }
        }
    }
}
