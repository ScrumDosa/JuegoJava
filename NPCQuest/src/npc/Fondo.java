
package npc;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fondo extends JFrame{
    
    JLabel npc;
    ImageIcon personaje;

    
    public Fondo(){
       
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        personaje = new ImageIcon("personaje.png");
        npc = new JLabel(personaje);
        
        add(npc);
        setVisible(true);
        setSize(500,500);
         
    }
    
    
    
    public static void main(String[] args){
        
        Fondo f = new Fondo();
        
    }

   
    
    
}
