package Personaje;

import java.io.File;
import java.util.Scanner;

public class Mapa {

	int arraySize = 20;
	int map[][];
	int boxSize = 40;
	
	public void readFile(){
		 try {
			 Scanner scan = new Scanner(System.in);
			 scan = new Scanner(new File(".//src//Personaje//mapArray.txt"));
			 map = new int[arraySize][arraySize];
			 while(scan.hasNext()){
				 for(int i = 0; i < arraySize; i++){
					 for(int o = 0; o < arraySize; o++){
						 map[i][o] = scan.nextInt();
					 }
				 }
			 }
			 scan.close();
		 }
		 
		 catch(Exception e){
			 System.out.println("Esto es un error. ¡Como tu!");
		 }
	}
	
	public void insertPj(int x, int y, boolean colocar) {
		if(colocar == true)
			map[x][y] = 1;
		else 
			map[x][y] = 0;
	}

	public int checkMap(int x, int y){
		return map[x][y];
	}
}