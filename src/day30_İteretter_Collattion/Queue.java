package day30_İteretter_Collattion;

import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        java.util.Queue<String> harfler= new LinkedList<>();
        harfler.add("y");
        harfler.add("K");
        harfler.add("M");
        harfler.add("s");
        harfler.add("- -");
        harfler.add("M");
        harfler.add("M");

        harfler.add("A");
        harfler.add("Z");

        System.out.println(harfler);
        System.out.println(harfler.remove());
        System.out.println(harfler);
        harfler.remove("M");
        System.out.println(harfler);
        harfler.remove("M");
        System.out.println(harfler);
        harfler.remove("M");
        System.out.println(harfler);
        System.out.println(harfler.element());

        System.out.println(harfler.peek());

        java.util.Queue<String> deneme= new LinkedList<>();
        System.out.println(deneme.peek());
       // System.out.println(deneme.element());

        harfler.offer("z");
        System.out.println(harfler);
        System.out.println(harfler.poll());
        System.out.println(harfler);



    }
}
