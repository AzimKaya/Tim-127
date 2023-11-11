package day15_multiDimensionalArrays;

public class C02_MDA_TumElementleriToplama {
    public static void main(String[] args) {


        // Verilen bir MDA'deki tum sayilari toplayip, toplami yazdiran bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};

        arraydakiElementleriTopla(arr);//Arraydaki tum sayilarin toplami:40

        arraydakiElementleriTopla(new int[][]{{4,6,7},{1,2}});

    }


    public static void arraydakiElementleriTopla(int[][] arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam+=arr[i][j];

            }

        }

        System.out.println("Arraydaki tum sayilarin toplami:"+toplam);
    }
}
