package book;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("아이디 : ");
        String id = console.readLine();

        System.out.print("password : ");
        char[] charPass = console.readPassword();
        String strPassword = new String(charPass);

        System.out.println("--------------");
        System.out.println(id);
        System.out.println(strPassword);
    }
}
