package day09_forloopVeMetodOlusturma;

import java.util.Scanner;

public class C04_rakamlarToplamiÖNEMLİTEKRAR {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //        rakamlar toplamini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami=0;
        int rakam=0;

        for (int i = girilenSayi; i>0; i/=10) {
            rakam=i%10;
            rakamlarToplami+=rakam;

        }
        System.out.println(girilenSayi+"sayisinin rakamlar tolami:"+rakamlarToplami);

        //ayni soruyu basamak sayisi kadar tekrar ederek cözelim,

        rakamlarToplami=0;
        rakam=0;
        int basamakSayisi=(girilenSayi+"").length();
        int sayi=girilenSayi;

        //1234 basamak sayisi :4

        for (int i = 1; i <=basamakSayisi ; i++) {
            rakam=sayi% 10;
            rakamlarToplami+=rakam;
            sayi/=10;


        }
        System.out.println(girilenSayi+"sayisinin rakamlar tolami:"+rakamlarToplami);

    }
}
