package day36_GenelTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Arrays {
    public static void main(String[] args) {

        // Verilen iki String array'deki
        // ortak elementleri bulup
        // bir array olarak donduren bir method yazin

        String[] arr1 = {"A","C","B","J","V","G","Z","L","M"} ;
        String[] arr2 = {"S","R","B","S","R","T","T","B","K","G","Z","L"};

        System.out.println(Arrays.toString(ortakElemanBul(arr1,arr2)));


    }
    public static String [] ortakElemanBul(String [] arr1,String [] arr2){

        List<String> ortakElementlerList=new ArrayList<>();

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1 [i].equals(arr2 [j])  && !ortakElementlerList.contains(arr2 [j])){

                    ortakElementlerList.add(arr2 [j]);

                    
                }
            }
        }



        return  o;

    }

}
