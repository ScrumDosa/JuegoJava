package Personaje;

import static Personaje.Personaje.boxSize;
import static Personaje.Personaje.rutaRel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Enemigo {
    
    static int boxSize = 40;
   
    private static Mapa mapClass = new Mapa();
    private static Ventana_mapa windowMapClass = new Ventana_mapa();
        
    static JLabel PJlabel = new JLabel("");					// Creo un JLaber.
    static boolean movRight = false;						// Creamos una variable booleana para cada tipo de movimiento,
    static boolean movLeft = false;
    static String rutaRel = ".//src//Pj_Estados_redimensionados//";
    static String[][] walkDirection = 
		{{"Derecha_Caminando1.png","Derecha_Caminando2.png", "Derecha_Iddle.png"},
		 {"Izquierda_Caminando1.png","Izquierda_Caminando2.png", "Izquierda_Iddle.png"},
		 {"Frente_Caminando1.png","Frente_Caminando2.png", "Frente_Iddle.png"},
		 {"Trasero_Caminando1.png","Trasero_Caminando2.png","Trasero_Iddle.png"}};
    
    
    public void CreateEnemy(){
        JFrame window = windowMapClass.get_window();
        
	ImageIcon Pj = new ImageIcon( rutaRel+"Frente_Iddle.png");
        
        int pjx = boxSize * 8;										// Declaramos variables para las coordenadas de X e Y que se usar� el Pj.
	int pjy = boxSize * 15;
	mapClass.insertPj(pjx/boxSize, pjy/boxSize, true);

	PJlabel.setIcon(Pj);                                                    // A este JLabel le metemos un Icon, con la ruta de la imagen, 
	PJlabel.setBounds(pjx, pjy, boxSize, boxSize);          			// posteriormente, le daremos unas coordenadas y tama�o.
	window.add(PJlabel);  
        window.setLocationRelativeTo(null);
    }
}
