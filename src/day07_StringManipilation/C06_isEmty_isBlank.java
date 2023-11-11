package day07_StringManipilation;

public class C06_isEmty_isBlank {
    public static void main(String[] args) {


        String str1 = "";
        String str2 = "     ";
        String str3 = "Java";
        System.out.println(str2.isBlank()); // true    bosluk mu ? space'lerden mi olusuyor ?
        System.out.println(str2.isEmpty());//false  bosmu

        System.out.println(str1.isBlank()); // true
        System.out.println(str1.isEmpty());//true

        System.out.println(str3.isBlank()); // folse
        System.out.println(str3.isEmpty());//folse




    }
}
