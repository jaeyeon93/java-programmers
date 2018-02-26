public class StringMethodExam {
    public static void main(String [] args){
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));
        System.out.println(str);
        // 문자열과 문자열을 결합, 하지만 변환을 해주는것은 아니다.
        str = str.concat(" world");
        System.out.println(str);
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));

    }
}