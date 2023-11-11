package day17_constructors;

import java.util.Random;

public class C01 {

    int sayi = 6;
    String str = "Java candir";

    public void rasgeleSayiUret(){
        Random random =new Random();
        int rasgeleSayi =random.nextInt(1000);
        System.out.println("Bu gunku sasli sayi :"+ rasgeleSayi);

    }

    public void bugunNePisireyim(){

        String[] yemekler ={"Kuru fasulye ","Pilav","Cacik"," Makarna","Mercimek Crbasi"};
        Random random=new Random();
        int yemekNo=random.nextInt(yemekler.length);
        System.out.println("Bu gunun yemek teklifi:"+yemekler[yemekNo]);

    }









    }
