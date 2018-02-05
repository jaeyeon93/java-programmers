package sentence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sentence {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        String s = scanner.nextLine();
        System.out.println("문장의 길이 : " + s.length());
        int length = s.length();
        String s2 = s.substring(0, length - 1);
        List<String> list = makeList(s2);
        //printList(list);
        System.out.println("거꾸로 출력");
        printReverse(list);
        System.out.println();
        System.out.println("전체 수");
        countWords(s2);
    }


    public static List<String> makeList(String s){
        List<String> list = Arrays.asList(s.split(" "));
        return list;
    }

//    public static void printList(List<String> list){
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//    }

    public static void printReverse(List<String> list){
        for(int i = list.size() - 1; i > 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.print("?");
    }

    public static void countWords(String s){
        s = s.replace(" ", "");
        System.out.println("sum is " + s.length());

    }

}
