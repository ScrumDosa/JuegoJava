import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Mapa {

	//En proceso//
	
	
	
	 int map[][] ={{1, 1, 1, 1, 1, 1},
				  {1, 0, 0, 0, 0, 1},
				  {1, 0, 0, 0, 0, 1},
				  {1, 0, 0, 0, 0, 1},
				  {1, 0, 0, 0, 0, 1},
				  {1, 1, 1, 1, 1, 1}};
	//int map[][] = new int[6][6];
	int boxSize = 100;
	
	
	//private Juego_PruebaSprite_Anim PjClass = new Juego_PruebaSprite_Anim();
	
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