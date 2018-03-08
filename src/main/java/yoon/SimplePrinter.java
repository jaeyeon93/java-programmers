package yoon;

public class SimplePrinter {
    public static void main(String [] args) {
        String myDoc = "This is a report about...";
        Printable prn = new Printer();
        prn.print(myDoc);

        // 인터페이스의 static을 직접호출
        Printable.printLine("end of line");
    }
}
