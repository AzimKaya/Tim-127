package day18_ParametrezedConstracter;

public class C02_CarRuner {
    public static void main(String[] args) {

       C01_Car car1=new C01_Car();

        System.out.println("Car1 " + car1);
        System.out.println("Car1 "+ car1);
        // Car1  Ozellikler ==>marka :'Marka atanmamis', model :'Model atanmamis', renk :'Renk atanmamis', yil :1900, fiyat :0
        car1.marka = "BMW";
        car1.model = "116";
        car1.yil =2010;
        car1.fiyat = 7500;
        System.out.println("Car1"+ car1);

        // Car1 Ozellikler ==>marka :'BMW', model :'116', renk :'Renk atanmamis', yil :2010, fiyat :7500
        // marka,model ve renk degerlerini parametre olarak
        // yollayabilecegimiz bir constructor olusturalim

        C01_Car car2=new C01_Car("Nissan","Micra","mavi");
        System.out.println("Car2 "+car2);
        //Car2 C07_Car{marka='Nissan', model='Micra', renk='mavi', yil=1900, fiyat=0}

        C01_Car car3=new C01_Car("Opel","Corsa","Beyaz");

        System.out.println("Car3"+car3);
        //Car3 Ozellikler ==>marka :'Opel', model :'Corsa', renk :'Beyaz', yil :1900, fiyat :0
        // marka,model,renk ve fiyat parametreleri olan
        // bir constructor olusturun

        C01_Car car4=new C01_Car("Peugeut","206","Turuncu",5000);
        System.out.println("Car4"+car4);


    }

}
