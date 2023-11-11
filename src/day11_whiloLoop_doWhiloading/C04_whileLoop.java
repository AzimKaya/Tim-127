package day11_whiloLoop_doWhiloading;

import day10_method_Olusturma_methodOverlad.C05_AsalSayiMiDondur;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {




        // Kullanicidan bir asal sayi girmesini isteyin
        // Kullanici asal sayi girmezse "Bu asal degil, tekrar dene" yazdirin
        // Kullanici asal sayi girdiginde, "islem basarili olarak tamamlandi" yazdirin


        Scanner scanner = new Scanner(System.in);
        int sayi = 6 ;

        while (!C05_AsalSayiMiDondur.asalMiDondur(sayi)){// while loop boolean sart false oldugu
             //surece calisir

            System.out.println("Lutfen asal bir sayi giriniz");
            scanner=new Scanner(System.in);
            sayi=scanner.nextInt();


            if (C05_AsalSayiMiDondur.asalMiDondur(sayi)){

                System.out.println("İslem basarili olarak tamamlandi");
            }else {




            }
        }




    }
}
