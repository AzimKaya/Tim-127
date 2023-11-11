package day30_İteretter_Collattion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_İteretter {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2};

        List<Integer> sayilar = new ArrayList<>();

        for (Integer each : arr
        ) {

            sayilar.add(each);
        }
        System.out.println(sayilar);//[3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]

        //İndex kullanmadan sadece cift elelmentleri yazdirin.

        for (Integer each : sayilar
        ) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
            }

        }
        System.out.println(" ");

        //İndex kullanmadan listenin elementlerini 2 arttirin

        for (Integer each : sayilar
        ) {
            each += 2;
        }
        System.out.println(sayilar);//[3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]

        //İndex kullanmadan cift sayilari silin

        Iterator iterator = sayilar.iterator();
        System.out.println(iterator.hasNext());//true
        System.out.println(iterator.next());//3
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());//5

        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(sayilar);

        while (iterator.hasNext()){


            if (((Integer)iterator.next()) % 2 == 0    ){
                iterator.remove();
            }

        }
        System.out.println(sayilar); // [3, 5, 9, 7, 1, 3, 5, 7]

        iterator=sayilar.iterator();

        while (iterator.hasNext()){
            int sayi=(Integer)iterator.next();

            if (sayi>5){
                iterator.remove();
            }
        }
        System.out.println(sayilar);

        






    }
}
