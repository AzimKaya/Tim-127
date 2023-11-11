package day33_MapUpdate_EntryKullanımı;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C05_EntryİleSınıfListesiYazdirma {
    public static void main(String[] args) {

        // verilen sinif ve sube bilgisi ile
        // sinif listesini numara,isim,soyisim olarak yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.okulMapDondur();

        String sinif = "11";
        String sube  = "K";

        MapMethodDepo.sınıfListesiYazdirma(ogrenciMap,sinif,sube);
    }
}
