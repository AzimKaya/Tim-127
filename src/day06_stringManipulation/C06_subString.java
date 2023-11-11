package day06_stringManipulation;

public class C06_subString {
    public static void main(String[] args) {
        String str = "Java en guzel programlama dili";

        System.out.println(str.substring(5));//en guzel programlama dili

        System.out.println(str.substring(0)); // Java en guzel programlama dili

        System.out.println(str.substring(1));// ava en guzel programlama dili

        //Son karakteri yazdirin

        System.out.println(str.substring(str.length() - 4));//dili

        // metinden sadece Java'yi yazdirin

        System.out.println(str.substring(0, 4));

        // 0.index'den basla 4 karakter yazdir
        // veya 0.index(dahil) ile 4. index(haric) arasi

        // cumledeki 2.space'in index'i 7 ise
        // 2.space'den sonraki 5 harfi yazdirin

        System.out.println(str.substring(8, 13));


        System.out.println(str.substring(0, 1));//J

        System.out.println(str.substring(3, 4));//a

        // 6.index'deki harfi String olarak kaydedin

        String index6dakiHarf=str.substring(6,7);
        System.out.println(index6dakiHarf);//n

        System.out.println("baslangıc ve bitis ayni olursa: "+str.substring(5,5)+"----");

        System.out.println(str.substring(5,2));


        // System.out.println(str.substring(5,2)); // StringIndexOutOfBoundsException:
        // begin 5, end 2, length 30
    }
}
