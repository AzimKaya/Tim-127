package day04_İfsataments;

import java.util.Scanner;

public class C08_İfElseStatements {
    public static void main(String[] args) {

        // ogrenciden notu alip gectin veya kaldin yazdiralim
        // ogrenci 0'dan kucuk veya 100'den buyuk bir not girerse
        // "gecersiz not" yazdiralim


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        double not = scanner.nextDouble();

        if (not > 100||not<0 ){
            System.out.println("Gecersiz not ");

        } else if (not>=50) {
            System.out.println("sinifta gectin");


        }else {
            System.out.println("Maalesef sinifta kaldin");


        }


    }
}
