package day03WrapperClases_Matematikselislemler;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {


        // Kullacıdan pozitif bir tam sayi alip
        // Sayinin rakamlar toplamini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");
        int girilenSayi=scanner.nextInt();

        int rakamlarTolami=0;
        int rakam=0;

        // girilen sayi:257 rakam0,rakamlar toplami=0

        rakam = girilenSayi %10;
        rakamlarTolami=rakamlarTolami+rakam;//0+7=7
        girilenSayi=girilenSayi/10;//257/10==>25,7==>25

        // girilen sayi:25 rakam7,rakamlar toplami=7

        rakam = girilenSayi %10;//25%10==>5
        rakamlarTolami=rakamlarTolami+rakam;//0+7=7
        girilenSayi=girilenSayi/10;//257/10==>25,7==>25

        // girilen sayi:2 rakam5,rakamlar toplami=12


        rakam = girilenSayi %10;//2%10==>2
        rakamlarTolami=rakamlarTolami+rakam;//0+7=7
        girilenSayi=girilenSayi/10;//257/10==>25,7==>25









        System.out.println("Girilen sayinin rakamlari tolami: " +rakamlarTolami);
    }

}
