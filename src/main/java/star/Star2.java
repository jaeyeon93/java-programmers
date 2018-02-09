package star;

import java.util.Scanner;

public class Star2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        int input = scanner.nextInt();

        String sum = "";
        for(int i = 0; i < input; i++){
            sum += "*";
            System.out.println(String.format("%4s",sum));
        }
    }
}
