package Personaje;

import static Personaje.Personaje.boxSize;
import static Personaje.Personaje.rutaRel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Enemigo {
    
    static int boxSize = 40;
    
    public int vida = 30; // hare getters y setters pero de momento publicas
    public int daño = 10;
   
    private static Mapa mapClass;
    private static Ventana_mapa windowMapClass;
        
    public static JLabel enemyLabel;					// Creo un JLaber.
    static boolean movRight = false;						// Creamos una variable booleana para cada tipo de movimiento,
    static boolean movLeft = false;
    static String rutaRel = ".//src//Pj_Estados_redimensionados//";
    static String[][] walkDirection = 
		{{"Derecha_Caminando1.png","Derecha_Caminando2.png", "Derecha_Iddle.png"},
		 {"Izquierda_Caminando1.png","Izquierda_Caminando2.png", "Izquierda_Iddle.png"},
		 {"Frente_Caminando1.png","Frente_Caminando2.png", "Frente_Iddle.png"},
		 {"Trasero_Caminando1.png","Trasero_Caminando2.png","Trasero_Iddle.png"}};

    public Enemigo(int vida, int daño) {
        windowMapClass = new Ventana_mapa();
        enemyLabel = new JLabel("");
        this.vida = vida;
        this.daño = daño;
    }

    public void setMapClass(Mapa mapClass) {
        Enemigo.mapClass = mapClass;
    }
    
    public int getVida(){
        return this.vida;
    }
    public void setVida(int daño){
        this.vida -= daño;
    }
    
    public void CreateEnemy(JFrame window){
 
        windowMapClass = new Ventana_mapa();
        enemyLabel = new JLabel("");
        
        ImageIcon enemy = new ImageIcon( rutaRel+"Frente_Iddle.png");
        
        int enemyX = boxSize * 15;						// Declaramos variables para las coordenadas de X e Y que se usar� el Pj.
	int enemyY = boxSize * 8;
        
	mapClass.insertEnemy(enemyX/boxSize, enemyY/boxSize, true);

	enemyLabel.setIcon(enemy);                                              // A este JLabel le metemos un Icon, con la ruta de la imagen, 
	enemyLabel.setBounds(enemyX, enemyY, boxSize, boxSize);          	// posteriormente, le daremos unas coordenadas y tama�o.
	window.add(enemyLabel);  
    }
}
