/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class Pasemapa {
    
    import java.util.*;
import java.io.*;

public abstract class Personaje {
public static ArrayList<String> validExtensions;

private String Personaje;

private String Mapa;

protected HashMap<String, Object> loaded;

public Personaje () {
		this(".", "");
	}

public Loader(String path, String loader) {
		validExtensions = new ArrayList<String>();
		validExtensions.add("");
		
		packageDirectory = getClass()
			.getClassLoader().getResource("")
			.getPath();
		packageDirectory = packageDirectory.substring(0,
			packageDirectory.lastIndexOf("bin/"));
		setPath(path);
		setLoader(loader);
		
		System.out.println("Package Directory "
			+packageDirectory);
		System.out.println("Relative Path: "+relativePath);
		System.out.println("Personaje: "+loader+" exists-> "
			+Mapa());
	}

public Personaje (String  objetos, String personaje) {
		validExtensions = new ArrayList<String>();
		validExtensions.add("");
		// Obtenemos el directorio de una forma enrevesada
		// para poder utilizar el cargador en Apples.
		packageDirectory = getClass()
			.getClassLoader().getResource("")
			.getPath();
		packageDirectory = packageDirectory.substring(0,
			packageDirectory.lastIndexOf("bin/"));
		setPath(path);
		setLoader(loader);
		
		System.out.println("Package Directory "
			+packageDirectory);
		System.out.println("Relative Path: "+relativePath);
		System.out.println("Loader: "+loader+" exists-> "
			+existsLoader());
    
}
