package coder;

import java.util.ArrayList;
import java.util.List;

public class My1 {
//    public static String solution(String document) {
//        StringBuilder sb = new StringBuilder();
//        String [] arr = document.split("");
//        for (int i = 0; i < document.length()-1; i++) {
//            if (arr[i].equals("?") && arr[i+1].equals("?")) {
//                sb.append(arr[i]);
//            } else if (arr[i].equals("!") && arr[i+1].equals("!")) {
//                sb.append(arr[i]);
//            } else if (arr[i].equals("!") && arr[i+1].equals("?")) {
//                sb.append(arr[i+1]);
//            } else if (arr[i].equals("?") && arr[i+1].equals("!")) {
//                sb.append(arr[i]);
//            } else {
//                System.out.println("arr[i] is " + arr[i] + " arr[i+1] is " + arr[i+1]);
//                sb.append(arr[i]);
//            }
//        }
//        return sb.toString();
//    }
    public static String solution(String document) {
        String returnDocument ="";
        String prev = "";
        int sameNumber = 0;
        for (int i=0;i<document.length();i++) {
            if(document.charAt(i)!='!'&&document.charAt(i)!='?') {
                returnDocument = returnDocument + prev;
                sameNumber = 0;
                prev = "";
                returnDocument = returnDocument + document.charAt(i);
            } else {
                if(i!=document.length()-1) {
                    if(document.charAt(i)=='!') {
                        if(prev!="?") {
                            prev = "!";
                            sameNumber +=1;
                        } else {
                            sameNumber +=1;
                        }
                    } else {
                        prev = "?";
                        sameNumber +=1;
                    }
                }
                else {
                    if(document.charAt(i)=='!') {
                        if(prev!="?") {
                            prev = "!";
                            sameNumber +=1;
                        } else {
                            sameNumber +=1;
                        }
                    } else {
                        prev = "?";
                        sameNumber +=1;
                    }
                    returnDocument = returnDocument + prev;
                    sameNumber = 0;
                    prev = "";
                }
            }
        }
        return returnDocument;
    }

    public static void main (String[]args){
        String test1 = "a??a ?!a a!?b b!?!C C?!!D D?!?EE ??? FF!!! !???!";
        String test2 = " a b c A B ! !!C!!! ! ! !C ?!!? ?!? ??";

        System.out.println(solution(test1));
        System.out.println("a?a ?a a?b b?C C?D D?EE ? FF! ?");

        System.out.println("=====");
        System.out.println(solution(test2));
        System.out.println(" a b c A B ! !C! ! ! !C ? ? ?");
    }
}
