package day08_stringManipulations;

import java.util.Scanner;

public class C12_Forloop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //      sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //      Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int bas=scanner.nextInt();

        int tolam=0;

        System.out.println("Bitis degeri giriniz");
        int bitis=scanner.nextInt();

        int toplam=0;

         if (bitis<bas){
             System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");
         }else {

             for (int i = bas; i <= bitis; i++) {

                 tolam+=i;
             }
             System.out.println("Girilen araliktaki sayilari toplami"+tolam);
         }

    }
}
