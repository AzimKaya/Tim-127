package day19_pasByValue;

import java.util.Arrays;
import java.util.Random;

public class C03PassByValue {
    public static void main(String[] args) {
        int[]arr={1,2,3,};
        System.out.println("arr ilk hali: "+Arrays.toString(arr));

            elemanlariArttir(arr);

            System.out.println(" elemanlari arttirmethot call'dan sonra arr  hali: "+Arrays.toString(arr));

            arrayiDrgistir(arr);

        System.out.println("arrayi degistir methot call'dan sonra arr :"+ Arrays.toString(arr));
    }

    public static void elemanlariArttir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=2;
        }

        System.out.println("Eleman arttir metodunda degistirilen arr:"+ Arrays.toString(arr));
    }

    public static void arrayiDrgistir(int[] arr){

        // yeni 3 elemanli bir array olusturup
        // icine rastgele 100'den kucuk sayilar koyun
        // arr'ye bu yeni degeri atayin
        // ve arr'yi yazdirin

        int[] yeniArr=new int[3];
        Random rnd =new Random();

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i]= rnd.nextInt(100);

        }
        arr=yeniArr;

        System.out.println("Arrayi degistir methodunda arr:"+Arrays.toString(arr));




    }
}
