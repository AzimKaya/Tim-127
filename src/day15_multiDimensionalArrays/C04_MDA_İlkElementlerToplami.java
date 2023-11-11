package day15_multiDimensionalArrays;

public class C04_MDA_İlkElementlerToplami {

    public static void main(String[] args) {
        // verilen bir MDA'de
        // her inner array'in ilk elementlerinin toplamini
        // bize donduren bir method olusturun

        int[][] arr = {{5,4,7},{3,9},{1,-9,0,8},{5,2}};

        System.out.println("İlk elementler toplami :"+ilkElemanToplami (arr) );

    }

    public static int ilkElemanToplami(int [][] arr ){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            toplam+=arr[i][0];



        }

        return toplam;

    }
}
