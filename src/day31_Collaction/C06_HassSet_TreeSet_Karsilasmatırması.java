package day31_Collaction;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C06_HassSet_TreeSet_Karsilasmatırması {
    public static void main(String[] args) {

        Set<Integer>hashSet=new HashSet<>();
        Set<Integer>treeSet=new TreeSet<>();

        Random rnd=new Random();

        long milisaniye= LocalTime.now().toNanoOfDay();
        for (int i = 0; i <10000 ; i++) {
            hashSet.add(rnd.nextInt(1000));

        }


    }
}
