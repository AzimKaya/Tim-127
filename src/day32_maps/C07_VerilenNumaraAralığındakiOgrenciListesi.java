package day32_maps;

import java.util.Map;

public class C07_VerilenNumaraAralığındakiOgrenciListesi {
    public static void main(String[] args) {
        // ogrenci map'inde verilen baslangic ve bitis numaralari (dahil) arasindaki
        // ogrencilerin numara, isim, soyisim'lerini yazdiran bir method olusturun

        Map<Integer,String>ogrenciMap=MapMethodDepo.okulMapDondur();
        MapMethodDepo.numaraAralıgındakiOgrenciListesi(ogrenciMap,103,106);
    }
}
