package day32_maps;

import java.util.Arrays;

public class C01_C01_StringManipulations {

    public static void main(String[] args) {

        // bir ogrencinin bilgileri arada - olarak String bir variable'a atanistir
        // isim-soyisim-sinif-sube-bolum
        // bu formatta verilen bilgiden, subeyi yazdiran bir method olusturun

        String bilgi="Ali Cem-Yıldız-10-G-Soz";

        subeYazdir(bilgi);
        // ogrencinin isim ve soyismini yazdiran bir method olusturun

       isimSoyİsimYazdir(bilgi);
    }

    public static void subeYazdir(String bilgi){
        String[] bilgilerArr=bilgi.split("-");

        System.out.println("Ogrenci sube:"+bilgilerArr[6]);



    }
public static void isimSoyİsimYazdir(String bilgi){
    String[] bilgilerArr=bilgi.split("-");

    System.out.println("İsim Syisim:"+bilgilerArr[0]+" "+bilgilerArr[1]);
}

}
