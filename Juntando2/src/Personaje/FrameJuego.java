/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.awt.Color;
import javax.swing.JLabel;

public class FrameJuego extends javax.swing.JFrame {

    private int item1 = 3;
    private int item2 = 3;
    private int item3 = 3;
    private int item4 = 3;
    private int anillo = 1;

    
    public FrameJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.jButton6.setBackground(Color.WHITE);
        this.jTextField1.setText(String.valueOf(item1));
        this.jTextField2.setText(String.valueOf(item2));
        this.jTextField3.setText(String.valueOf(item3));
        this.jTextField4.setText(String.valueOf(item4));
        this.jTextField5.setText(String.valueOf(anillo));
    }
    // setters y getters para los items
    public void setItem1(int item1) {
            this.item1 += item1;
            setjTextField1();
    }
 
    public void setItem2(int item2) {
         this.item2 += item2;
         setjTextField2();
    }
 
    public void setItem3(int item3) {
         this.item3 += item3;
         setjTextField3();
    }
 
    public void setItem4(int item4) {
         this.item4 += item4;
         setjTextField4();
    }
 
    public void setAnillo(int anillo) {
         this.anillo += anillo;
         setjTextField5();
    }    
     
    public int getItem1() {
        return item1;
    }

    public int getItem2() {
        return item2;
    }

    public int getItem3() {
        return item3;
    }

    public int getItem4() {
        return item4;
    }

    public int getAnillo() {
        return anillo;
    }
    
    // getters para actualizar el texto de la interfaz
    public void setjTextField1() {
        this.jTextField1.setText(String.valueOf(item1));
    }

    public void setjTextField2() {
        this.jTextField2.setText(String.valueOf(item2));
    }

    public void setjTextField3() {
        this.jTextField3.setText(String.valueOf(item3));
    }

    public void setjTextField4() {
        this.jTextField4.setText(String.valueOf(item4));
    }

    public void setjTextField5() {
        this.jTextField5.setText(String.valueOf(anillo));
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon1 = new javax.swing.JLabel();
        jLabelIcon2 = new javax.swing.JLabel();
        jLabelIcon3 = new javax.swing.JLabel();
        jLabelIcon4 = new javax.swing.JLabel();
        jLabelIcon5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabelLayout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 1000));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/apple.png"))); // NOI18N
        getContentPane().add(jLabelIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 900, 30, 40));

        jLabelIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chicken.png"))); // NOI18N
        getContentPane().add(jLabelIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 900, 30, 40));

        jLabelIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/heart.png"))); // NOI18N
        jLabelIcon3.setText("algo");
        getContentPane().add(jLabelIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 900, 30, 40));

        jLabelIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fish.png"))); // NOI18N
        jLabelIcon4.setText("algo");
        getContentPane().add(jLabelIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 900, 30, 40));

        jLabelIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ring.jpeg"))); // NOI18N
        jLabelIcon5.setText("algo");
        getContentPane().add(jLabelIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 900, 30, 40));

        jButton1.setText("1");
        jButton1.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton1.setRolloverEnabled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 952, 50, 30));

        jButton2.setText("2");
        jButton2.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton2.setRolloverEnabled(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 952, 60, 30));

        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton3.setRolloverEnabled(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 952, 60, 30));

        jButton4.setText("4");
        jButton4.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton4.setRolloverEnabled(false);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 952, 60, 30));

        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton5.setRolloverEnabled(false);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 950, 60, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("   Salir  ");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 120, -1));

        jTextField1.setEditable(false);
        jTextField1.setText("  V1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 910, 30, 30));

        jTextField2.setText("  V2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 910, 30, 30));

        jTextField3.setText("  V3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 910, 30, 30));

        jTextField4.setText("  V4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 910, 30, 30));

        jTextField5.setText("  V5");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 910, 30, 30));

        jLabelLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_bajo.jpg"))); // NOI18N
        getContentPane().add(jLabelLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 800, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_alto.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar
        System.exit(0);
    }//GEN-LAST:event_cerrar

    
    public void colocar(JLabel label){
        //this.getContentPane().add(label);
    }
    
    
    public static void runInterface() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJuego().setVisible(true);
                
           }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIcon1;
    private javax.swing.JLabel jLabelIcon2;
    private javax.swing.JLabel jLabelIcon3;
    private javax.swing.JLabel jLabelIcon4;
    private javax.swing.JLabel jLabelIcon5;
    private javax.swing.JLabel jLabelLayout;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField3;
    private static javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}