package day32_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {
    public static void main(String[] args) {

         /*
        Map kompleks bilgiler barindirabilir
        Ne kadar cok bilgi barindirirsa, bilgilere erismek o kadar islem gerektirebilir
        Ama temel olarak map key ve value'dan olusur

        value bir cok bilgi barindiran bir String ise
        bilgilere ulasmak icin split() ile String'i array'e ceviririz

        1- Eger sadece value'dan bilgiler istenirse
           - ogrenciMap.values() ile value'ler bir collection'a kaydedilir
           - sonra collection'daki String'ler for-each loop ile ele alinip
           - split() ile array'e cevrilir
           - ve ISTENEN SARTLARA uyan value'lardan ISTENEN BILGILER kullanilir

        2- Eger key ve value birlikte istenirse
            - ogrenciMap.keySet() ile key'ler bir Set'e kaydedilir
            - for each loop ile key'ler elden gecirilir
            - sadece key degil, ogrenciMap.get(each) ile value'ya ulasilir
            - value split() ile array'e cevrilir
            - Istenen sartlari saglayan kayitlarin, istenen bilgileri KULLANILIR

     */

        // verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun


// verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun

    }

    public static void subeListesiyazdir(Map<Integer, String> orenciMap, String istenenSube) {

        Collection<String> valueCollection = orenciMap.values();
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        String[] valueArr;
        System.out.println(istenenSube + " ==========" + " subesi ogrenci listesi" + "===========");
        for (String each : valueCollection
        ) {
            valueArr = each.split("-");

            if (valueArr[3].equalsIgnoreCase(istenenSube)) {
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    public static Map<Integer, String> okulMapDondur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
        ogrenciMap.put(108, "Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109, "Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110, "Azim-Kayisi-11-K-TM");
        return ogrenciMap;
    }

    public static void bolumListesiYazdir(Map<Integer, String> ogrenciMap, String istenenBolum) {
        // istenen bolumdeki ogrencilerin sinif, sube, isim, soyisim'lerini yazdiran
        Collection<String> valueCollaction = ogrenciMap.values();
        String[] valueArr;
        System.out.println("================" + istenenBolum + "bolumu ögrenci Listesi==========");
        for (String each : valueCollaction
        ) {
            valueArr = each.split("-");
            if (valueArr[4].equalsIgnoreCase(istenenBolum)) {
                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    public static void soyisimdenOgrenciBulma(Map<Integer, String> ogrenciMap, String istenenSoyisim) {
        System.out.println("=======" + istenenSoyisim + " soyismindeki ogrenci listesi ======");
        Collection<String> valueCollaction = ogrenciMap.values();

        String[] valueArr;

        for (String each : valueCollaction
        ) {
            valueArr = each.split("-");
            if (valueArr[1].equalsIgnoreCase(istenenSoyisim)) {

                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    public static void numaraliSınıfOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String sinifNo) {
        System.out.println("=======" + sinifNo + " soyismindeki ogrenci listesi ======");
        Set<Integer> keySeti = ogrenciMap.keySet();
        String valueEach;
        String[] valueArr;
        for (Integer each : keySeti
        ) {
            valueEach = ogrenciMap.get(each);
            valueArr = valueEach.split("-");

            if (valueArr[2].equalsIgnoreCase(sinifNo)) {

                System.out.println(each + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);
            }
        }
    }

    public static void numaraAralıgındakiOgrenciListesi(Map<Integer, String> ogrenciMap, int baslangıcNo, int bitisNo) {

        Set<Integer> keyseti = ogrenciMap.keySet();
        int sayac = 0;
        String valueEach;
        String[] valueArr;

        for (Integer each : keyseti
        ) {
            if (each >= baslangıcNo && each <= bitisNo) {
                valueEach = ogrenciMap.get(each);
                valueArr = valueEach.split("-");
                System.out.println(each + " " + valueArr[0] + " " + valueArr[1]);
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println("Verilen aralıkta ogrenci bulunmammaktadır");
        }

    }

    public static Map<Integer, String> numaraIleSoyİsimUpdate(Map<Integer, String> ogrenciMap, int ogrenciNo, String yeniSoyisim) {

        String ogrenciValue=ogrenciMap.get(ogrenciNo);

        String[] ogrenciValueArr=ogrenciValue.split("-");

        ogrenciValueArr[1]=yeniSoyisim;

        String yeniValue=ogrenciValueArr[0]+"-"+
                         ogrenciValueArr[1]+"-"+
                         ogrenciValueArr[2]+"-"+
                         ogrenciValueArr[3]+"-"+
                         ogrenciValueArr[4];
        ogrenciMap.put(ogrenciNo,yeniValue);
        return ogrenciMap;

    }
    public static Map<Integer, String> subedekiOgrencileriTasi(Map<Integer, String> ogrenciMap, String eskiSube, String yeniSube) {
        //Hangi ogrenci numarasınin degisecegini bilmedimden
        //Once tum keyleri alalım
        Set<Integer> keySeti = ogrenciMap.keySet();
        String[] valueArr;
        for (Integer each:keySeti
             ) {
            valueArr=ogrenciMap.get(each).split("-");

            if (valueArr[3].equalsIgnoreCase(eskiSube)){
                valueArr[3]=yeniSube;
            }
            String yeniValue=valueArr[0]+"-"+
                    valueArr[1]+"-"+
                    valueArr[2]+"-"+
                    valueArr[3]+"-"+
                    valueArr[4];
            ogrenciMap.put(each,yeniValue);
        }
        return ogrenciMap;
    }
    public static Map<Integer, String> yilsonuSinifArttır(Map<Integer, String> orenciMap) {

        Set<Integer>keySeti=orenciMap.keySet();
        String[] valueArr;
        for (Integer each:keySeti ) {
            valueArr = orenciMap.get(each).split("-");
            switch (valueArr[2]) {
                case "9":
                    valueArr[2] = "10";
                    break;
                case "10":
                    valueArr[2] = "11";
                    break;
                case "11":
                    valueArr[2] = "12";
                    break;
                case "12":
                    valueArr[2] = "Mezun";
                    break;
                default:
                    valueArr[2] = null;

            }
            String yeniValue=valueArr[0]+"-"+
                    valueArr[1]+"-"+
                    valueArr[2]+"-"+
                    valueArr[3]+"-"+
                    valueArr[4];
            orenciMap.put(each,yeniValue);
        }
      return  orenciMap;

    }

    public static void sınıfListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Set<Map.Entry<Integer,String>>entrSeti=ogrenciMap.entrySet();
        // entry'leri elden gecirip
        // sinif ve sube bilgisi istenen degere esit olanlari yazdiralim

        String eachValue;
        String[] valueArr;
        System.out.println("======="+sinif+"/"+sube+" sinif listesi========");

        for (Map.Entry<Integer,String>eachEntry:entrSeti ) {

            eachValue = eachEntry.getValue();
            valueArr = eachValue.split("-");

            if (valueArr[2].equals(sinif) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(eachEntry.getKey() + " " + valueArr[0] + valueArr[1]);
            }

        }

    }

    public static Map<Integer, String> isimduzenle(Map<Integer, String> ogrenciMapi) {

        Set<Map.Entry<Integer,String>>entrySeti=ogrenciMapi.entrySet();

        String eachvalue;
        String[] valuArr;
        String isim;

        for (Map.Entry<Integer,String>eachEntry:entrySeti
             ) {
            eachvalue=eachEntry.getValue();


            valuArr=eachvalue.split("-");

            isim=valuArr[0];
            valuArr[0]=isim.substring(0,1).toUpperCase()+isim.substring(1).toUpperCase();

            String yeniValue=valuArr[0]+"-"+
                    valuArr[1]+"-"+
                    valuArr[2]+"-"+
                    valuArr[3]+"-"+
                    valuArr[4];


            eachEntry.setValue(yeniValue);

        }

        return ogrenciMapi;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>>entrySeti=ogrenciMap.entrySet();
        String eachValue;
        String[] valueArr;

        for (Map.Entry<Integer,String>eacEntry:entrySeti
             ) {

            eachValue=eacEntry.getValue();
            valueArr=eachValue.split("-");

            valueArr[1]=valueArr[1].toUpperCase();

            String yeniValue=valueArr[0]+"-"+
                    valueArr[1]+"-"+
                    valueArr[2]+"-"+
                    valueArr[3]+"-"+
                    valueArr[4];

        }


        return ogrenciMap;


    }

    public static Map<String, Object> rezervasyonOlustur(String firstname, String lastname, int totalprice,
                                                         boolean depositpaid, String checkin,
                                                         String checkout, String additionalneeds) {
    /*

         {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi" }

         */

        Map<String,Object>rezervasyonMap=new HashMap<>();

        rezervasyonMap.put("firstname",firstname);
        rezervasyonMap.put("lastname",lastname);
        rezervasyonMap.put("totalprice",totalprice);
        rezervasyonMap.put("depozitpaid",depositpaid);


        Map<String,String>innerMap=new HashMap<>();
        innerMap.put("checkin",checkin);
        innerMap.put("chackout",checkout);
        rezervasyonMap.put("bookingdates",innerMap);
        rezervasyonMap.put("additionalneeds",additionalneeds);

        return rezervasyonMap;

    }
}

