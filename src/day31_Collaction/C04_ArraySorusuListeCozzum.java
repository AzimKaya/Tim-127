package day31_Collaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraySorusuListeCozzum {
    public static void main(String[] args) {

        int[] arr={2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};

        List<Integer>tekrarsızList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if (!tekrarsızList.contains(arr[i])){
                tekrarsızList.add(arr[i]);

            }

        }
        arr=new int[tekrarsızList.size()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=tekrarsızList.get(i);

        }

        System.out.println("List olarak tekrarsız elementler:"+tekrarsızList);
        System.out.println("Arrays'in son hali:"+ Arrays.toString(arr));
    }
}
