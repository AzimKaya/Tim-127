package day08_stringManipulations;

public class C02_replaceOll {
    public static void main(String[] args) {

        String str = "J1a5v8a +/can87dir15";
        // metindeki sayi ve karakterleri temizleyip
        // sadece harflerden olusan "Java candir" sekline donusturun

        // tum sayilari yok edelim

        // space'i korumak icin, space yerine bir rakam atayalim
        str=str.replaceAll("\\d", "");
        // ozel karakterleri yok edelim
        str=str.replaceAll("\\s","5");
        // W harf,rakam ve _ 'yi degistirmez
        str=str.replaceAll("\\W","");
        // _'yi de yok etmek istersek alttaki satiri yazabiliriz
        str=str.replaceAll("5"," ");

        // space yerine yazdigimiz sayiyi, yeniden space yapalim

        System.out.println(str);


    }
}
