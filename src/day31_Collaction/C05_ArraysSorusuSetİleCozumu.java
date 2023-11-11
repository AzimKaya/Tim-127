package day31_Collaction;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C05_ArraysSorusuSetİleCozumu {
    public static void main(String[] args) {



        int[] arr={2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};
        Set<Integer>tekrarsizSet=new TreeSet<>();
        for (Integer each:arr
             ) {
            tekrarsizSet.add(each);
        }
        System.out.println("Set: "+tekrarsizSet);

        arr=new int[tekrarsizSet.size()];
        int index=0;
        for (Integer each:tekrarsizSet
             ) {
           arr[index] =each;
           index++;

        }
        System.out.println("Arrays'in son hali:"+ Arrays.toString(arr));
    }

}
