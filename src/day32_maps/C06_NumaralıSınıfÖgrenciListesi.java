package day32_maps;

import java.util.Map;

public class C06_NumaralıSınıfÖgrenciListesi {
    public static void main(String[] args) {

        // verilen siniftaki ogrencilerin
        // numara, isim, soyisim ve subelerini yazdiran bir method olusturun

        Map<Integer,String>ogrenciMap=MapMethodDepo.okulMapDondur();
        System.out.println(ogrenciMap.get(107));
        // key'leri bir bir ele alip
        // o key'e ait value'yu inceleriz
        // sinif uygunsa key ve valuden'den istenen bolumleri yazdiririz

        MapMethodDepo.numaraliSınıfOgrenciListesiYazdir(ogrenciMap,"12");

    }
}
