package day04_İfsataments;

import java.util.Scanner;

public class C03_İfstatements {

    public static void main(String[] args) {


        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notumuzu giriniz ");

        double not= scanner.nextDouble();

        if (not>50){

            System.out.println("Sinifi gectin" );

        }

        if (not<50){

            System.out.println("maalesef kaldin");

        }

        if (not>=50){
            System.out.println("Sinifi gectin");

        }else {

            System.out.println("Maalesef kaldin");
        }

    }
}
