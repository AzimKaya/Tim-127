package day09_forloopVeMetodOlusturma;

import java.util.Scanner;

public class C02_FactoryelYazdirmaÖNEMLİTEKRARET {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        long faktryelSonucu=1;

        System.out.print(sayi+" != ");

        for (int i = sayi; i >=1; i--) {

            faktryelSonucu *= i;

            if (i != 1){
                System.out.print(i+" * ");
            }else {
                System.out.print(i + " = ");
            }

        }
        System.out.print(faktryelSonucu);


    }
}
