package yoon;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String [] args) {
        Random rnd = new Random();

        for(int i = 0; i < 7; i++)
            System.out.println(rnd.nextInt(1000)); //0이상 1000미만의 난수생성

    }
}
