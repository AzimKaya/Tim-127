package day30_İteretter_Collattion;

import java.util.*;

public class C03_LingList {

    public static void main(String[] args) {

        LinkedList<String>ll1=new LinkedList<>();
        List<Integer> ll2= new LinkedList<>() ;
        Deque<String>lll4=new LinkedList<>() ;


      ll2.add(4);
       ll2.add(5);
       ll2.add(8);
       ll2.add(2);
       ll2.add(7);

       ll2.add(1,9);
        System.out.println(ll2);
        ll2.add(0,65);
        ll2.remove(6);
        System.out.println(ll2);
        ll2.remove(0);
        System.out.println(ll2);
        System.out.println(ll2);
        ll2.remove(0);
        System.out.println(ll2);


       ll2.remove(1);
        System.out.println(ll2);

        Integer silinecekSayi=8;
        ll2.remove(silinecekSayi);
        System.out.println(ll2);

        silinecekSayi=12;

        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(6);
         list.add(9);

        list.add(10);
        System.out.println(list);
        list.add(6);

        list.add(10);
        list.add(12);
        list.add(15);
     System.out.println(list);
     list.retainAll(ll2);
     System.out.println(list);

     System.out.println("ll2 : " + ll2); // ll2 : [4, 5]
     System.out.println("list : " + list); // list : [4]

    }
}
