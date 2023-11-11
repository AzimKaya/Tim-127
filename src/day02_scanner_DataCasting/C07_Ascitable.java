package day02_scanner_DataCasting;

import java.util.Scanner;

public class C07_Ascitable {
    public static void main(String[] args) {

        char chr1='a';
        char chr2='b';

        System.out.println(chr1+chr2);//97+98=195

        int sayi1=chr1;

        /*
        char data turu özel bir duruma sahiptir
         eger char datA turundeki bir veriable'i
        matematiksel islemde kullanirsaniz
        ascii tablosundaki degeri ile matemetiksel isleme girer

         */

        System.out.println("char 'a' nin int karsiligi : "+sayi1);

        char chr3='1';
        char chr4='2';

        System.out.println(chr3+chr4);



        //char 'a' int karsiligi:97


        // kullanicidan bir char alip
        // ascii table'da 0karakterden sonra gelen 3 karakteri yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen ascii table'den bir karakter giriniz");
        char krk =scanner.next().charAt(0);

        System.out.println("girilen karakterden 1 sonraki karakter : " +(char)(krk+1));
        System.out.println("girilen karakterden 2 sonraki karakter : " +(char)(krk+2));
        System.out.println("girilen karakterden 3 sonraki karakter : " +(char)(krk+3));
    }
}
