package yoon;


class Printer implements Printable {
    // Printable을 구현하는 Print클래스
    @Override
    public void print(String doc) {
        System.out.println(doc);
    };
}

class PrintableInterface {
    public static void main(String [] args){
        Printable prn = new Printer();
        // Printable형 참조변수 선언 가능
        prn.print("Hello java");
    }
}
