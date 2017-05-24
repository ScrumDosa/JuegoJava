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
	
	public void insertMap(int x, int y, boolean colocar, int num) {     //funcion para insertar un valor o quitarlo del array bidimensional
		if(colocar == true)
			map[x][y] = num;
		else 
			map[x][y] = 0;
	}

	public int checkMap(int x, int y){                  // Funcion para mirar que hay en el array bidimensional
		return map[x][y];
	}
}
