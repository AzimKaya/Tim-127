package day23_inheritance;

public class I_Child extends H_Parent{

    public static void main(String[] args) {

     I_Child child1=new I_Child();

     // Child.araba privite
        System.out.println(kasa);
        kasa="75";
        System.out.println(kasa);

        child1.sayi=34;
        System.out.println(kasa);

        //defolt normalde inheritance icin uygun
        //gegildir ama bu class ayni packagede oldugu
        // icin kullanılabilir.
        //Prent baska peckagede olursa ,child class parent
        // classdaki defolt acces modifir'a sahip class uyelerine
        //ulasamaz.
        System.out.println(child1.adres);


    }

}

