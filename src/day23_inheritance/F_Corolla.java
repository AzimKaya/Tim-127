package day23_inheritance;

public class F_Corolla extends E_Toyota {


    String model="Corolla";
    String uretimYeri="Turkiye";
    String Lastik="Prelli Sakarya";
    String aku ="İnci Aku";

    String tekerCapi="09 inc";
    String guvenlik="safe drive";
    String bagajHacmi ="200 litre";

    public static void main(String[] args) {

        F_Corolla corolla1=new F_Corolla();

        System.out.println(corolla1.marka);
        System.out.println(corolla1.model);
        System.out.println(corolla1.renk);
        System.out.println(corolla1.yakıt);
        System.out.println(corolla1.uretimYeri);
        System.out.println(corolla1.sanzuman);
        System.out.println(corolla1.Lastik);
        System.out.println(corolla1.guvenlik);
        System.out.println(corolla1.aku);
        System.out.println(corolla1.tekerCapi);
        System.out.println(corolla1.bagajHacmi);


    }

}
