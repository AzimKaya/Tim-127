package day11_whiloLoop_doWhiloading;

public class C10_DoWhileloop {
    public static void main(String[] args) {

        int sayi =10;


        // do-while loop ile verilen sayidan baslayip, birer azaltarak
        // 3'e kadar olan sayilari yazdirin

        do {
            System.out.print(sayi + " ");
            sayi--;


        }while (sayi>3);


        System.out.println("=================== ");


        sayi=2;

        do {
            System.out.print(sayi + " ");

            sayi--;

        }while (sayi>3);

        System.out.println("=========================");

        //Ayni sayiyi while loop ile yapalim

        sayi=2;
        System.out.println("While loop ile:");

        while (sayi>3){

            System.out.println(sayi+" ");
            sayi--;
        }




    }
}
