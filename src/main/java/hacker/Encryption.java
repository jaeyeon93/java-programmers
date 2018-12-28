package hacker;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
    static void encryption(String s) {
       int row = (int)Math.floor(Math.sqrt(s.length()));
       int column = (int)Math.ceil(Math.sqrt(s.length()));
       for (int i = 0; i < column; i++)
           for (int j = i; j < s.length(); j += column)
               System.out.print(s.charAt(j));
            System.out.println(" ");
    }

    public static void main(String[] args) {
        encryption("chillout");
    }
}
