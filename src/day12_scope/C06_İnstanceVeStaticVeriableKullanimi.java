package day12_scope;

public class C06_İnstanceVeStaticVeriableKullanimi {



    // Okul uygulamasi yaptigimizi dusunelim
    static String okulIsmi = "Yildiz Koleji";
    static String mudur = "Fikret Zeybek";
    static String okulAdresi = "Cankaya";

    String ogretmenIsmi = "Isim atanmadi";
    String ogretmenAdresi = "Adres girilmedi";
    String ogretmenTel = "Tel girilmedi";

    public static void main(String[] args) {

C06_İnstanceVeStaticVeriableKullanimi ogr1=  new C06_İnstanceVeStaticVeriableKullanimi();

        System.out.println(ogr1.ogretmenAdresi);
        ogr1.ogretmenIsmi="Omer";
        ogr1.ogretmenAdresi="Kızılay";
        System.out.println(ogr1.mudur);

C06_İnstanceVeStaticVeriableKullanimi ogr2=new C06_İnstanceVeStaticVeriableKullanimi();

        System.out.println(ogr2.ogretmenIsmi);
        ogr2.ogretmenIsmi="Zeliha";

        C06_İnstanceVeStaticVeriableKullanimi ogr3 = new C06_İnstanceVeStaticVeriableKullanimi();

        System.out.println("===========");

        System.out.println(ogr1.ogretmenIsmi);//Omer
        System.out.println(ogr2.ogretmenIsmi);//Zeliha
        System.out.println(ogr3.ogretmenIsmi);//İsim atanmadi


        System.out.println(ogr1.okulIsmi);//Yildiz Koleji
        System.out.println(ogr2.okulIsmi);//Yildiz Koleji
        System.out.println(ogr3.okulIsmi);//Yildiz Koleji

        ogr1.okulAdresi="Yeni mhalle";
        System.out.println(okulAdresi);//Yeni mahalle
        System.out.println(ogr2.okulAdresi);//Yeni mahalle
        System.out.println(ogr3.okulAdresi);//Yeni mahalle


    }


}
