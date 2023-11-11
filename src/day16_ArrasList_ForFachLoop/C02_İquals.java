package day16_ArrasList_ForFachLoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class C02_İquals {
    public static void main(String[] args) {

List<Integer>sayilar1=new ArrayList<>();

List<Integer>sayilar2=new ArrayList<>();

System.out.println(sayilar1.equals(sayilar2));//Turue

sayilar1.add(1);
sayilar2.add(2);

System.out.println(sayilar1.equals(sayilar2));//false




 sayilar1.add(0,2);
 sayilar2.add(1);

 System.out.println(sayilar2);//[2, 1]
 System.out.println(sayilar1);//[2, 1]

        System.out.println(sayilar1.equals(sayilar2));//true

sayilar1.add(0,3);
sayilar2.add(3);

System.out.println(sayilar1.equals(sayilar2));//false//

Collections.sort(sayilar1);
Collections.sort(sayilar2);

System.out.println(sayilar1.equals(sayilar2));//true

        System.out.println(sayilar1);//[1, 2, 3]
        System.out.println(sayilar2);//[1, 2, 3]

    }
}
