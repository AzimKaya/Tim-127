package day11_whiloLoop_doWhiloading;

import java.util.Scanner;

public class C11_DoWhileloppÖnemlSor {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //        sayının tam kare olup olmadığını bulunuz,
        //        tamkare ise degeri, tam kare degilse uyari yazdirin.
        //        Ornek :  input : 16, output: 4
        //                 input : 23  output: tamkare degil


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen tamkare olmasimni kontrol etmek icin bir tamsayi giriniz");
        int girilenSayi=scanner.nextInt();
        int karakok=1;
        do {
            if (karakok*karakok==girilenSayi){

                System.out.println("Girilen sayi bir tamkare ,karekok degeri :"+karakok);
            }
               karakok++;

        }while (karakok*karakok<=girilenSayi);


    }
}
