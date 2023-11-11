package day08_stringManipulations;

import java.util.Scanner;

public class C11_forLoop {
    public static void main(String[] args) {
        //Kullacidan pozitif bir tamsayi degeri isteyin
        //o sayiya kadar olan tum pozitif tamsayilarin toplamini yazdiriniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int sayi=scanner.nextInt();
        int toplam=0;

        for (int i = 1; i <=sayi ; i++) {
            toplam+=i;

        }
        System.out.println(sayi+"ye kadar olan pozitif tamsayilarin toplami:"+toplam);
    }
}
