package day16_ArrasList_ForFachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {

    public static void main(String[] args) {

        //Soru 6- Verilen pozitif bir tamsayiyi,
        //        tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.


        System.out.println(tambolenlerListesi(20));//[1, 2, 4, 5, 10, 20]

        System.out.println(tambolenlerListesi(30));//[1, 2, 3, 5, 6, 10, 15, 30]
        System.out.println(tambolenlerListesi(60));

    }

    public static List<Integer>tambolenlerListesi(int sayi){

        List<Integer>tambolenlerListesi=new ArrayList<>();

        //tambolenlerListesi.add(1);

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                tambolenlerListesi.add(i);
            }

        }

        return tambolenlerListesi;
    }

}
