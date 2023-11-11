package day02_scanner_DataCasting;

public class C06_ExpicittlyNarrowing {
    public static void main(String[] args) {

        int sayi = 20;
        byte byt = (byte) sayi;
        System.out.println("20'nin bayte olarak karsiligi:"+byt);
        //20'nin bayte olarak karsiligi:20

        sayi = 130;
        byt = (byte) sayi;
        System.out.println("130'nin bayte olarak karsiligi:"+byt);
        //130'un bayte olarak karsiligi:-126


        sayi= 256;
        byt = (byte) sayi;
        System.out.println("256'nin bayte olarak karsiligi:"+byt);
        //256'nin bayte olarak karsiligi:0



        sayi= 567;
        byt = (byte) sayi;
        System.out.println("567'nin bayte olarak karsiligi:"+byt);
        //567'nin bayte olarak karsiligi:55


        sayi= 640;
        byt = (byte) sayi;
        System.out.println("640'nin bayte olarak karsiligi:"+byt);
        //640'nin bayte olarak karsiligi:-128

        double dbl = 34.7;
        sayi = (int) dbl;

        System.out.println("34.7 nin int olarak degeri :"+ sayi);
        //34.7 nin int olarak degeri :34

        /*
        String str = (String) sayi;

        explicit casting her data turu icin calismaz
        biz simdilik sayisal primitive data turlerinde
        genis degeri dar kapsamli veriable'a atamak icin kullanabiliriz

        Non-primitive data turlerinde de olur
        ancak parat-child classlar arasinda gecerlidir
         */







    }
}
