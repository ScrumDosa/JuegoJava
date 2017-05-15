
package npc;

import javax.swing.JFrame;
import javax.swing.JButton;

public class npc extends JFrame{
    
    
       public static void main( String []arg ){
        new npc();
    }
 
    public npc(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        //Esto permite que la ventana aparezca al centro
        this.setLocationRelativeTo(null);
        //
        //Para que el JFrame no tenga ningún formato
        //se coloca el Layout del JFrame en null 
        //no hay que olvidarse de colocarle tamaño y posición
        //a los elementos que se agregan
        this.setLayout(null);
        //
 
        JButton boton = new JButton();
        boton.setText("¡Presioname!");
        //Colocamos la posición y el tamaño
        boton.setBounds(135,150,130,50);
        //Esto se útiliza para agregar el botón al JFrame
        add(boton);
 
        this.setVisible(true);  
    }
}
    

