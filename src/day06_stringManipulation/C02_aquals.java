package day06_stringManipulation;

public class C02_aquals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;


        // equals() String'lerin case sensitive olarak esitligini kontrol eder

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true
        System.out.println(str1.equals(str8));//true
        //

        System.out.println("==================");

        System.out.println(str1.equals(str1==str2));
        System.out.println(str1.equals(str1==str3));
        System.out.println(str1.equals(str1==str4));
        System.out.println(str1.equals(str1==str5));
        System.out.println(str1.equals(str1==str8));

        //


    }
}
