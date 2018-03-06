package yoon;

class SuperCLS {
    protected static int count = 0;
    // protected는 하위 클래스 접근을 허용
    public SuperCLS(){
        count++;
    }
}

class SubCLS extends SuperCLS {
    public void showCount(){
        System.out.println(count);
    }
}


public class SuperSubCon {
    public static void main(String [] argRs){
        new SubCLS();
    }
}
