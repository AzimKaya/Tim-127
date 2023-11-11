package day04_İfsataments;

import java.util.Scanner;

public class C06_İfElseStatements {
    public static void main(String[] args) {

        //     Soru 5- Kullanicidan bir harf isteyin,
        //             girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //             yoksa girilen karakteri yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char krk =scanner.next().charAt(0);

        if (krk>='a' && krk <='z'){

            System.out.println(Character.toUpperCase(krk));
        }else {
            System.out.println(krk);

        }
    }
}
