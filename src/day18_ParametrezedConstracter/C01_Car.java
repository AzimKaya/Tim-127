package day18_ParametrezedConstracter;

public class C01_Car {


    String marka = "Marka atanmamis";
    String model= "Model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat;

    public C01_Car(){
       // renk="kırmızı";
            /*
            default constructor ile parametresiz constructor'in en buyuk farki
            default cons.'in body'si bos iken
            parametresiz cons.'lara kod yazilabilir
            bu durumda yapilan atamalar tum araclar icin standart olarak uygulanir
         */
    }

    public C01_Car(String mrk,String mdl,String rnk){

        marka=mrk;
        model=mdl;
        renk=rnk;

    }
    C01_Car(String marka,String model,String renk,int fiyat){

        this.model = model;
        this.yil = yil;
        this.marka = "Toyota";
        this.renk = "Mavi";
    }

    public C01_Car(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public C01_Car(String model, int yil) {
        this.model = model;
        this.yil = yil;
        marka="Toyota";
        renk="Mavi";


    }

    @Override
    public String toString() {
        return "C07_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }



}
