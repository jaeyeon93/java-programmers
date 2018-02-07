package numberPrint;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Number1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        String input = scanner.nextLine();
        List<String> list = Arrays.asList(input.split(" "));
        int start = Integer.parseInt(list.get(0));
        int end = Integer.parseInt(list.get(1));

        for(int i = start; i <= end; i++){
            System.out.print(i + " ");
        }

    }
}
