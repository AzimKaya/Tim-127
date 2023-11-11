package day07_StringManipilation;

import java.util.Scanner;

public class C03_indexOf_TekrarOnemli {
    public static void main(String[] args) {

        // Verilen bir cumlede
        // aranan bir metin icin asagidaki cumlelerden
        // uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 2 kere kullanilmis
        // - Cumlede aranan metin 2'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");

        String cumle = scanner.nextLine();
        System.out.println("Lutfen aranan metni giriniz");

        String metin = scanner.nextLine();

        int ilkİndex=0;
        int ikinciİndex=0;
        int ucuncuİndex=0;

        ilkİndex=cumle.indexOf(metin);//-1veya kullanilan index

        if (ilkİndex==-1){
            System.out.println("Cumle aranan metin icermiyor");
        } else if ((ikinciİndex=cumle.indexOf(metin,ilkİndex+1))==-1) {
            //ilk index-1degil ,ikinci index-1
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");
        }else {
            //ilk index -1 degil ,ikinci index -1 degil
            //simdiki sorumuz sadece 2 tane mi var yoksa 2'den fazla mi?

            ucuncuİndex=cumle.indexOf(metin,ilkİndex+1);
            //ucuncuindex==-1 veya var olan bir index

            if (ucuncuİndex==-1){
                //ilk index -1 degil ,ikinci index -1 degil ama ucunIndex-1
                System.out.println("Cumlede aranan metin sadece 2 kere kullanilmis");
            }else {
                //ilk index -1 degil ,ikinci index -1 degil ucuncuIndex-1 degil
                System.out.println("Cumlede aranan metin sadece  2'den fazla kullanilmis");
            }


    }


    }
}
