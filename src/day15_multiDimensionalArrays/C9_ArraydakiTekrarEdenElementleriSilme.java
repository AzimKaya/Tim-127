package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C9_ArraydakiTekrarEdenElementleriSilme {
    public static void main(String[] args) {


        // Verilen bir int array'de,
        // tekrar eden elementleri silip
        // array'i her elementin unique oldugu bir hale getirin

        int[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        // bir list olusturalim
       List<Integer> uniqueList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // array'in tum elemanlarini tek tek ele alalim

            if (!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }
        }
        System.out.println("Uniq list:"+uniqueList);
        //Uniq list:[3, 2, 5, 6, 7, 8, 9, 0, 1, 4]


        int [] yeniArr=new int[uniqueList.size()];
        System.out.println(Arrays.toString(yeniArr));
        //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i < yeniArr.length; i++) {
           yeniArr [i]=uniqueList.get(i);

        }

            arr =yeniArr;
        Arrays.sort(arr);
        System.out.println("Array'in son hali : "+Arrays.toString(arr) );
          //Array'in son hali : [3, 2, 5, 6, 7, 8, 9, 0, 1, 4]

        // liste'de olup olmadigina bakalim, listede yoksa ekleyelim


    }
}
