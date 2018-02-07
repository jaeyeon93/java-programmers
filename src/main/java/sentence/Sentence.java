package sentence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sentence {
    static ArrayList<String> result;

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        String s = scanner.nextLine();
        //System.out.println("문장의 길이 : " + s.length());
        int length = s.length();
        String s2 = s.substring(0, length - 1);
        List<String> list = makeList(s2);
        System.out.println("거꾸로 출력");
        printReverse(list);
        System.out.println();
        System.out.println("전체 수");
        countWords(s2);
        System.out.println();
        List<String> obj = alphabet(s2);
        alphabetList(obj);
        printResult(result);
    }


    public static List<String> makeList(String s){
        List<String> list = Arrays.asList(s.split(" "));
        return list;
    }

    public static void printReverse(List<String> list){
        for(int i = list.size() - 1; i > 1; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.print(list.get(0));
        System.out.print("?");
    }

    public static void countWords(String s){
        s = s.replace(" ", "");
        System.out.println("sum is " + s.length());
    }

    public static List<String> alphabet(String s){
        s = s.replace(" ","");
        List<String> obj = Arrays.asList(s.split(""));
        return obj;
    }

    public static ArrayList<String> alphabetList(List <String> obj){
        for(int i = 0; i < obj.size(); i++){
//            if(result.contains(obj.get(i))){
//                continue;
//            } else {
//                result.add(obj.get(i));
//            }
            result.add(obj.get(i));
        }
        return result;
    }

    public static void printResult(List<String> result){
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}
