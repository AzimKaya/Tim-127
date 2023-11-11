package day11_whiloLoop_doWhiloading;

import java.util.Scanner;

public class C03_Whileloop {
    public static void main(String[] args) {



        // Kullanicidan toplanmak uzere sayilar isteyin
        // Kullanici 0'a basincaya kadar islemi tekrar ettirin
        // Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin
        // Dongunun kac kere calisacagi belli olmayan islemlerde while loop tercih edilir

        Scanner scanner = new Scanner(System.in);
        double sayi = 1;
        double toplam = 0;
        /*
            Kullanicidan alacagimiz sayi 0 olmadigi surece kod calisacak
            loop'dan once bu sayiyi olusturmamiz gerekir ki
            while() icinde kullanabilelim
            NOT : ilk deger atamasi yaparken
                  loop'un ilk calismasini engellemeyecek bir deger atamaya
                  DIKKAT EDILMELIDIR
         */


        while (sayi !=0){
            System.out.println("Toplamak uzere sayilar giriniz\n Bitirmek icin 0'basiniz");

            sayi=scanner.nextDouble();

            toplam+= sayi;


        }

        System.out.println("Girilen sayilarin toplami");



    }
}
