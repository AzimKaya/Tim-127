package day02_scanner_DataCasting;

import java.util.Scanner;

public class C04_SwapÖneliiiiTekrar {
    public static void main(String[] args) {

        // Soru 7-(Interview) Kullanicidan iki sayi alip
                 // ikisinin degerlerini degistirin.


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen ilk tamsayi giriniz");
        int sayi1=scanner.nextInt();

        System.out.println("Lutfen ilkinci tamsayiyi giriniz");
        int sayi2=scanner.nextInt();

        System.out.println("Girdiginiz degerler : sayi1 " +sayi1 + "sayi2 " + sayi2);

        int boskova = 0;

        boskova = sayi2;

        sayi2 = sayi1;

        sayi1 = boskova;


        System.out.println("Degistirilen degerler : sayi " +sayi1 + "sayi2 "  + sayi2);





    }
}
