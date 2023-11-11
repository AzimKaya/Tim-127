package day10_method_Olusturma_methodOverlad;

import java.util.Scanner;

public class C01_SayiToplami {
    public static void main(String[] args) {


        // Verilen iki sayiyi toplayip,sonucu yazdiran bir method olusturun

        toplaYazdir(4.5,8);


        toplaYazdir(5,6.4);// Verilen iki sayinin toplami : 11.4
        toplaYazdir(7,6);// Verilen iki sayinin toplami : 13.4

        Scanner scanner =new Scanner(System.in);
        System.out.println( "Lutfen toplamak uzere iki sayi giriniz ");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();

        toplaYazdir(sayi1,sayi2);



    }// Main method sonu




    public static void toplaYazdir(double sayi1,double sayi2){
        System.out.println("Verilen iki sayinin toplami "+ (sayi1+sayi2));

    }

}
