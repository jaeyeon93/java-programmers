public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main (String [] args){
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        // gender1에는 둘중하나만 넣고싶은데, String이기때문에 아무것이나 들어간다.

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
    }
}

enum Gender {
    MALE, FEMALE;
}