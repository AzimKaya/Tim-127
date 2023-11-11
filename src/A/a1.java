package A;

public class a1 {
    public static void main(String[] args) {

        // Verilen bir MDA'de en buyuk ve en kucuk sayilari bulup, yazdiran
        // bir method olusturun

        int[][] arr = {{1, 4, 7}, {3, 5}, {1, -15, 0, 8}, {2}};

        enBuyukEnkucukSayiYazdir(arr);


    }

    public static void enBuyukEnkucukSayiYazdir(int[][] arr) {
        int maximumElement = arr[0][0];
        int minmumElement = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > maximumElement) {
                    maximumElement = arr[i][j];

                }
                if (arr[i][j] < minmumElement) {
                    minmumElement = arr[i][j];
                }
            }
        }

        System.out.println("Array'daki en buyuk sayi:"+maximumElement);
        System.out.println("Array'daki en buyuk sayi:"+minmumElement);
    }
}