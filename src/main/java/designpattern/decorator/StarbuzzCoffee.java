package designpattern.decorator;

import java.io.FileInputStream;
import java.io.InputStream;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}
