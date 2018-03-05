package codesquad;

public abstract class CaffeineBeverage {
    public abstract void brew();

    public abstract void addCondiments();

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater(){
        System.out.println("물을 끓인다.");
    }

    protected void pourInCup(){
        System.out.println("컵에 붙는다.");
    }
}
