package day05İfNestetİfElseTernarySwitc;

import java.util.Scanner;

public class C10_SwithtStatemenets {
    public static void main(String[] args) {


        // kullanicidan gun numarasini alip
        // hafta ici veya hafta sonu yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen gun numarasi giriniz");
        int gunNo=scanner.nextInt();

        switch (gunNo){

            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Hafta ic");
                break;
            case 6:

            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlis gun numarasi");

                /* gun isminin bas harfini alin s S
            case s || S :  OLMAZ
            case s,S : OLMAZ
            case s :
            case S :
                */


        }


    }
}
