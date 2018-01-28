public class Bus extends Car {
    public void pang(){
        System.out.println("빵빵");
    }

    public void run(){
        super.run();
        System.out.println("Bus의 run메서드");
    }
}
