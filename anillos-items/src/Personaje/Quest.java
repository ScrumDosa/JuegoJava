package Personaje;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quest {
    
    static int boxSize = 40;
    
    private static Mapa mapClass;
    private static Ventana_mapa windowMapClass;
    
    static JLabel NPClabel; 
    
    private int NPCx;
    private int NPCy;
    
    JLabel talkBox = new JLabel();
    JLabel textTalk = new JLabel();
    
    public void setMapClass(Mapa mapClass) {
        Quest.mapClass = mapClass;
    }
    
    public void CreateNPC(JFrame window, int x, int y){
        windowMapClass = new Ventana_mapa();
        NPClabel = new JLabel("");
        
        ImageIcon enemy = new ImageIcon( ".//src//Enemigo_Estados_Redimensionados//Frente_Iddle.png");
        
        NPCx = boxSize * x;						// Declaramos variables para las coordenadas de X e Y que se usar� el Pj.
	NPCy = boxSize * y;
        
	mapClass.insertMap(NPCx/boxSize, NPCy/boxSize, true,4);

        
	NPClabel.setIcon(enemy);                                              // A este JLabel le metemos un Icon, con la ruta de la imagen, 
	NPClabel.setBounds(NPCx, NPCy, boxSize, boxSize);          	// posteriormente, le daremos unas coordenadas y tama�o.
	window.add(NPClabel); 
        
        
        talkBox.setIcon(new ImageIcon(".//src//Imagenes//dialogo_fondo.png"));
        talkBox.setBounds(0,500,800,300);
        talkBox.setVisible(false);
        
        textTalk.setIcon(new ImageIcon(".//src//Imagenes//texto1.png"));
        textTalk.setBounds(0,600,800,200);
        textTalk.setVisible(false);
        
        window.add(textTalk);
        window.add(talkBox);
    }
    
    public void mostrarDialogo(JFrame window, boolean mostrar, int estadoQuest){
        if(mostrar == true){
            if (estadoQuest <= 1)
                textTalk.setVisible(true);
            if (estadoQuest == 2){
                textTalk.setIcon(new ImageIcon(".//src//Imagenes//texto2.png"));
                textTalk.setVisible(true);
            }
            if (estadoQuest == 4)
                textTalk.setIcon(new ImageIcon(".//src//Imagenes//texto3.png"));
                textTalk.setVisible(true);
            talkBox.setVisible(true);
        }
           
        
        if(mostrar == false){
            textTalk.setVisible(false);
            talkBox.setVisible(false);
        }
        

            
        
                
    }
    
    public int comprobarQuest(int nQuest){
        if(nQuest == 0)
            return 0;
        if(nQuest ==1){
            if(mapClass.checkMap(1, 1) == 2)
                return 2;
            else
                return nQuest;
        }    
    return nQuest;
    }
}
