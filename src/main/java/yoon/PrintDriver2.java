package yoon;

class Prn204Drv implements Printable {
    @Override
    public void print(String doc) {
        // S사의 흑백프린터
        System.out.println("From MD-204 Printer");
        System.out.println(doc);
    }
}

class Prn731Drv implements Printable {
    // L사의 흑백프린터
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

public class PrintDriver2 {
    public static void main(String [] args) {
        String myDoc = "This is a report about...";

        Printable prn = new Prn204Drv();
        prn.print(myDoc);
        System.out.println();

        prn = new Prn731Drv();
        prn.print(myDoc);
    }
}
