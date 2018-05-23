package yoon;
interface Printable6 {
    void print(String s);
}

public class Lambda4 {
    public static void ShowString(Printable6 p, String s) {
        p.print(s);
    }

    public static void main(String[] args) {
        ShowString((s) -> { System.out.println(s); }, "What is Lambda?");
    }
}
