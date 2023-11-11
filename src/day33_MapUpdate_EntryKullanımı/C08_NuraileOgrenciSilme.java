package day33_MapUpdate_EntryKullanımı;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C08_NuraileOgrenciSilme {
    public static void main(String[] args) {

        // verilen numaradaki ogrenciyi
        // map'den silelim

        Map<Integer,String>ogrenciMap= MapMethodDepo.okulMapDondur();
        ogrenciMap.remove(101);
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.remove(102));
        System.out.println(ogrenciMap.remove(103, "Ali-Cem-11-K-TM"));

        ogrenciMap.replace(104,"Ali-Cem-11-K-TM","Ali-Yan-10-S-TM");
        // eger eski deger verdigimiz ile ayni ise yeni degeri atama yapar

        System.out.println(ogrenciMap.containsKey(103));
        System.out.println(ogrenciMap.containsValue("Ali"));
        // value'nun icindeki degerlere degil
        // bir butun olarak value'ya bakar
        // value'su "Ali" olan yoksa false doner



    }
}
