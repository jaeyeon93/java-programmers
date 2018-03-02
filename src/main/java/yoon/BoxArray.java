package yoon;

public class BoxArray {
    public static void main(String [] args){
        Box [] ar = new Box[3];

        //배열에 인스턴스 저장
        ar[0] = new Box("first");
        ar[1] = new Box("second");
        ar[2] = new Box("third");

        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
    }
}
