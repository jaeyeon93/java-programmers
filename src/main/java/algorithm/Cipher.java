package algorithm;

public class Cipher {
    public static void main(String [] args){
        int number = 12345678;

        while(number != 0){
            System.out.println(number % 10);
            number /= 10;
        }
    }
}
