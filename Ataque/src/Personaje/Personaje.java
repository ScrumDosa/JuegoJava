package Personaje;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Personaje{
	
    private static Mapa mapClass = new Mapa();
    private static FrameJuego frameClass = new FrameJuego();
    private static Ventana_mapa windowMapClass = new Ventana_mapa();
    private static Enemigo enemyClass = new Enemigo(30, 10); // los parametros que paso son vida y daño del enemigo
    
    
    static int boxSize = 40;
	 
    static JLabel PJlabel = new JLabel("");					// Creo un JLaber.
    static JLabel BGlabel = new JLabel();
    static boolean movRight = false;						// Creamos una variable booleana para cada tipo de movimiento,
    static boolean movLeft = false;							// y las inicializamos como false.
    static boolean movUp = false;
    static boolean movDown = false;
    static boolean attack = false;
    static String rutaRel = ".//src//Pj_Estados_redimensionados//";
    static String[][] walkDirection = 
	{{"Derecha_Caminando1.png","Derecha_Caminando2.png", "Derecha_Iddle.png"},
	 {"Izquierda_Caminando1.png","Izquierda_Caminando2.png", "Izquierda_Iddle.png"},
	 {"Frente_Caminando1.png","Frente_Caminando2.png", "Frente_Iddle.png"},
	 {"Trasero_Caminando1.png","Trasero_Caminando2.png","Trasero_Iddle.png"}};
    
    private int vida = 100;
    public int daño = 15;
    
    public static void createPj() {
     	
	mapClass.readFile();
                
	windowMapClass.create_window();
        JFrame window = windowMapClass.get_window();

	ImageIcon Pj = new ImageIcon( rutaRel+"Frente_Iddle.png");
		                
	int pjx = boxSize;										// Declaramos variables para las coordenadas de X e Y que se usar� el Pj.
	int pjy = boxSize;
	mapClass.insertPj(pjx/boxSize, pjy/boxSize, true);

	PJlabel.setIcon(Pj);                                                    // A este JLabel le metemos un Icon, con la ruta de la imagen, 
	PJlabel.setBounds(pjx, pjy, boxSize, boxSize);          			// posteriormente, le daremos unas coordenadas y tama�o.
	window.add(PJlabel);  
        window.setLocationRelativeTo(null);
        
        //Colocando Enemigo
        enemyClass.setMapClass(mapClass);
        enemyClass.CreateEnemy(window);
        
        //Colocalmos el fondo
        ImageIcon background = new ImageIcon(".//src//Imagenes//background.jpg");
        window.add(BGlabel);
        BGlabel.setIcon(background);
        BGlabel.setBounds(0, 0, 800, 800);
        BGlabel.setEnabled(true);
        BGlabel.setVisible(true);
        
        
        
	window.addKeyListener(new KeyListener() {			// A�adimos un KeyListener para detectar los eventos del telcado (pulsar teclas)
        
		@Override
		public void keyPressed(KeyEvent e) {			// Cuando se pulsa una tecla...
			switch (e.getKeyCode()) {
		    	case KeyEvent.VK_D:						// ...Y esa tecla es la  D,
		    		movRight = true;					// ponemos a true el movimiento hacia la derecha.
		    	break;
		    	case KeyEvent.VK_A:						// ... Y esa tecla es la A,
		    		movLeft = true;						// ponemos a true el movimiento hacia la izquierda.
		    	break;
		    	case KeyEvent.VK_W:						// ... Y esa tecla es la W,
		    		movUp = true;						// ponemos a true el movimiento hacia arriba.
		    	break;
		    	case KeyEvent.VK_S:						// ... Y esa tecla es la S,
		    		movDown = true;						// ponemos a true el movimiento hacia abajo.
		    	break;
                        
                        case KeyEvent.VK_F:
                            enemyClass.setVida(15);
                            if(enemyClass.getVida() <= 0){
                                enemyClass.enemyLabel.setVisible(false);
                                enemyClass.enemyLabel.setEnabled(false);
                            }
                        
                        break;
                        /*Esto de arriba es lo que hace morir al enemigo pero claro hay que filtrar a que solo se ejecute si hay algo en el radio
                        de ataque del personaje que sera lo mismo en el caso del enemigo para que tambien ataque 
                        */
                        
                        }
		}
			
		@Override
		public void keyReleased(KeyEvent e) {}			// Esto detectar� cuando la tecla se deja de presionar.
		@Override
		public void keyTyped(KeyEvent e) {}				// Esto detectar� cuando una serie de teclas especiales es pulsada.
														// Tanto en Released como el Typed es obligado ponerlos al usar un KeyListener,
	});													// se le de o no uso. Si se quita, dar� un error.
		
															// (Lo que se hace a continuaci�n, no se realiza en el keyPressed porque var�a su comportamiento)
	while(true){										// Durante el resto del programa, ejecutaremos un bucle infinito. 
		
		System.out.println();							// Sin esto, no funciona el bucle. Misa no entender el motivo. Hay que buscarlo.
		pjx = Movimiento(movRight, 'x', boxSize, pjx, pjy, Pj);					// Comprobaremos mediante una funci�n si un movimiento se ha puesto a true... 
		pjx = Movimiento(movLeft, 'x', -boxSize, pjx, pjy, Pj);					// ... la funci�n ejecutar� el movimiento, y devolver� la posici�n actual ...
		pjy = Movimiento(movUp, 'y', -boxSize, pjy, pjx, Pj);					// ... del personaje.
		pjy = Movimiento(movDown, 'y', boxSize, pjy, pjx, Pj);
		movRight = false;												// Ponemos todos las variables de movimiento a false.
		movLeft = false;
                movUp = false;
		movDown = false;	
	}
    }	
	
	// Par�metros a pasar en la funci�n:
	//		boolean direccion -> La variable booleana de movimiento, si se pasa a true, pasar�n cosas (explicado m�s adelante).
	//		char eje -> Nos dir� si el movimiento se realiza en el eje x o y.
	//		int recorrido -> La distancia que recorrer� el personaje y sobretodo lo importante, si lo hace en direcci�n positiva o negativa.
	//		int CoordCamb e int CoordStatic -> Pasamos la coordenada que cambiar� y la que se mantendr� est�tica.
	
    public static int Movimiento(boolean direccion, char eje, int recorrido, int CoordCamb, int CoordStatic, ImageIcon Pj){
        double contador = 0;														//Crearemos una variable que nos servir� de contador.
	int newCoord = CoordCamb + recorrido;										//Calcularemos la coordenada final.
		
	if(eje == 'x')
		if(mapClass.checkMap(newCoord/boxSize, CoordStatic/boxSize) >= 1)
			return CoordCamb;
	if (eje == 'y')
		if(mapClass.checkMap(CoordStatic/boxSize, newCoord/boxSize) >= 1)
			return CoordCamb;
	if(direccion){														//Si una variable de movimiento es true, haremos:
        	while(CoordCamb != newCoord){												//2. Siempre que la coordenada actual, sea distinta que la final...
			contador+=0.05;															//3. ... Incrementa el contador en 0.05 (valor arbitrario para controlar la velocidad de movimiento)
			if(contador > 250000){													//4. Llamamos a la función para colocar al Pj dependiendo de la dirección.
				imprimirPersonaje(eje, recorrido, CoordCamb, CoordStatic, newCoord, Pj);
				if(recorrido > 0)													//6. ... Comprobamos si vamos hacia un valor positivo y negativo,		
					CoordCamb++;													// y incrementamos (o disminuimos) la coordenada en la que se mueve el Pj.
				else
					CoordCamb--;
                        		contador = 0;														//7. Reseteamos el contador.
			}
		}
	}
	return CoordCamb;																//8. Una vez acabado todo, devolvemos la posici�n actual del Pj.
    }
	
    public static void imprimirPersonaje(char eje, int recorrido, int CoordCamb, int CoordStatic, int newCoord, ImageIcon Pj){
        if(eje == 'x'){
		mapClass.insertPj(newCoord/boxSize, CoordStatic/boxSize, true);
		mapClass.insertPj(CoordCamb/boxSize, CoordStatic/boxSize, false);
		if(recorrido > 0){													
			if((newCoord - CoordCamb) > boxSize/2){
				img(rutaRel+walkDirection[0][0], Pj, CoordCamb, CoordStatic);
			} else if((newCoord - CoordCamb) < boxSize/2 & (newCoord - CoordCamb) > 1){
				img(rutaRel+walkDirection[0][1], Pj, CoordCamb, CoordStatic);
			} else{
				img(rutaRel+walkDirection[0][2], Pj, CoordCamb, CoordStatic);
                        }
		}else if (recorrido < 0){
			if((CoordCamb - newCoord) > boxSize/2){
				img(rutaRel+walkDirection[1][0], Pj, CoordCamb, CoordStatic);
			} else if((CoordCamb - newCoord) < boxSize/2 & (CoordCamb - newCoord) >1){
				img(rutaRel+walkDirection[1][1], Pj, CoordCamb, CoordStatic);
			} else{
				img(rutaRel+walkDirection[1][2], Pj, CoordCamb, CoordStatic);
			}
		}
	} else if (eje == 'y'){
		mapClass.insertPj(CoordStatic/boxSize, newCoord/boxSize, true);
		mapClass.insertPj(CoordStatic/boxSize, CoordCamb/boxSize, false);
		if(recorrido > 0){													
			if((newCoord - CoordCamb) > boxSize/2){
				img(rutaRel+walkDirection[2][0], Pj, CoordStatic, CoordCamb);
			} else if((newCoord - CoordCamb) < boxSize/2 & (newCoord - CoordCamb) >1){
				img(rutaRel+walkDirection[2][1], Pj, CoordStatic, CoordCamb);
			} else{
				img(rutaRel+walkDirection[2][2], Pj, CoordStatic, CoordCamb);
			}
		}else if (recorrido < 0){
			if((CoordCamb - newCoord) > boxSize/2){
				img(rutaRel+walkDirection[3][0], Pj, CoordStatic, CoordCamb);
			} else if((CoordCamb - newCoord) < boxSize/2 & (CoordCamb - newCoord) > 1){
				img(rutaRel+walkDirection[3][1], Pj, CoordStatic, CoordCamb);
			} else{
				img(rutaRel+walkDirection[3][2], Pj, CoordStatic, CoordCamb);
			}
		}
	}
        
    }
    public static void img(String imagen, ImageIcon Pj, int CoordCamb, int CoordStatic){
	Pj = new ImageIcon(imagen);
	PJlabel.setIcon(Pj);
	PJlabel.setBounds(CoordCamb, CoordStatic, boxSize, boxSize);
    }    
    
    public int getVida(){
        return this.vida; // esto es para saber si nuestra vida ha llegado a 0 si recibimos un ataque
    }
    
    public void setVida(int daño){
        this.vida -= daño; // para bajar la vida en caso de recibir un ataque del enemigo 
    }
}
/*
Por ultimo la principal idea es que cada vez que presionemos una tecla la que se asigne primero se ejecute la comprobacion de si hay algo a su alrededor 
o no y en caso de que lo halla que ejecute lo que he dejado escrito en la J y si llega a 0 que se pueda pasar por ahi
*/

	
