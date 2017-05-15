/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class FrameJuego extends javax.swing.JFrame {

    
    public void setItem1(int item1) {
         this.item1 += item1;
     }
 
     public void setItem2(int item2) {
         this.item2 += item2;
     }
 
     public void setItem3(int item3) {
         this.item3 += item3;
     }
 
     public void setItem4(int item4) {
         this.item4 += item4;
     }
 
     public void setAnillo(int anillo) {
         this.anillo += anillo;
     }    
   
    private int item1 = 3;
    private int item2 = 3;
    private int item3 = 3;
    private int item4 = 3;
    private int anillo = 1;
    
    public FrameJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jButton6.setBackground(Color.WHITE);
        this.jTextField1.setText(String.valueOf(item1));
        this.jTextField2.setText(String.valueOf(item2));
        this.jTextField3.setText(String.valueOf(item3));
        this.jTextField4.setText(String.valueOf(item4));
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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                useItem1(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 952, 50, 30));

        jButton2.setText("2");
        jButton2.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                useItem2(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 952, 60, 30));

        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton3.setRolloverEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                useItem3(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 952, 60, 30));

        jButton4.setText("4");
        jButton4.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton4.setRolloverEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                useItem4(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 952, 60, 30));

        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton5.setRolloverEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                useRing(evt);
            }
        });
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
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         if(item4 > 0){
            --item4;
            this.jTextField4.setText(String.valueOf(item4));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(item1 > 0){
            --item1;
            this.jTextField1.setText(String.valueOf(item1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(item2 > 0){
            --item2;
            this.jTextField2.setText(String.valueOf(item2));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if(item3 > 0){
            --item3;
            this.jTextField3.setText(String.valueOf(item3));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void useItem1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useItem1
        int keycode = evt.getKeyCode();
            if(KeyEvent.VK_1 == keycode && item1 > 0){
                --item1;
                this.jTextField1.setText(String.valueOf(item1));
            }
    }//GEN-LAST:event_useItem1

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(anillo > 1){
           // usara las propiedades del anillo que aun no estan definidas
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar
        System.exit(0);
    }//GEN-LAST:event_cerrar

    private void useItem2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useItem2
        int keycode = evt.getKeyCode();
            if(KeyEvent.VK_2 == keycode && item2 > 0){
                --item2;
                this.jTextField2.setText(String.valueOf(item2));
            }
    }//GEN-LAST:event_useItem2

    private void useItem3(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useItem3
        int keycode = evt.getKeyCode();
            if(KeyEvent.VK_3 == keycode && item3 > 0){
                --item3;
                this.jTextField3.setText(String.valueOf(item3));
            }
    }//GEN-LAST:event_useItem3

    private void useItem4(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useItem4
        int keycode = evt.getKeyCode();
            if(KeyEvent.VK_4 == keycode && item4 > 0){
                --item4;
                this.jTextField4.setText(String.valueOf(item4));
            }
    }//GEN-LAST:event_useItem4

    private void useRing(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useRing
        int keycode = evt.getKeyCode();
            if(KeyEvent.VK_5 == keycode && anillo == 1){
            //hara cosas que definiremos
        }
    }//GEN-LAST:event_useRing

    
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}
