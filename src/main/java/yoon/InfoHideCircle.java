package yoon;

public class InfoHideCircle {
    public static void main(String [] args){
        Circle c = new Circle(1.5);
        System.out.println("반지름 : " + c.getRad());
        System.out.println("넓이 : " + c.getArea());

        c.setRad(3.4);
        System.out.println("반지름 : " + c.getRad());
        System.out.println("넓이 : " + c.getArea());
    }
}
