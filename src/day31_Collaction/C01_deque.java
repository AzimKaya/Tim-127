package day31_Collaction;

import java.util.Deque;
import java.util.LinkedList;

public class C01_deque {
    public static void main(String[] args) {


        Deque<String>harfler=new LinkedList<>();
        harfler.add("g");
        harfler.add("K");
        harfler.add("A");
        harfler.add("o");
        harfler.add("B");
        harfler.add("F");
        System.out.println(harfler.remove());
        harfler.remove("B");
        System.out.println(harfler);

        harfler.add("c");
        harfler.addLast("z");
        System.out.println(harfler);//[g, K, A, c, z]

        System.out.println(harfler);
        harfler.add("e");
        harfler.addLast("K");
        harfler.addFirst("A");

        System.out.println(harfler);
        harfler.removeFirstOccurrence("A");
        System.out.println(harfler);
        harfler.removeFirstOccurrence("X");


        // harfler.remove(); ilk elementi siler
        // harfler.remove("A"); A'nin ilk kullanimini siler
        // harfler.removeFirst(); ilk elementi siler
        // harfler.removeFirstOccurrence("A"); // A'nin ilk kullanimini siler

        System.out.println(harfler);
        harfler.remove("A");
        System.out.println(harfler);

        System.out.println(harfler.pollFirst());
        System.out.println(harfler.poll());
        //

        Deque<String>bosDeque=new LinkedList<>();

        //System.out.println(bosDeque.removeFirst());
        System.out.println(bosDeque.poll());
        System.out.println(bosDeque.pollFirst());

        harfler.removeLastOccurrence("k");

        System.out.println(harfler.removeLast());
        System.out.println(harfler);

        System.out.println(harfler.element());
        System.out.println(harfler);

        System.out.println(harfler.peek());
        System.out.println(harfler);

        System.out.println(bosDeque.peek());

        //System.out.println(bosDeque.pop());
        harfler.push("A");
        System.out.println(harfler);
        System.out.println(harfler.offer("R"));
        System.out.println(harfler);

        //



    }
}
