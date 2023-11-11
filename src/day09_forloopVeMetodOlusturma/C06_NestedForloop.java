package day09_forloopVeMetodOlusturma;

public class C06_NestedForloop {
    public static void main(String[] args) {

        // 1 2 3 4 yazdirin

        for (int i = 1; i <=4; i++) {

            System.out.print(i+" ");

        }

        System.out.println("");
        // 2 4 6 8 yazdirin
        for (int i = 1; i <=4; i++) {
            System.out.print(2*i+" ");

        }
        // 3 6 9 12 yazdirin

        System.out.println("");

        for (int i = 1; i <=4; i++) {
            System.out.print(3*i+" ");



        }

                 /*
        bu tur tekrar eden islemleri NESTED(icice) For-Loop ile yapabiliriz
        yukarida 3 kez ayni loop'u calistirdik (satir sayisi kadar)
        1 2 3 4
        2 4 6 8
        3 6 9 12
        aralarindaki tek fark 1*i , 2*i, 3*i
         */


        System.out.println(" ================");

        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=4; j++) {

            }

        }


    }

}
