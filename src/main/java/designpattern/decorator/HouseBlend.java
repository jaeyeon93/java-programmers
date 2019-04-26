package designpattern.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스블랜드";
    }

    public double cost() {
        return 0.89;
    }
}
