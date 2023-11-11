package day07_StringManipilation;

import java.util.Scanner;

public class C05_lastİndexof {
    public static void main(String[] args) {

        // Verilen bir cumlede
        // aranan bir metin icin asagidaki cumlelerden
        // uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 1'den fazla kullanilmis

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz ");
        String cumle =scanner.nextLine();

        System.out.println("Lutfen aranan metni giriniz");
        String metin =scanner.nextLine();

        int ilkİndex=cumle.indexOf(metin);
        int sonİndex =cumle.lastIndexOf(metin);

        if (ilkİndex==-1){
            System.out.println("Cumle aranan metni icermiyor");

        } else if (ilkİndex==sonİndex) {
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");

        }else {
            System.out.println("Cumlede aranan metin sadece 1'den fazla kullanılmıs");
        }

    }
}
