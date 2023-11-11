package A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {

    public static void main(String[] args) {
        String[] dizi = {"elma", "armut", "karpuz", "kiraz", "ayva"};
        char istenenHarf = 'a';

        String[] sonucDizi = istenenHarfiIcerenleriSil(dizi, istenenHarf);

        System.out.println("Orijinal Dizi: " + Arrays.toString(dizi));

        System.out.println("İstisnasız Dizi: " + Arrays.toString(sonucDizi));
    }

    public static String[] istenenHarfiIcerenleriSil(String[] dizi, char harf) {
        List<String> sonucListe = new ArrayList<>();

        for (String eleman : dizi) {
            if (!eleman.contains(String.valueOf(harf))) {
                sonucListe.add(eleman);
            }
        }

        return sonucListe.toArray(new String[0]);
    }
}
   // Bu örnekte, istenenHarfiIcerenleriSil adlı bir metot kullanılarak, verilen bir dizi içinde istenen harfi içeren öğeleri silmek için bir işlev sağlanmıştır. Bu metot, verilen diziyi dolaşır, her öğeyi kontrol eder ve istenen harfi içermeyenleri yeni bir ArrayList koleksiyonunda saklar. Ardından, bu koleksiyonu bir diziye dönüştürerek sonucu döndürür. Bu şekilde, istenen harfi içeren öğeler silinir ve geriye sadece istenmeyen öğeler kalır.







