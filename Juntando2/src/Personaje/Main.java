package Personaje;


public class Main {

    private static Personaje pjClass;
    private static FrameJuego frameClass;

    public static void main(String[] args) {
        
        pjClass = new Personaje();
        frameClass = new FrameJuego();
        
        
        frameClass.runInterface();
        pjClass.createPj();
    }

}
