public class StringExam {
    public static void main(String [] args){
        String str1 = "hello";
        String str2 = "hello";
        // 이렇게 생성을 하면 메모리중에 상수들이 저장되는 영역에 저장이된다.
        // str1과 str2는 같은 인스턴스를 참조하고있다.

        String str3 = new String("new");
        String str4 = new String("new");
        // new를 사용하면 새로 인스턴스를 만든다. 그러므로 str3과 str4는 각각 다른 인스턴스를 가리킨다.
        //

        //확인
        if(str1 == str2){
            // 참조형일때는 주소값을 비교한다.
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");
        }

        if(str3 == str1){
            // 참조형일때는 주소값을 비교한다.
            System.out.println("str3과 str1는 같은 레퍼런스입니다.");
        } else {
            System.out.println("str3과 str1는 다른 레퍼런스입니다.");

        }

        if(str3 == str4){
            // 참조형일때는 주소값을 비교한다.
            System.out.println("str3과 str4는 같은 레퍼런스입니다.");
            // 안된다.
        }

        System.out.println(str1);
        System.out.println(str1.substring(3));
        System.out.println(str1);


    }
}
