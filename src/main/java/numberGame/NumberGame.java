package numberGame;

import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 맞추기 게임에 오신 것을 환영합니다.");
        System.out.println("숫자를 입력해주세요 (1-100)");
        int random = (int)Math.floor(Math.random() * 100 + 1);
        int input = scanner.nextInt();
        int count = 0;
        while (input != random){
            int input2 = scanner.nextInt();
            if (input2 > random) {
                System.out.println(input2 + "보다 작아요.");
            } else {
                System.out.println(input2 + "보다 커요.");
            }

            if(input2 == random)
                break;
            count++;
        }
        System.out.println(count+"번만에 맞췄습니다!");
        System.out.println(random);
    }
}
