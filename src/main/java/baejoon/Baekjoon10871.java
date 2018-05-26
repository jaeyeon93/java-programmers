package baejoon;

import java.util.Scanner;

//https://www.acmicpc.net/status/?user_id=jaeyeon93&problem_id=10871&from_mine=1
public class Baekjoon10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int num = Integer.parseInt(scanner.next());
        String str = "";
        for (int i = 0; i < size; i++) {
            int inputNum = Integer.parseInt(scanner.next());
            if (inputNum < num)
                str = str + inputNum + " ";
        }
        System.out.println(str);
    }
}
