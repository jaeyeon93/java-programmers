package yoon;

import java.util.Random;

public class SeedSetRandom {
    public static void main(String [] args) {
        Random rnd = new Random(System.currentTimeMillis());

        for(int i = 0; i < 7; i++)
            System.out.println(rnd.nextInt(1000));
        Random rand = new Random();
    }
}
