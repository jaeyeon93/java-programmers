public class VariableScopeExam {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;


        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
        // value는 블록밖이지만, 메소드 선언부에 있으므로 사용이 가능하다.
    }

    public void scopeTest2(int value2){

        System.out.println(globalScope);
        //System.out.println(localScope);
        // localScope는 블록밖이므로 사용이 안된다.
        System.out.println(value2);
        // value는 블록밖이지만, 메소드 선언부에 있으므로 사용이 가능하다.
    }

    public static void main(String [] args){
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        // class내에 있는데도 사용이 불가하다. 이유는 static에 있다.
        // static은 붕어빵의틀이다.
        // 모든 클래스는 인스턴스화 하지않은 상태로 사용할 수 없다.
        System.out.println(staticVal);
        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        // 10
        System.out.println(v2.globalScope);
        // 20
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
        // 결과는 100, 100이다.
    }
}
