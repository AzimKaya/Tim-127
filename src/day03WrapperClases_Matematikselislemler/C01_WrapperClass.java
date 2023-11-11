package day03WrapperClases_Matematikselislemler;

public class C01_WrapperClass {
    public static void main(String[] args) {

        int sayi=20;
        String str="Java";

        Integer sayi2=30;

        sayi=sayi2;
        sayi2=sayi;

        char chr1='j';
        Character chr2= chr1;

        Boolean bl=true;
        Short shr =3;
        Double dbl=3.5;
        Float flt=2.f;

        //primitive data turleri ile o turun wrapper class'i arasinda gecis mumkundur


        System.out.println(Integer.MIN_VALUE);//-2147483648

        System.out.println(Short.MIN_VALUE);//-32768


        String str1="34";
        String str2="45";

        // str1 ve str2 nin degerlerini matiksel olarak toplayin

        System.out.println((str1 + str2));//3445

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));

        // System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2)));
        // NumberFormatException


        chr1='a';
        System.out.println(Character.isDigit(chr1));//False
        System.out.println(Character.isLetter(chr1));//True
        System.out.println(Character.toUpperCase(chr1));//A


        //int olarak verilen bir sayiyi stringe nasil ceviririz?


        String metin =23+"";
        System.out.println(metin);




    }
}
