package sentence;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sentence {
    static List<String> reverseList;

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        String s = scanner.nextLine();
        System.out.println(s);
        System.out.println("문장의 길이 : " + s.length());
        int length = s.length();
        String s2 = s.substring(0, length - 1);
        System.out.println(s2);
        List<String> list = makeList(s2);
        printList(list);
        System.out.println("거꾸로 출력");
//        List<String> reverse = reverse(list);
//        printReverse(reverse);
    }


    public static List<String> makeList(String s){
        List<String> list = Arrays.asList(s.split(" "));
        return list;
    }

    public static void printList(List<String> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

//    public static List<String> reverse(List<String> list){
//        for(int i = list.size(); i > 0; i--){
//            reverseList.add(list.get(i));
//        }
//        return reverseList;
//    }
//
//    public static void printReverse(List<String> reverse){
//        for(int i = 0; i < reverse.size(); i++){
//            System.out.println(reverseList.get(i));
//        }
//    }

}
