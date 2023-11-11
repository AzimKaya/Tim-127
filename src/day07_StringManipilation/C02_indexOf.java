package day07_StringManipilation;

public class C02_indexOf {
    public static void main(String[] args) {


        String str = "Java candir, Selenium heyecan.";

        // str Selenium iceriyor mu ?
        System.out.println(str.contains("Selenium"));//true

        //  str Selenium ile mi bitiyor ?
        System.out.println(str.endsWith("Selenium"));//follse

        //  str Selenium ile mi baslıyor ?
        System.out.println(str.startsWith("Selenium"));//False

        //Peki Slenniun nerede
        System.out.println(str.indexOf("Selenium"));//13

        //Olmayan bir metin aratilirsa

        System.out.println(str.indexOf("x"));//-1
        System.out.println(str.indexOf("q"));//-1
        System.out.println(str.indexOf("a"));//1

        // contains ()kullanmadan str'in java icerip icermedigini yazdirin

        if (str.indexOf("java")==-1){
            System.out.println("false");
        }else {
            System.out.println("true");
        }

        //str daki ilk  a harfinin indexini yazdirin
        System.out.println(str.indexOf("a"));

        //str daki  a harfinin indexini yazdirin
        System.out.println(str.indexOf("a", 2));//3

        //str daki 3. a harfinin indexini yazdirin
        System.out.println(str.indexOf("a", 4));

        //str daki 4. a harfinin indexini yazdirin
        //yoksa "str sadece 3 tane a iceriyor"yazdirin

        if (str.indexOf("a",7)==-1){
            System.out.println("str sadece 3 tane a iceriyor");
        }else {
            System.out.println("4.a'nin indexi:"+str.indexOf("a",7));
        } //27

        //str daki 5. a harfinin indexini yazdirin
        //yoksa "str sadece 4 tane a iceriyor"yazdirin

        if (str.indexOf("a",28)==-1){
            System.out.println("str sadece 4 tane a iceriyor");
        }else {
            System.out.println("5.a'nin indexi:"+str.indexOf("a",28));
        } //


    }
}
