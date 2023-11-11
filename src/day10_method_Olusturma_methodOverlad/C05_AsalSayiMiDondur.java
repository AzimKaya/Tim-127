package day10_method_Olusturma_methodOverlad;

public class C05_AsalSayiMiDondur {
    public static void main(String[] args) {

        // Verilen pozitif bir tamsayinin
        // asal sayi olup olmadigini kontrol edip
        // asal ise true, asal degil ise false donduren
        // bir method olusturun


        asalMiDondur(45);

        System.out.println(asalMiDondur(43));
    }

    public static  boolean asalMiDondur(int sayi){
        boolean flag=true;

        for (int i = 2; i < sayi; i++) {

            if (sayi%i==0){
                flag=false;

                break;
            }

        }

        return flag;


    }
}
