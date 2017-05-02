/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.awt.Color;
import javax.swing.JLabel;

public class FrameJuego extends javax.swing.JFrame {

    private int item1 = 0;
    private int item2 = 0;
    private int item3 = 0;
    private int item4 = 0;
    private int anillo = 0;
    
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
    
    public void actualizaItems(){
      
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
        jLabel1 = new javax.swing.JLabel();
        jLabelLayout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 1000));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen.jpg"))); // NOI18N
        getContentPane().add(jLabelIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 900, 30, 40));

        jLabelIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sandia.jpg"))); // NOI18N
        getContentPane().add(jLabelIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 900, 30, 40));

        jLabelIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sandia.jpg"))); // NOI18N
        jLabelIcon3.setText("algo");
        getContentPane().add(jLabelIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 900, 30, 40));

        jLabelIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sandia.jpg"))); // NOI18N
        jLabelIcon4.setText("algo");
        getContentPane().add(jLabelIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 900, 30, 40));

        jLabelIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sandia.jpg"))); // NOI18N
        jLabelIcon5.setText("algo");
        getContentPane().add(jLabelIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 900, 30, 40));

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
                UseItem1(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 950, 50, -1));

        jButton2.setText("2");
        jButton2.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 950, 50, -1));

        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton3.setRolloverEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 950, 50, -1));

        jButton4.setText("4");
        jButton4.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton4.setRolloverEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 950, 50, -1));

        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton5.setRolloverEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 950, 50, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("   Salir  ");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 90, -1));

        jTextField1.setText("  V1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 910, 30, 30));

        jTextField2.setText("  V2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 910, 30, 30));

        jTextField3.setText("  V3");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 910, 30, 30));

        jTextField4.setText("  V4");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 910, 30, 30));

        jTextField5.setText("  V5");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 910, 30, 30));

        jLabel1.setMaximumSize(new java.awt.Dimension(600, 800));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, 800));

        jLabelLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yre1o.jpg"))); // NOI18N
        getContentPane().add(jLabelLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 800, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yre1o.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void UseItem1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UseItem1
        
    }//GEN-LAST:event_UseItem1

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    public JLabel returnBackground(){
        return jLabel1;
    }
    
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
    private javax.swing.JLabel jLabel1;
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
