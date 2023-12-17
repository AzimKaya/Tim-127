package day13_arrays;

public class C05_Arreys {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran
        // bir method olusturun.

        String [] isimler = { "Huseyin","Mehmet","Esra","Ercan","Omer"};
        enUzunEnKisaYazdir(isimler);



    }



    public static void enUzunEnKisaYazdir(String[]arr){



        String enKisaİsim=" ";
        String enUzunİsim=" ";

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length()>enUzunİsim.length()){
                enUzunİsim=arr[i];
            }


            if (arr[i].length()<enKisaİsim.length()){
                enKisaİsim=arr[i];
            }


        }
        System.out.println("En uzun isim"+enUzunİsim);
        System.out.println("En kısa isim:"+enKisaİsim);

    }
}
