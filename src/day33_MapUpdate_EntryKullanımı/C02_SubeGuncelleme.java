package day33_MapUpdate_EntryKullanımı;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C02_SubeGuncelleme {
    public static void main(String[] args) {

        //Ogernci mapinde verilen bir subedeki tum ogerincilerin subesini yeni sube yapın

        Map<Integer,String>ogrenciMap= MapMethodDepo.okulMapDondur();
        String eskiSube="K";
        String yeniSube="C";
        ogrenciMap=MapMethodDepo.subedekiOgrencileriTasi(ogrenciMap,eskiSube,yeniSube);

    }
}
