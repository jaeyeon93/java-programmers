package yoon;

interface Printable4 {
    void print(String s);
}

class Printer4 implements Printable4 {
    public void print(String s) {
        System.out.println(s);
    }
}

public class Lambda1 {
    public static void main(String[] args) {
        Printable4 prn = new Printer4();
        prn.print("What is Lambda?");
    }
}
