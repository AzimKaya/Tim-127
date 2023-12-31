package day05İfNestetİfElseTernarySwitc;

import java.util.Scanner;

public class C03_NestedİfElse {
    public static void main(String[] args) {


        //Soru 2- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa
        //              10 urun veya fazla alirsa %20,
        //              10 urunden az alirsa %15 indirim yapin,
        //        Musteri karti yoksa
        //              10 urun veya fazla alirsa %15,
        //              10 urunden az %10 indirim yapin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Aldiginiz urun adedini giriniz");
        int urunAdedi=scanner.nextInt();

        System.out.println("Lutfen urun fiyatini giriniz");
        double urunFiyati=scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi? \n E:Evet  H:Hayir");
        char kartVarMi=scanner.next().toUpperCase().charAt(0);


        // urun adedi ana degisken olsun

        if ( kartVarMi=='E'){

            if (urunAdedi>=10){
                System.out.println("%20 indirimli toplam fiyat:"+urunAdedi*urunFiyati*80/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat:"+urunAdedi*urunFiyati*85/100);
            }



        } else if (kartVarMi=='H') {

            if (urunAdedi>=10){
                System.out.println("%15 indirimli toplam fiyat:"+urunAdedi*urunFiyati*85/100);
            }else {
                System.out.println("%110 indirimli toplam fiyat:"+urunAdedi*urunFiyati*90/100);
            }


        }else {

            System.out.println("Kart bilgisini doğru giriniz");
        }


    }
}
