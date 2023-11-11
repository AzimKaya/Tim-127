package day17_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Runner {

    public static void main(String[] args) {

        C01 obj =new C01();
        System.out.println(obj.sayi);

//Bana rasgele bir sayi lazım

        obj.rasgeleSayiUret();
        //Bu gunku sasli sayi :980

        obj.bugunNePisireyim();
        //Bu gunun yemek teklifi:Cacik
        //Bu gunun yemek teklifi:Mercimek Crbasi

        obj.bugunNePisireyim();

        Scanner scanner=new Scanner(System.in);
        String string=new String("Java Candir");

        List<Integer>sayilar=new ArrayList<>();


        C01       obj2          =           new            C01()         ;
        // Class adi  obje adi   atama isareti   keyword       Constructor

             /*
            Constructor bir class'dan obje olusturmak istedigimizde
            o objeye olusturuldugu class'daki variable ve methodlarla ilgili
            ilk atamayi(initialize) yapan yapidir
         */






    }
}
