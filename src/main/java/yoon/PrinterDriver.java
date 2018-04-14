package yoon;

interface Printable {
    static void printLine(String str) {
        System.out.println(str);
    }
    default void print(String doc) {
        printLine(doc);
    }
}

class SPrinterDriver implements Printable {
    // S사가 정의한 클래스
    @Override
    public void print(String doc) {
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}

class LPrinterDriver implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}

public class PrinterDriver {
    public static void main(String [] args) {
        String myDoc = "This is a report about...";

        //삼성프린터
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);
        System.out.println();

        prn = new LPrinterDriver();
        prn.print(myDoc);
    }
}