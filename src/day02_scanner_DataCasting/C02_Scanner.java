package day02_scanner_DataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {


        // Soru 4-Kullanicidan bir dikdörtgenin 2 kenar uzunlugunu alip
        //        dikdörtgenin alanini yazdirin.


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();

        System.out.println("Dikdörtgenin alani: "+ kenar1*kenar2);



    }
}
