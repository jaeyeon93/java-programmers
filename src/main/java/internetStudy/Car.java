public class Car {
    String name;
    int number;

    public Car(String name){
        name = name;
    }

    public Car(){
        //this.name = "이름없음";
        //this.number = 0;
        // 기본생성자
        //this("이름없음", 0);
        System.out.println("Car입니다.");
    }

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void run(){
        System.out.println("Car의 run메소드");
    }

}
