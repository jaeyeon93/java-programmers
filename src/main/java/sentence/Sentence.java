package sentence;

import java.util.Scanner;

public class Sentence {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        String s = scanner.nextLine();
        System.out.println(s);
        System.out.println("문장의 길이 : " + s.length());
        int length = s.length();
        String s2 = s.substring(0, length - 1);
        System.out.println(s2);
        String [] split = s2.split(" ");
        for(int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }
    }
}
