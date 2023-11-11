package day03WrapperClases_Matematikselislemler;

public class C05_PreincrementPostincrement {
    public static void main(String[] args) {

        int a=20;

        // anin degerini yazdirip sonra anin degerini 1 arttirip
        // olusturacaginiz b verialeee yazdirin

        System.out.println("a:"+a);
        a+=1;
        int b=a;
        System.out.println("islem sonunda a: " + a + " b : "+ b);

        a=20;

        // a'nin degerini bye atayip sonra
        // a'nin degerini bir arttirin

        b=a;
        a+=1;

        System.out.println("islem sonunda a: " + a + " b : " + b);

        System.out.println("====================================");
        a=20;
        b=a++;

        System.out.println("a++ islem sonunda a: " + a + " b : " + b);

        // Bu anlatım sadece ++ veya -- seklinde kullanim icerir

        a=20;
        b=++a;

        System.out.println("++a islem sonunda a: " + a + " b : " + b);

        System.out.println("===========================================");



        int c=40;

        System.out.println("c++ ile yazdirinca:"+ c++);
        System.out.println("c++ ile bir alt satirda c'nin degeri: :"+ c);


        c=40;


        System.out.println("++c ile yazdirinca:"+ ++c);
        System.out.println("++c ile bir alt satirda c'nin degeri:"+c);
    }
}
