package day32_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {


        Map<Integer,String>ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.keySet());
        System.out.println(ogrenciMap.values());

        MapMethodDepo.subeListesiyazdir(ogrenciMap,"H");




    }

}
