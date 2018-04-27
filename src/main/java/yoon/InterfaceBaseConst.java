package yoon;

interface Scale2 {
    int DO = 0; int RE = 1; int MI = 2; int FA = 3;
    int SO = 4; int RA = 5; int TI = 6;
}

enum Scale3 { // 열거 자료형 Scale의 정의
    DO, RE, MI, FA, SO, RA, TI
}

public class InterfaceBaseConst {
    public static void main(String[] args) {
        int sc = Scale2.DO;

        switch (sc) {
            case Scale2.DO:
                System.out.println("도~ ");
                break;
            case Scale2.RE:
                System.out.println("레~ ");
                break;
            case Scale2.MI:
                System.out.println("미~ ");
                break;
            case Scale2.FA:
                System.out.println("파~ ");
                break;
            default:
                System.out.println("솔~ 라~ 시~ ");
        }
    }
}
