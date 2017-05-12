package Personaje;

import static Personaje.Personaje.boxSize;
import static Personaje.Personaje.rutaRel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Enemigo {
    
    static int boxSize = 40;
   
    private static Mapa mapClass;
    private static Ventana_mapa windowMapClass;
        
    static JLabel enemyLabel;                                                   // Creo un JLaber.
    static boolean movRight = false;						// Creamos una variable booleana para cada tipo de movimiento,
    static boolean movLeft = true;
    private int enemyX;
    private int enemyY;
    static String rutaRel = ".//src//Enemigo_Estados_redimensionados//";
    static String[][] walkDirection = 
		{{"Derecha_Caminando1.png","Derecha_Caminando2.png", "Derecha_Iddle.png"},
		 {"Izquierda_Caminando1.png","Izquierda_Caminando2.png", "Izquierda_Iddle.png"},
		 {"Frente_Caminando1.png", "", ""}};
    
    public int vida = 30; // hare getters y setters pero de momento publicas
    public int daño = 10;

    public Enemigo() {
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
        
        enemyX = boxSize * 18;						// Declaramos variables para las coordenadas de X e Y que se usar� el Pj.
	enemyY = boxSize * 9;
        
	mapClass.insertEnemy(enemyX/boxSize, enemyY/boxSize, true);

        
	enemyLabel.setIcon(enemy);                                              // A este JLabel le metemos un Icon, con la ruta de la imagen, 
	enemyLabel.setBounds(enemyX, enemyY, boxSize, boxSize);          	// posteriormente, le daremos unas coordenadas y tama�o.
	window.add(enemyLabel); 
        
        
    }
    
    public void EnemyDirection(){
        if(movLeft == true){
            if(mapClass.checkMap(enemyX/boxSize-1, enemyY/boxSize) >= 1){
                movLeft = false;
                movRight = true;
            } else{
                mapClass.insertEnemy(enemyX/boxSize, enemyY/boxSize, false);
                mapClass.insertEnemy(enemyX/boxSize-1, enemyY/boxSize, true);
                EnemyPatrol(-1);
                
            }
        } else if(movRight == true){
            if(mapClass.checkMap(enemyX/boxSize+1, enemyY/boxSize) >= 1){
                movRight = false;
                movLeft = true;
                EnemyDirection();
            } else{
                mapClass.insertEnemy(enemyX/boxSize, enemyY/boxSize, false);
                mapClass.insertEnemy(enemyX/boxSize+1, enemyY/boxSize, true);
                EnemyPatrol(1);
                
            }
        }
    }
    
    public void EnemyPatrol(int direccion) {
        int newCoord = enemyX + boxSize * direccion;
        double contador = 0;
        while (enemyX != newCoord) {
            contador += 0.05;
            if (contador > 250000) {
                if (direccion > 0) {
                    if ((newCoord - enemyX) > boxSize / 2) {
                        img(rutaRel + walkDirection[0][0], enemyX, enemyY);                       
                    } else if ((newCoord - enemyX) < boxSize / 2 & (newCoord - enemyX) > 1) {
                        img(rutaRel + walkDirection[0][1], enemyX, enemyY);                       
                    } else {
                        img(rutaRel + walkDirection[0][2], enemyX, enemyY);                       
                    }
                } else if (direccion < 0) {
                    if ((enemyX - newCoord) > boxSize / 2) {
                        img(rutaRel + walkDirection[1][0], enemyX, enemyY);
                    } else if ((enemyX - newCoord) < boxSize / 2 & (enemyX - newCoord) > 1) {
                        img(rutaRel + walkDirection[1][1], enemyX, enemyY);
                    } else {
                        img(rutaRel + walkDirection[1][2], enemyX, enemyY);
                    }
                }
                if (direccion > 0) {
                    enemyX++;
                } else {
                    enemyX--;
                }
                contador = 0;
            }
        }
    }
    
    public static void img(String imagen, int CoordCamb, int CoordStatic){
	ImageIcon enemy = new ImageIcon(imagen);
	enemyLabel.setIcon(enemy);
	enemyLabel.setBounds(CoordCamb, CoordStatic, boxSize, boxSize);
    }    
}
