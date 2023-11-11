package day14_Arrays;

import java.util.Arrays;

public class C06_StringSplit {

    public static void main(String[] args) {

        String str = "About 197.000.000 results (0,43 seconds) ";
        // arama sonuc sayisinin 1 milyondan cok oldugunu test edin

        String [] kelimeler  =str.split("  ");

        System.out.println(Arrays.toString(kelimeler));// [About, 197.000.000, results, (0,43, seconds)]










    }
}
