package Personaje;

import java.io.File;
import java.util.Scanner;

public class Mapa {

	int arraySize = 20;
	int map[][];
	int boxSize = 40;

    public int getArraySize() {
        return arraySize;
    }

    public int[][] getMap() {
        return map;
    }

    public int getBoxSize() {
        return boxSize;
    }
	
	public void readFile(){
		 try {
			 Scanner scan = new Scanner(System.in);
			 scan = new Scanner(new File(".//src//Personaje//map1.txt"));
			 map = new int[arraySize][arraySize];
			 while(scan.hasNext()){
				 for(int i = 0; i < arraySize; i++){
					 for(int o = 0; o < arraySize; o++){
						 map[o][i] = scan.nextInt();
					 }
				 }
			 }
			 scan.close();
		 }
		 
		 catch(Exception e){
			 System.out.println("Esto es un error.");
		 }
	}
	
	public void insertPj(int x, int y, boolean colocar) {
		if(colocar == true)
			map[x][y] = 2;
		else 
			map[x][y] = 0;
	}

        public void insertEnemy(int x, int y, boolean colocar) {
		if(colocar == true)
 			map[x][y] = 3;
                else 
			map[x][y] = 0;
	}

	public int checkMap(int x, int y){
		return map[x][y];
	}
}


/*
La idea seria que no cogiese readFile la misma ruta que se le pase por parametro o que sea opcional o hacer un segundo readFile para cuando se cambie
de mapa. Bien dicho eso el personaje solo puede moverse por donde haya 0 pero... y si ponemos un 2 en el mapa y dejamos que se situe encima del 2 y
comprobando esas coordenadas si vemos un 2 cargamos el fondo de nuevo e insertamos el pj en el lado que le corresponda algo en plan 
if(checkMap(x, y) == 2){
    readFile(mapa2)
    imageIcon(de la clase personaje ponemos la nueva imagen de fondo)
    insertpj(lateral del mapa por el que entre osea si entra por la izquierda le situamos a la derecha)
}

Respecto a la quest por ejemplo que la quest sea matar al enemigo y que nos la de un tio que pongamos en pantalla al presionar una tecla nos saque un 
dialogo JOptionPane.showInputDialog es un poco cutre pero nos soluciona y ponemos que cuando muera el enemigo salte otro con quest completa y nos sume 1
a un item

te dejo hechos los set de los items en frame juego... seria algo en plan 

if(enemigo.getvida() >= 0)
    JOptionPane.showInputDialog(tiene 2 parametros miratelos) quest complete
    JOptionPane.showInputDialog(tiene 2 parametros miratelos) recompensa: +1 manzana y todo eso

    frameClass.setItem1(1) esto lo incrementa en uno
    frameClass.setItem2(1) esto lo incrementa en uno
    frameClass.setItem3(1) esto lo incrementa en uno
    frameClass.setItem4(1) esto lo incrementa en uno
    frameClass.setAnillo(1) esto lo incrementa en uno

*/