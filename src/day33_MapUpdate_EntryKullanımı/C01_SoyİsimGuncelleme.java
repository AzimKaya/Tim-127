package day33_MapUpdate_EntryKullanımı;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C01_SoyİsimGuncelleme {
    public static void main(String[] args) {

        // ogrenci numarasi verilen elemanin,
        // soyismini verilen yeni deger olarak update edin

        Map<Integer,String>ogrenciMap= MapMethodDepo.okulMapDondur();
       ogrenciMap=MapMethodDepo.numaraIleSoyİsimUpdate(ogrenciMap,103,"Celik");
        System.out.println(ogrenciMap.get(103));

        ogrenciMap=MapMethodDepo.numaraIleSoyİsimUpdate(ogrenciMap,105,"Demir");
        System.out.println(ogrenciMap.get(105));

    }
}
