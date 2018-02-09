package sentence;

import java.util.*;

public class Sentence {
    static List<String> result = new ArrayList<>();
    static List<Integer> count = new ArrayList<>();
    static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        String s = scanner.nextLine();
        int length = s.length();
        String s2 = s.substring(0, length - 1);
        List<String> list = makeList(s2);
        printReverse(list);
        System.out.println();
        countWords(s2);
        System.out.println();
        List<String> obj = alphabet(s2);
        print(obj);
        System.out.println();
        removeOverlap(obj);
        List<Integer> count = counting(obj);
        printCount(count);
        map = numberOfAlphabet(obj);
        System.out.println(map);
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
        System.out.println("전체 수 : " + s.length());
    }

    public static List<String> alphabet(String s){
        s = s.replace(" ","");
        List<String> obj = Arrays.asList(s.split(""));
        return obj;
    }

    public static void print(List<String> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static List<String> removeOverlap(List<String> obj){
        for(int i = 0; i < obj.size() -1; i++){
                if(result.contains(obj.get(i))){
                    continue;
                } else {
                    result.add(obj.get(i));
                }
            }
        return result;
    }

    public static List<Integer> counting(List<String> obj){

        for(int i = 0; i < result.size(); i++){
            int number = 0;
            for(int j = 0; j < obj.size(); j++){
                if(result.get(i) == obj.get(j)){
                    number++;
                }
            }
            count.add(number);
        }
        return count;
    }

    public static void printCount(List<Integer> count){
        for(int i = 0; i < count.size(); i++){
            System.out.print(count.get(i) + " ");
        }
    }

    public static HashMap<String, Integer> numberOfAlphabet(List<String> obj){
        for(int i = 0; i < obj.size(); i++){
            map.put(obj.get(i), 0);
        }
        return map;
    }

}
