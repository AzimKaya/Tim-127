package day04_İfsataments;

public class C01_BagimsizİfCümleleri {
    public static void main(String[] args) {


        /*
        Bagimsiz if cümleri kodun geriye kalaniyla ilgilenmez
        sadece kendi sartina odaklanir

        birden fazla bagimsiz if cumleleri varsa
        butun if body'lerini calistiran durumlar olabilecegi gibi
        a=230, b=45
        hicbir if bodysinin calismayacagi durumlar da olabilir
        a=23
        b=44

         */

        int a=25;
        int b=40;
        //a'b'denbuyuk mu?

        if (a>b){
            System.out.println("a b 'den buyuk");
        }
        //a cift sayi mi?

        if (a%2==0){
            System.out.println("a cift sayi");
        }


        //b 5 ile bolunur mu?

        if (b%5==0){
            System.out.println("b 5 ile tam bolunur");


            // a 3 basamakli bir sayi?
        }

        if (a>=100 && a>=999){
            System.out.println("a sayisi 3 basamakli");

            }

        // a ile b'nin toplami 100'Den buyuk mu?

        boolean sart =a+b>100;
        System.out.println(sart);//Folse

        if ( sart){
            System.out.println("a ile bnin toplami 100den buyuk");
        }

        if (true){
            System.out.println("Bu if body'si her zaman calisir");
        }



        if ( false){

            System.out.println("Bu if bodysi hicbir zaman calismaz");


        }

    }

}
