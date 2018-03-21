package yoon;

import java.util.Random;

public class PseudoRandom {
    public static void main(String [] args) {
        Random rnd = new Random(12);

        for(int i = 0; i < 7; i++)
            System.out.println(rnd.nextInt(1000));
    }
}
