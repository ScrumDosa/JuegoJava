package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JLabel barraInferior;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		barraInferior = new JLabel();
		barraInferior.setBounds(0, 0, getSize().width, getSize().height);
		
		String ruta = "Imagen.jpg";
		URL url = this.getClass().getResource(ruta);
		ImageIcon icon = new ImageIcon(url);
		barraInferior.setIcon(icon);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.black);
		getContentPane().add(barraInferior);
		getContentPane().add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JPanel panelS = new JPanel();
        JPanel panelN = new JPanel();
        JPanel panelE = new JPanel();
        JPanel panelW = new JPanel();
        JPanel panelC = new JPanel();
        
        //sur
        panelS.setLayout(new FlowLayout());
        //panelS.add(comp)
        
        contentPane.add(panelS, BorderLayout.SOUTH);
        contentPane.add(panelN, BorderLayout.NORTH);
        contentPane.add(panelE, BorderLayout.EAST);
        contentPane.add(panelW, BorderLayout.WEST);
        contentPane.add(panelC, BorderLayout.CENTER);
	}

}
