package star;

import java.util.Scanner;

public class star1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        int input = scanner.nextInt();
        String sum = "";
        for(int i = 0; i < input; i++){
            sum += "*";
            System.out.println(sum);
        }
    }
}
