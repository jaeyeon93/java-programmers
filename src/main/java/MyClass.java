public class MyClass{

    public void method1(){
        System.out.println("method1이 실행됩니다.");
    }

    public void method2(int x){
        System.out.println(x + " 를 이용하는 method2입니다.");
    }

    public int method3(){
        System.out.println("method3이 실행됩니다.");
        return 10;
    }

    public void method4(int x, int y){
        System.out.println(x + "," + y + " 를 이용하는 method4입니다.");
    }

    public int method5(int y){
        System.out.println(y + " 를 이용하는 method5입니다.");
        return 5;
    }
}