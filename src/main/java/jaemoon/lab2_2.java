package jaemoon;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2;

        double area = (s * (s - a) *(s - b) * (s - c));
        double result = Math.pow(area, 0.5);

        System.out.printf("a is %f, b is %f, c is %f, s is %f \n", a, b, c, s);
        System.out.println("area is " + result);
    }
}
