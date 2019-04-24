package designpattern.decorator;

public class Mocha extends ComdimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage =  beverage;
    }

    public String getDescription() {
        return beverage.getDescription();
    }

    public double cost() {
        return beverage.cost() + 0.2;
    }
}
