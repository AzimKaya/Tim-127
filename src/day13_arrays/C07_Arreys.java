package day13_arrays;

import java.util.Scanner;

public class C07_Arreys {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i
        //        olusturan ve bize donduren bir method olusturun.

stringArrayOlustur();



    }

    public static String [] stringArrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in uzunlugunu giriniz");
        int arrLength = scanner.nextInt();

        String []kullanıcıArrayi=new String[arrLength];
        scanner = new Scanner(System.in);


        for (int i = 0; i <kullanıcıArrayi.length ; i++) {

            System.out.println("Array'e eklemek icin  bir isim söyleyin");
            kullanıcıArrayi[i]=scanner.nextLine();


        }
        return kullanıcıArrayi;

    }

}
