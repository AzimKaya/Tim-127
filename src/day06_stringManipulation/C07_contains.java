package day06_stringManipulation;

public class C07_contains {

    public static void main(String[] args) {

        String str ="Javaya cok calısırken ,cok cabuk is bulursun";

        System.out.println(str.contains("a"));//true
        System.out.println(str.contains("Java"));//true
        System.out.println(str.contains("java"));//folse

        System.out.println(str.contains("av"));//true

        System.out.println(str.contains(" "));//true

        System.out.println(str.contains(""));//true

        System.out.println(str.contains("cok calıs"));

    }
}
