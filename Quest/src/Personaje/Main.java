package Personaje;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main {

	private static Personaje pjClass = new Personaje();
        private static Enemigo enemyClass = new Enemigo();
        private static FrameJuego frameClass = new FrameJuego();
        private static Framequest quest = new Framequest();

        
	public static void main(String[] args) {
            JFrame mision = new JFrame();
            JButton cierra = new JButton();
            mision.setVisible(true);
            mision.add(cierra);
            
                frameClass.runInterface();
            	pjClass.createPj();
                enemyClass.CreateEnemy();
	}

}
