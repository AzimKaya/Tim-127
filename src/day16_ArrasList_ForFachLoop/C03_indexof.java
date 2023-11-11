package day16_ArrasList_ForFachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_indexof {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();


        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Esra");

        System.out.println(isimler);//[Deniz, Omer, Esra, Hamza, Basak]
        System.out.println(isimler.indexOf("Esra"));//2

        System.out.println(isimler.lastIndexOf("Esra"));//5

        System.out.println(isimler.lastIndexOf("İbrahim"));//-1

        System.out.println(isimler.lastIndexOf("Azim"));//-1

        System.out.println(isimler.lastIndexOf("Gülnur"));//-1


    }
}
