package day14_Arrays;

import java.util.Arrays;

public class C04_ArraysSort {
    public static void main(String[] args) {


        int [] arr1={3,9,0,12,87,4,6};

        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        String[]arr2={"Ibrahim","Huseyin","Hasan","Ismail","Ishak","israfil","isa"};

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // [Hasan, Huseyin, Ibrahim, Ishak, Ismail, isa, israfil]
        // ascii degerleri sebebiyle kucuk harfler siralamada
        // buyuk harflerden sonra gelir

        // String'lerde sadece method calisinca yapilan degisiklikler kalici olmaz
        // degisikligin kalici olmasi icin atama yapmaliyiz
        // Bu durum String'den kaynaklanan ozel bir durumdur(immutable class)

        String isim = "Ali";
        isim.toUpperCase();
        System.out.println(isim); // Ali



    }

}
