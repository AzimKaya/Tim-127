package day08_stringManipulations;

public class C01_Replace {

    public static void main(String[] args) {

        String str ="Java Candir";

        System.out.println(str.replace('a','q'));//Jqvq Cqndir

        System.out.println(str.replace("Java", "Tava"));//Tava Candir

        System.out.println(str.replace("Java", "x"));//x Candir

        System.out.println(str.replace('x', 'y'));//Java Candir

        System.out.println(str.replace("a", "e").replace("i", "a"));

        System.out.println(str.replace("i", "a").replace("a", "e"));
        //Java cender

        // degisecek metin sadece ilk deger icin degissin diyorsak
        // replace() yerine replaceFirst() kullanilir

        System.out.println(str.replaceFirst("a","x"));//Jxva Candir

        // regex : regular expressions : belirlenmis kisaltmalar
        // ilk harfi * yapalim

        System.out.println(str.replaceFirst("\\w","*"));
        // varsa ilk string icindeki ilk rakami + yapalim

        str = "Java 44Candir";

        System.out.println(str.replaceFirst("\\d", "+"));//Java +4Candir


    }
}
