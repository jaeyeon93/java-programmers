package hacker;

import java.util.HashMap;

public class PDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < h.length; i++)
            map.put(String.valueOf((char)(i+97)), h[i]);
        String [] split = word.split("");
        int tallest = map.get(split[0]);
        for (int i = 0 ; i < split.length; i++) {
            if (map.get(split[i]) > tallest)
                tallest = map.get(split[i]);
        }
        return tallest * word.length();
    }

    public static void main(String[] args) {
        int [] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "abc";
        String word2 = "zaba";
        int result = designerPdfViewer(h, word);
        int result2 = designerPdfViewer(h, word2);
        System.out.println(result);
        System.out.println(result2);
    }
}
