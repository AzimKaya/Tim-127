package day05İfNestetİfElseTernarySwitc;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir pozitif tamsayi alin
        //Sayinin cift veya tek oldugunu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi=scanner.nextInt();

        //Sorunun if else ile cözumu
        if (sayi%2==0){
            System.out.println("Sayi cift");
        }else {
            System.out.println("Sayi tek");
        }
        //ternary ile cözumu

        System.out.println(sayi % 2 == 0  ? "sayi cift":"sayi tek");


        // sayi 100'den buyukse sayiyi 2 katina cikarin,
        // 100'den buyuk degilse degerini 10 artirin

        sayi=sayi>100 ? 2*sayi : sayi+10;

        System.out.println("Ternary'den sonra sayi:"+sayi);

        // sayinin yeni hali 100'den buyukse "sayi zaten buyuk" yazdirin
        // yeni hali 100'den buyuk degilse sayiyi 2 katina cikarin


        System.out.println(sayi>100 ? "Sayi zaten buyuk" : 2*sayi);
        // sadece yazdirma veya sadece atama olan sorularda ternary kullanilabilir
        // ama ikisi farkli islemler oldugunda kullanisli olmaz
        // bu soruda 2 katini yazdirdi ama soruda atama istiyordu, yapmadi






    }
}
