package Personaje;

import javax.swing.JFrame;

public class Ventana_mapa {
        
    JFrame window = new JFrame(); // Creo un JFrame que actuará de ventana del juego (no hud).
    
    public void create_window(){                                                      
	window.setBounds(560, 100, 800, 805);  // Damos unas propiedades b�sicas al JFrame.
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.getContentPane().setLayout(null);
        window.setUndecorated(true);
	window.setVisible(true);
        window.setAlwaysOnTop(true);
    }
    
    public JFrame get_window(){
        return window;
    }
}
