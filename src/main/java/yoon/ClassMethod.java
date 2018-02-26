package yoon;

class NumberPrinter {
    private int myNum = 0;

    static void showInt(int n){ // class method
        System.out.println(n);
    }

    static void showDouble(double n){
        System.out.println(n);
    }

    void setMyNum(int n){
        myNum = n;
    }

    void showMyNumber(){ // instance method
        showInt(myNum);
    }
}

public class ClassMethod {
    public static void main(String [] args){
        NumberPrinter.showInt(20);
        // 클래스 이름을 통한 클래스 메소드 호출

        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15); // 인스턴스 이름을 통한 클래스 메소드 호출
        np.setMyNum(75);
        np.showMyNumber();
    }
}
