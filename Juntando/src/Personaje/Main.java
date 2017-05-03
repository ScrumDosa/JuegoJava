package Personaje;


public class Main {

	private static Personaje pjClass = new Personaje();
        private static FrameJuego frameClass = new FrameJuego();
	
	public static void main(String[] args) {
                frameClass.runInterface();
            	pjClass.createPj();
	}

}
