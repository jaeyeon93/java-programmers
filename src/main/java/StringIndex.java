import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convert(str));
    }

    private static String convert(String str) {
        StringBuilder sb = new StringBuilder();
        List<Character> strList = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        int counting = 1;
        for (int i = 0; i+1 < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                strList.add(str.charAt(i));
                numbers.add(counting);
                counting = 1;
            } else {
                counting++;
            }

            if ((i+1) == str.length()-1) {
                strList.add(str.charAt(i+1));
                numbers.add(counting);
            }

        }

        for (int i = 0; i < strList.size(); i++) {
            sb.append(strList.get(i));
            sb.append(numbers.get(i));
        }
        return sb.toString();
    }
}

// aaaabbbccca