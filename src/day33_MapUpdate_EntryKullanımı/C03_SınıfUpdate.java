package day33_MapUpdate_EntryKullanımı;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C03_SınıfUpdate {
    public static void main(String[] args) {

        Map<Integer,String>orenciMap= MapMethodDepo.okulMapDondur();

        orenciMap=MapMethodDepo.yilsonuSinifArttır(orenciMap);

        System.out.println(orenciMap);






    }
}
