package day17_constructors;

public class C08_CarRunner {

    public static void main(String[] args) {

        C07_Car car1=new C07_Car();

        System.out.println(car1.marka);
        System.out.println(car1.model);

        System.out.println(car1);

        // eger bir class'dan obje olusturdugumuzda
        // objenin tum ozelliklerini tek bir sout ile yazdirmak isterseniz
        // o class'a toString() olusturmalisiniz

        C07_Car car2=new C07_Car();
        car2.marka="Toyota";
        car2.model="Corolla";
        car2.yil=2015;
        car2.fiyat=10000;
        System.out.println(car2);
        // C07_Car{marka='Marka atanmamis', model='Model atanmamis', renk='Renk atanmamis', yil=1900, fiyat=0}
        // C07_Car Ozellikler ==>marka :'Marka atanmamis', model :'Model atanmamis', renk :'Renk atanmamis', yil :1900, fiyat :0

        C07_Car car3 =new C07_Car();

        car3.marka="Mercedes";
        car3.model="E200";
        car3.yil=2015;
        car3.fiyat=15000;
        System.out.println(car3);

        C07_Car car4=new C07_Car("Poeshe","Carrera");
        System.out.println(car4);



    }





}
