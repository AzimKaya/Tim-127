package day31_Collaction;

import java.util.Arrays;

public class C03_ArraydanTekrarEdensayilarisilme {
    public static void main(String[] args) {


        int[] arr={2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 2, 2, 4, 4, 4, 5, 5, 6, 7, 7, 9]

        int silinecekElemanSayisi=0;

        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]==arr[i+1]){
                silinecekElemanSayisi++;
            }

        }
        int[] yeniArr=new int[arr.length-silinecekElemanSayisi];
        int konulacakIndex=0;

        for (int i = 0; i < arr.length-1; i++) {
           if (arr[i]!=arr[i+1]){
               yeniArr[konulacakIndex]=arr[i];
               konulacakIndex++;
           }
        }

        if (arr[arr.length-1]!=yeniArr[yeniArr.length-1]){
            yeniArr[yeniArr.length-1]=arr.length-1;
        }

        arr=yeniArr;
        System.out.println(Arrays.toString(arr));

        }





    }

