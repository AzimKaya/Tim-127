package day33_MapUpdate_EntryKullanımı;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C07_EntryİleSoyİsimUplude {
    public static void main(String[] args) {

// okulMap'deki tum soyisimleri buyuk harf yapan bir method olusturu

        Map<Integer,String>ogrenciMap= MapMethodDepo.okulMapDondur();

        ogrenciMap =MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
