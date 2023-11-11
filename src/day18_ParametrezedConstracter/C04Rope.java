package day18_ParametrezedConstracter;

public class C04Rope {

    public static void swing(){
        System.out.print("swing ");
    }
    public void climb(){
        System.out.print("climb ");
    }
    public static void play(){
        swing();
        //climb();
    }
    public static void main(String[] args) {
       // Rope rope = new Rope();
        play();
        //Rope rope2 = null;
        play();
    }

}
