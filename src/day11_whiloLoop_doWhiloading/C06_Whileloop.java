package day11_whiloLoop_doWhiloading;

import java.util.Scanner;

public class C06_Whileloop {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak
        //        kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamını bulmak icin bir sayi giriniz");
        int girilenSayi=scanner.nextInt();

        int rakam =0;
        int rakamlarToplami=0;
        int geciciSayi=girilenSayi;

        while (geciciSayi>0){

            rakam=geciciSayi%10;

            rakamlarToplami+=rakam;

            geciciSayi/=10;


        }
        System.out.println(geciciSayi+"sayinin rakamlar toplami:"+rakamlarToplami);






    }
}
