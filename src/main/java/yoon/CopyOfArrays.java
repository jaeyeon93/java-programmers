package yoon;

import java.util.Arrays;

public class CopyOfArrays {
    public static void main(String [] args) {
        double [] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};

        //배열전체를복사
        double [] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);

        // 세번째 요소까지만 복사
        double [] arCp2 = Arrays.copyOf(arOrg, 3);

        for(double d : arCpy1)
            System.out.println(d + "\t");
        System.out.println();
        }
    }
