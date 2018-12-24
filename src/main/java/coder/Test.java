package coder;

public class Test {
    public static void main(String[] args) {
//		String document = "a??a ?!a a!?b b!?!C C?!!D D?!?EE ??? FF!!! !???!" ;
        String document = "a b c A B ! !!C!!! ! ! !C ?!!? ?!? ??";
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
//		returnDocument = returnDocument + document.charAt(i);
        }
        System.out.println(returnDocument);
    }
}
