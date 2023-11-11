package day36_GenelTekrar;

import java.util.Scanner;

public class C01_WhileLopp {

    public static void main(String[] args) {
        //Kullanıcı adı "admin", şifre "p12" olarak belirlenmiştir.
        //Kullanıcıdan kullanıcı adı ve şifre girmesi istenmelidir.
        //Kullanıcı "Kullanıcı adınızı ve şifrenizi giriniz" mesajını görmelidir.
        //Eğer kullanıcı doğru bilgileri girerse, "Hesabınızdasınız!" mesajını almalıdır.
        //Aksi halde, kullanıcı "Kullanıcı adınızı ve şifrenizi giriniz" mesajını 3 kez görmelidir.
        //3 kez yanlış giriş yapılması durumunda, "Hesabınız bloke edilmiştir" mesajını almalıdır.

        Scanner scanner = new Scanner(System.in);
        boolean sifreDogruMu = false;
        int sayac = 0;
        String gecerliKullanıcıAdi = "admin";
        String gecerliPasword = "p12";

        do {
            System.out.println("Lutfen Kullanıcı adini giriniz");
            String kullanıcıadi = scanner.next();
            System.out.println("Lutfen sifrenizi giriniz");
            String sifre = scanner.next();
            sayac++;

            if (kullanıcıadi.equals(gecerliKullanıcıAdi) && sifre.equals(gecerliPasword)) {
                System.out.println("Hesabınızdasını!");
                sifreDogruMu = true;

            } else if (sayac >= 3) {
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }


        } while (!sifreDogruMu);

    }

}