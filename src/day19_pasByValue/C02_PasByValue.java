package day19_pasByValue;

public class C02_PasByValue {
    public static void main(String[] args) {

        int sayi = 20;
        System.out.println("method call oncesi sayi : " + sayi); // 20

        System.out.println("Method return degeri "+sayiDegistir(sayi)); // 25

        System.out.println("method call sonrasi sayi : " + sayi); //  20

        sayi = sayiDegistir(sayi);
        System.out.println("atama sonrasi sayi : " + sayi); //  25




    }

    public static int sayiDegistir(int sayi) {
        sayi += 5;
        System.out.println("method icinde sayi : " + sayi); // 25
        return sayi;
    }
}
