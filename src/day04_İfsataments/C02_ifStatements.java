package day04_İfsataments;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {

         // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        // Java 2'li karsilastirmalari kabul eder
        // daha fazla karsilastirmaya ihtiyac varsa
        // mantiksal operatorler kullanilarak sartlar ayri ayri yazilip, birlestirilir

        if (kenar1==kenar2 && kenar2 ==kenar3 && kenar2 >0){

            System.out.println("verilen kenar uzunluklari eskenar uzunluklari olusturur");

        }

    }
}
