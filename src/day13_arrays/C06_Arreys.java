package day13_arrays;

public class C06_Arreys {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.



        int[] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
        int arananSayi = 3;

        elemanSyisiYazdir(arr,3);//Aranan eleman array'de:  2kere kullanılmıs

        elemanSyisiYazdir(arr,11);//Aranan eleman array'de yok

        elemanSyisiYazdir(arr,7);//Aranan eleman array'de:  1kere kullanılmıs


    }

    public static void elemanSyisiYazdir(int[] arr,int arananSayi   ){

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

         if (arr[i]==arananSayi){

             sayac++;
         }

        }

        if ( sayac==0){
            System.out.println("Aranan eleman array'de yok");
        }else {
            System.out.println("Aranan eleman array'de:  " + sayac + "kere kullanılmıs");
        }
    }
}
