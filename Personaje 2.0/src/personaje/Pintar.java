package personaje;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pintar extends JPanel {
	


	private static final long serialVersionUID = 1L;


	public Pintar(){
		this.setSize(800,800);
	}


	public void paint(Graphics g){
		Dimension n = getSize();
		ImageIcon fondo = new ImageIcon(getClass().getResource("background.jpg"));
		g.drawImage(fondo.getImage(), 0, 0, n.width, n.height, null);
		setOpaque(false);
		super.paint(g);
	}
}
