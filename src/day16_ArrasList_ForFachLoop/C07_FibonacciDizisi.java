package day16_ArrasList_ForFachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_FibonacciDizisi {
    public static void main(String[] args) {

        //Soru 5- Verilen pozitif tamsayidan kucuk
        //        Fibonacci sayilarini bir liste olarak bize donduren
        //        bir method olusturun.


        System.out.println(fibonacciListesiOlustur(30));

    }

    public static List<Integer>fibonacciListesiOlustur(int listedekiSayiAdedi){

        List<Integer>fibonacciList=new ArrayList<>();


        if (listedekiSayiAdedi==1){
            fibonacciList.add(0);

        } else if (listedekiSayiAdedi==2) {

            fibonacciList.add(0);
            fibonacciList.add(1);

        }else {

            fibonacciList.add(0);
            fibonacciList.add(1);

            for (int i = 2; i <listedekiSayiAdedi ; i++) {

                fibonacciList.add(fibonacciList.get(i-1)+ fibonacciList.get(i-2));

            }

        }
      return fibonacciList;

    }
}
