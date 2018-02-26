package yoon;

class InstCnt{
    static int instNum = 0; // class varable

    InstCnt(){ // Constructor
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}

public class ClassVar {
    public static void main(String [] args){
        InstCnt ctn1 = new InstCnt();
        InstCnt ctn2 = new InstCnt();
        InstCnt ctn3 = new InstCnt();
    }
}
