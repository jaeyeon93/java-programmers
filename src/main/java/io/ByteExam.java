package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam {
    public static void main(String [] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/main/java/io/ByteExam.java");
            fos = new FileOutputStream("byte.txt");

            int readData = -1;
            while((readData = fis.read()) != -1){
                fos.write(readData);
            }
        } catch (Exception e){
            // todo auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e){
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
