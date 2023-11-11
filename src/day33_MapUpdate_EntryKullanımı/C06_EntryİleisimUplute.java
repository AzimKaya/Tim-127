package day33_MapUpdate_EntryKullanımı;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C06_EntryİleisimUplute {
    public static void main(String[] args) {

        // Tum listeyi gozden gecirerek
        // isimleri ilk harfi buyuk, sonraki harfler kucuk olacak sekilde
        // update eden bir method olusturun

        Map<Integer,String>ogrenciMapi= MapMethodDepo.okulMapDondur();
        ogrenciMapi=MapMethodDepo.isimduzenle(ogrenciMapi);

        System.out.println(ogrenciMapi);

    }
}
