package day18_ParametrezedConstracter;

public class C03_ContructerCall {

   C03_ContructerCall(){

       // this(5); // Call to 'this()' must be first statement in constructor body
       System.out.println("Parametresiz constructor calisti");
   }

   C03_ContructerCall(int sayi){

       System.out.println("int parametreli constructor calisti");

   }
   C03_ContructerCall(String metin){

       //C03_ConstructorCall(); // Method Call Syntax'i oldugundan Java bu isimde method arar
       this(6); // constructor call syntax'i boyledir
       // constructor adini degil this(istenen parametreler) yazariz
       System.out.println("String parametreli constructor calisti");

   }

    public static void main(String[] args) {

       C03_ContructerCall obj1=new C03_ContructerCall("A");

        //int parametreli constructor calisti
        //String parametreli constructor calisti

        C03_ContructerCall obj2=new C03_ContructerCall();

        //int parametreli constructor calisti
        //String parametreli constructor calisti
        //Parametresiz constructor calisti

    }

}
