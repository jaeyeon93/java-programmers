package yoon;

interface ColorPrintable extends Printable {
    // Printable을 상속하는 인터페이스
    void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & whtie ver");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}

public class PrinterDriver3 {
    public static void main(String [] args) {
        String myDoc = "This is report about...";
        ColorPrintable prn = new Prn909Drv();
        prn.print(myDoc);
        System.out.println();
        prn.printCMYK(myDoc);
    }
}
