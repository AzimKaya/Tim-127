package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {



        //Soru 5-Kullanicidan ismini ,soyismini alip,asagidaki formatta yazdirin .
        //       İsminiz:Jan
        //       Soyadiniz:Doe
        //       Yasiniz:44



        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        char ilkHarf=scanner.nextLine().charAt(0);

        System.out.println("Lutfen soyisminiz giriniz");
        String soyisim=scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas= scanner.nextInt();

        System.out.println("Girilen bilgiler: " + ilkHarf + soyisim +" , " + yas );







    }
}
