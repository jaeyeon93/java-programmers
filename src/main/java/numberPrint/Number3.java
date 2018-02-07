package numberPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Number3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        String input = scanner.nextLine();
        List<String> list = Arrays.asList(input.split(" "));

        int line = Integer.parseInt(list.get(0));
        int plus = Integer.parseInt(list.get(1));

        ArrayList<Integer> firstLine = new ArrayList<Integer>();
        for(int i = 1; i <= 3*plus + 1; i+=2){
            firstLine.add(i);
        }

        for(int i = 0; i < line; i++){
            for(int j = firstLine.get(i); j <= firstLine.get(i) + 3*plus;j += 2){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}