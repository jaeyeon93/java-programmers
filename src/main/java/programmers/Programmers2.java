package programmers;

public class Programmers2 {
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("test"));
    }
}

class StringExercise {
    String getMiddle(String word) {
        if (word.length() % 2 != 0)
            return Character.toString(word.charAt(word.length() / 2));
        return Character.toString(word.charAt(word.length() / 2 - 1)) + Character.toString(word.charAt(word.length() / 2));
    }
}

class StringExercise2{
    String getMiddle(String word){

        return word.substring((word.length()-1)/2, word.length()/2 + 1);
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}