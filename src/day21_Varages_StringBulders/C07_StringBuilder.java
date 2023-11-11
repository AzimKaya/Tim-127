package day21_Varages_StringBulders;

public class C07_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candir");



        sb.append(".");
        sb.append("çok çokkk");
        System.out.println(sb); // Java Candir.

        String str = "Hava cok guzel";

        sb.append(str,0,10);
        System.out.println(sb); // Java Candir.cok

        sb.append(str,7,9);

        sb.insert(5,"cok ");
       System.out.println(sb); // Java cok Candir.cok
        sb.insert(19,str,8,14);

        // bizim sb'nin 19.index'ine yukaridaki str'in 8.index'i ile 14. index'i arasini ekle

        System.out.println(sb); // Java cok Candir.cok guzel
        sb.delete(16,25);
        System.out.println(sb); // Java cok Candir.

        // sondaki karakteri silin
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb); // Java cok Candir
        // index saymadan "cok " silin

        int indexCok = sb.indexOf("cok");
        sb.delete(indexCok , indexCok+4);
        System.out.println(sb); // Java Candir


    }

}
