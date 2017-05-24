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
    private static Enemigo enemyClass = new Enemigo();
    private static Quest questClass = new Quest();
    
    
    static int boxSize = 40;
	 
    static JLabel PJlabel = new JLabel("");					// Creo un JLaber.
    static JLabel BGlabel = new JLabel();
    static JLabel ObjectLabel = new JLabel();
    
    static boolean movRight = false;						// Creamos una variable booleana para cada tipo de movimiento,
    static boolean movLeft = false;							// y las inicializamos como false.
    static boolean movUp = false;
    static boolean movDown = false;
    static boolean tryAttack = false;
    
    static int lastDirection = 0; //1. Arriba // 2. Derecha // 3. Abajo // 4. Izquierda
    
    static String rutaRel = ".//src//Pj_Estados_redimensionados//";
    static String[][] walkDirection = 
	{{"Derecha_Caminando1.png","Derecha_Caminando2.png", "Derecha_Iddle.png"},
	 {"Izquierda_Caminando1.png","Izquierda_Caminando2.png", "Izquierda_Iddle.png"},
	 {"Frente_Caminando1.png","Frente_Caminando2.png", "Frente_Iddle.png"},
	 {"Trasero_Caminando1.png","Trasero_Caminando2.png","Trasero_Iddle.png"}};
	
    private static int vida = 300;
    public static int daño = 30;
    static int nQuest = 0;                      // Variable contador de la quest 1.
    static boolean talk = false;
    
    public static void createPj() {
     	
	mapClass.readFile();
                
	windowMapClass.create_window();
        JFrame window = windowMapClass.get_window();

	ImageIcon Pj = new ImageIcon( rutaRel+"Frente_Iddle.png");
		                
	int pjx = boxSize;										// Declaramos variables para las coordenadas de X e Y que se usar� el Pj.
	int pjy = boxSize;
	mapClass.insertMap(pjx/boxSize, pjy/boxSize, true, 2);

	PJlabel.setIcon(Pj);                                                    // A este JLabel le metemos un Icon, con la ruta de la imagen, 
	PJlabel.setBounds(pjx, pjy, boxSize, boxSize);          			// posteriormente, le daremos unas coordenadas y tama�o.
	window.add(PJlabel);  
        window.setLocationRelativeTo(null);
        
        //Colocando Enemigo
        enemyClass.setMapClass(mapClass);
        enemyClass.CreateEnemy(window);
        
        //Creamos NPCs
        questClass.setMapClass(mapClass);
        questClass.CreateNPC(window);
        //questClass.startQuest(window);
        
        //Colocamos un objeto.
        ImageIcon apple = new ImageIcon(".//src//Imagenes//apple.png");
        ObjectLabel.setIcon(apple);
        ObjectLabel.setBounds(80,80, 40,40);
        window.add(ObjectLabel);
        mapClass.insertMap(2, 2, true, -5);
        
        //Colocalmos el fondo
        ImageIcon background = new ImageIcon(".//src//Imagenes//map1.jpg");
        window.add(BGlabel);
        BGlabel.setIcon(background);
        BGlabel.setBounds(0, 0, 800, 800);
        
        
        
	window.addKeyListener(new KeyListener() {			// A�adimos un KeyListener para detectar los eventos del telcado (pulsar teclas)
        
		@Override
		public void keyPressed(KeyEvent e) {			// Cuando se pulsa una tecla...
			switch (e.getKeyCode()) {
		    	case KeyEvent.VK_D:						// ...Y esa tecla es la  D,
		    		movRight = true;					// ponemos a true el movimiento hacia la derecha.
                                lastDirection = 2;
		    	break;
		    	case KeyEvent.VK_A:						// ... Y esa tecla es la A,
		    		movLeft = true;						// ponemos a true el movimiento hacia la izquierda.
                                lastDirection = 4;
		    	break;
		    	case KeyEvent.VK_W:						// ... Y esa tecla es la W,
		    		movUp = true;						// ponemos a true el movimiento hacia arriba.
                                lastDirection = 1;
		    	break;
		    	case KeyEvent.VK_S:						// ... Y esa tecla es la S,
		    		movDown = true;						// ponemos a true el movimiento hacia abajo.
                                lastDirection = 3;
		    	break;
                        case KeyEvent.VK_Q:
                             tryAttack = true;
                        break;
                        case KeyEvent.VK_E:
                            talk = true;
                        break;
                        case KeyEvent.VK_1: // aunque ponga esto hay que hacer click para que se utilice el item
                            if(frameClass.getItem1() > 0){
                                frameClass.setItem1(-1);
                                vida += 30;
                                System.out.println(vida);   
                        }
                        break;
                        
                        case KeyEvent.VK_2: // aunque ponga esto hay que hacer click para que se utilice el item
                            if(frameClass.getItem2() > 0){
                                frameClass.setItem2(-1);
                                vida += 40;
                                System.out.println(vida);                            
                        }
                        break;
                        
                        case KeyEvent.VK_3: // aunque ponga esto hay que hacer click para que se utilice el item
                            if(frameClass.getItem3() > 0){
                                frameClass.setItem3(-1);
                                vida += 50;
                                System.out.println(vida);                            
                        }
                        break;
                        
                        case KeyEvent.VK_4: // aunque ponga esto hay que hacer click para que se utilice el item
                            if(frameClass.getItem4() > 0){
                                frameClass.setItem4(-1);
                                vida += 60;
                                System.out.println(vida);
                        }
                        break;
                        
                        case KeyEvent.VK_5: // aunque ponga esto hay que hacer click para que se utilice el item
                            if(frameClass.getAnillo() > 0){
                                // aqui va el cambio de mapa hacia el boss
                        }
                        break;
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
		
		quest(talk, pjx, pjy, window);
                
                if (tryAttack == true) {
                    if (lookForEnemy(lastDirection, pjx, pjy) == 3) { 
                        enemyClass.setVida(daño);
                        if (enemyClass.getVida() <= 0) {
                           enemyClass.enemyLabel.setVisible(false);
                           enemyClass.enemyLabel.setEnabled(false);
                        }
                    }
                    tryAttack = false;
                }
                
                
                pjx = Movimiento(movRight, 'x', boxSize, pjx, pjy, Pj);					// Comprobaremos mediante una funci�n si un movimiento se ha puesto a true... 
		pjx = Movimiento(movLeft, 'x', -boxSize, pjx, pjy, Pj);					// ... la funci�n ejecutar� el movimiento, y devolver� la posici�n actual ...
		pjy = Movimiento(movUp, 'y', -boxSize, pjy, pjx, Pj);					// ... del personaje.
		pjy = Movimiento(movDown, 'y', boxSize, pjy, pjx, Pj);
		movRight = false;												// Ponemos todos las variables de movimiento a false.
		movLeft = false;
                movUp = false;
		movDown = false;
                enemyClass.EnemyDirection();
                
                
	}
    }	
    
     public static void checkObject(int x, int y){
        switch(mapClass.checkMap(x, y)){
            case -5:
                frameClass.setItem1(1);
                ObjectLabel.setVisible(false);
            break;
            case -6:
                frameClass.setItem2(1);
            break;
            case -7:
                frameClass.setItem3(1);
            break;
            case -8:
                frameClass.setItem4(1);
            break;
            case -9:
                frameClass.setAnillo(1);
            break;
            
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
	
    public static void imprimirPersonaje(char eje, int recorrido, int CoordCamb, int CoordStatic, int newCoord, ImageIcon Pj) {
        if (eje == 'x') {
            mapClass.insertMap(CoordCamb / boxSize, CoordStatic / boxSize, false, 2);
            checkObject(newCoord / boxSize, CoordStatic / boxSize);
            mapClass.insertMap(newCoord / boxSize, CoordStatic / boxSize, true, 2);
            if (recorrido > 0) {
                if ((newCoord - CoordCamb) > boxSize / 2) {
                    img(rutaRel + walkDirection[0][0], Pj, CoordCamb, CoordStatic);
                } else if ((newCoord - CoordCamb) < boxSize / 2 & (newCoord - CoordCamb) > 1) {
                    img(rutaRel + walkDirection[0][1], Pj, CoordCamb, CoordStatic);
                } else {
                    img(rutaRel + walkDirection[0][2], Pj, CoordCamb, CoordStatic);
                }
            } else if (recorrido < 0) {
                if ((CoordCamb - newCoord) > boxSize / 2) {
                    img(rutaRel + walkDirection[1][0], Pj, CoordCamb, CoordStatic);
                } else if ((CoordCamb - newCoord) < boxSize / 2 & (CoordCamb - newCoord) > 1) {
                    img(rutaRel + walkDirection[1][1], Pj, CoordCamb, CoordStatic);
                } else {
                    img(rutaRel + walkDirection[1][2], Pj, CoordCamb, CoordStatic);
                }
            }
        } else if (eje == 'y') {
            mapClass.insertMap(CoordStatic / boxSize, CoordCamb / boxSize, false, 2);
            checkObject(CoordStatic / boxSize, newCoord / boxSize);
            mapClass.insertMap(CoordStatic / boxSize, newCoord / boxSize, true, 2);

            if (recorrido > 0) {
                if ((newCoord - CoordCamb) > boxSize / 2) {
                    img(rutaRel + walkDirection[2][0], Pj, CoordStatic, CoordCamb);
                } else if ((newCoord - CoordCamb) < boxSize / 2 & (newCoord - CoordCamb) > 1) {
                    img(rutaRel + walkDirection[2][1], Pj, CoordStatic, CoordCamb);
                } else {
                    img(rutaRel + walkDirection[2][2], Pj, CoordStatic, CoordCamb);
                }
            } else if (recorrido < 0) {
                if ((CoordCamb - newCoord) > boxSize / 2) {
                    img(rutaRel + walkDirection[3][0], Pj, CoordStatic, CoordCamb);
                } else if ((CoordCamb - newCoord) < boxSize / 2 & (CoordCamb - newCoord) > 1) {
                    img(rutaRel + walkDirection[3][1], Pj, CoordStatic, CoordCamb);
                } else {
                    img(rutaRel + walkDirection[3][2], Pj, CoordStatic, CoordCamb);
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
    
    public static int lookForEnemy(int direction, int x, int y) {
        switch (direction) {
            case 1:
                return mapClass.checkMap(x / boxSize, y / boxSize - 1);
            case 2:
                return mapClass.checkMap(x / boxSize + 1, y / boxSize);
            case 3:
                return mapClass.checkMap(x / boxSize, y / boxSize + 1);
            case 4:
                return mapClass.checkMap(x / boxSize - 1, y / boxSize);
            default:
                break;
        }

        return 0;
    }
    
    public static void quest(boolean talk, int pjx, int pjy, JFrame window){                //funcion de la quest 1
                if (talk == true){
                    if ((lookForEnemy(lastDirection, pjx, pjy) == 4 && nQuest == 0) ||(lookForEnemy(lastDirection, pjx, pjy) == 4 && nQuest == 1)){
                        questClass.mostrarDialogo(window, talk, nQuest);
                        if (nQuest == 0)
                            nQuest++;
                    }
                    if (lookForEnemy(lastDirection, pjx, pjy) == 4 && nQuest >= 2){
                        if(nQuest == 2){                           
                            questClass.mostrarDialogo(window, talk, nQuest);
                            nQuest++;
                        } else if(nQuest == 4){
                            questClass.mostrarDialogo(window, talk, nQuest);
                        }
                    }
                    if((lookForEnemy(lastDirection, pjx, pjy) != 4)){
                        talk = false;
                        questClass.mostrarDialogo(window, talk, nQuest);
                        if (nQuest == 3)
                            nQuest++;
                    }
                }
                
                nQuest = questClass.comprobarQuest(nQuest);
    }
    
    
    
    /*
 +La idea seria que no cogiese readFile la misma ruta que se le pase por parametro o que sea opcional o hacer un segundo readFile para cuando se cambie
 +de mapa. Bien dicho eso el personaje solo puede moverse por donde haya 0 pero... y si ponemos un 2 en el mapa y dejamos que se situe encima del 2 y
 +comprobando esas coordenadas si vemos un 2 cargamos el fondo de nuevo e insertamos el pj en el lado que le corresponda algo en plan 
 +if(checkMap(x, y) == 2){
 +    readFile(mapa2)
 +    imageIcon(de la clase personaje ponemos la nueva imagen de fondo)
 +    insertpj(lateral del mapa por el que entre osea si entra por la izquierda le situamos a la derecha)
 +}
 +
 +Respecto a la quest por ejemplo que la quest sea matar al enemigo y que nos la de un tio que pongamos en pantalla al presionar una tecla nos saque un 
 +dialogo JOptionPane.showInputDialog es un poco cutre pero nos soluciona y ponemos que cuando muera el enemigo salte otro con quest completa y nos sume 1
 +a un item
 +
 +te dejo hechos los set de los items en frame juego... seria algo en plan 
 +
 +if(enemigo.getvida() >= 0)
 +    JOptionPane.showInputDialog(tiene 2 parametros miratelos) quest complete
 +    JOptionPane.showInputDialog(tiene 2 parametros miratelos) recompensa: +1 manzana y todo eso
 +
 +    frameClass.setItem1(1) esto lo incrementa en uno
 +    frameClass.setItem2(1) esto lo incrementa en uno
 +    frameClass.setItem3(1) esto lo incrementa en uno
 +    frameClass.setItem4(1) esto lo incrementa en uno
 +    frameClass.setAnillo(1) esto lo incrementa en uno
 +
 +*/
    
}


	
