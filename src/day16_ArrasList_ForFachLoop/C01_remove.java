package day16_ArrasList_ForFachLoop;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C01_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler);

        System.out.println(isimler.remove("Deniz"));
        System.out.println(isimler);
        System.out.println(isimler.removeAll(isimler));
        System.out.println(isimler);

        List<String> isimler5 = new ArrayList<>();
        isimler5.add("Deniz");
        isimler5.add("Omer");
        isimler5.add("Esra");
        isimler5.add("Hamza");
        isimler5.add("Basak");

        System.out.println(isimler5);

        System.out.println(isimler5.size());
        System.out.println(isimler5.contains("Deniz"));
        System.out.println(isimler5.indexOf(1));


        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Deniz");
        silinecekler2.add("Gulnur");

        System.out.println(isimler.remove(2));
        System.out.println(isimler);

        System.out.println(isimler.remove("Hamza"));//Turue
        System.out.println(isimler);//[Deniz, Omer, Basak]

        System.out.println(isimler.removeAll(silinecekler2));

        System.out.println(isimler);

        List<Integer>sayilar= new ArrayList<>();
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);
        System.out.println(sayilar);//[3, 2, 8]


        // Eger List sayilardan olusuyorsa
        // remove(2) yazdigimizda 2'nin element mi yoksa index mi olacagini netlestirmek gerekir
        // Java bu durumu netlestirmek icin
        // sayilardan olusan list'lerde yazilan sayiyi INDEX olarak kabul eder

        System.out.println(sayilar.remove(2));//8
        System.out.println(sayilar);//[3, 2]

        // illa da obje olan 2'yi silmek istiyorsak ve index'ini bilmiyorsak
        // Once silmek istedigimiz elementi bir obje (non-primitive) olarak tanimlamaliyiz

        Integer silinecekSayi=2;
        System.out.println(sayilar.remove(silinecekSayi));//Turue
        System.out.println(sayilar);//[3]

        sayilar.clear();
        System.out.println(sayilar);//[]




    }
}
