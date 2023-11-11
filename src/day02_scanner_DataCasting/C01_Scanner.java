package day02_scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // Soru: 1- Kullanicidan uc farkli data turunde deger alip
        //          girilen degerleri aciklamalariyla yazdirin


        // 1.adim : scanner objesi oluşturmak

        Scanner scanner=new Scanner(System.in);

        //2.Adim :kullaniciya ne istediginizi söyleyin



        //3. Adim İstediginiz datanin turuna uygun bir veriable olusturup
        //     data turune  uygun next...() ile  bilgiyi alip kaydedin
        //String girilenİsim=scanner.next();//sadece ilk ismi alir

        System.out.println("Lutfen isminizi giriniz");
        String girilenisim =scanner.nextLine();

        System.out.println("Girdiginiz isim: "+ girilenisim);

        // ikinci olarak bir tamsayi isteyelim mesela yasini isteyelim


        System.out.println("Lutfen yasinizi giriniz");
        int yas =scanner.nextInt();
        System.out.println("Yasiniz: " +yas);


        //emekli misiniz?/true/folse

        System.out.println("Emekli misiniz? true veya false olarak giriniz");
        boolean emekliMi=scanner.nextBoolean();

        System.out.println("Girdiginiz isim : " + girilenisim);
        System.out.println("Yasiniz:"+yas);
        System.out.println("Emekli misiniz:"+ emekliMi);


    }
}
