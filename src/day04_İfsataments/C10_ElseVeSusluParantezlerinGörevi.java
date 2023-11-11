package day04_İfsataments;

import java.util.Scanner;

public class C10_ElseVeSusluParantezlerinGörevi {
    public static void main(String[] args) {

        // Musteriden satin aldigi urun adedini isteyin

        // adet 100'fazla ise" %20 indirim kazandiniz"

        //adet 50'den fazla ise" %10 indirim kazandiniz"


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satin aldiginiz urun adedini giriniz");
        int adet =scanner.nextInt();



        if (adet>100){
            System.out.println("%20 indirim kazandiniz");
            System.out.println("Bizi sectiginiz icin tesekkur ederiz");
            System.out.println("kampanyalarimiz hakkinda detay icin wep sitemize bakiniz");

        } else if (adet>50) {

            System.out.println("%10 indirim kazandiniz");
            System.out.println("Bizi sectiginiz icin tesekkur ederiz");
            System.out.println("kampanyalarimiz hakkinda detay icin wep sitemize bakiniz");
        }



        /*
          if  else-if ... cumleleri else ile bitmek zorunda degildir
            AMMA eger else ile bitmezse

            bazi degerlerin kapsam disinda kalacagini bilmemiz gerekir
            EGER if veya else if'lerden sonra {} kullanilmazsa
            Java ilk ;'e kadar olan kismi body olarak kabul eder
            geriye kalan kodlar'i if else if statement ile ilgisiz kabul eder
            NOT : eger if veya else body'niz sadece 1 satir ise
                  { } kullanmadan kod yazabilirsiniz
                  ANCAK body'ye yazmaniz gereken satir sayisi 1'den fazla ise
                  MUTLAKA { } kullanmalisiniz


         */




    }
}
