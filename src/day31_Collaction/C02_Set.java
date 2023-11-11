package day31_Collaction;

import java.util.HashSet;
import java.util.Set;

public class C02_Set {
    public static void main(String[] args) {

        Set<String>harfler=new HashSet<>();
        System.out.println(harfler.hashCode());
        harfler.add("B");
        harfler.add("Ali");
        System.out.println(harfler.hashCode());


    }
}
