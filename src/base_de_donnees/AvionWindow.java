/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package base_de_donnees;

import aeroclub.Bdd;
import aeroclub.Parameters;
import aeroclub.ResultSetTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandre.dhaene
 */
public class AvionWindow extends javax.swing.JFrame {

    ResultSet rs;
    Bdd db;
    
    public AvionWindow() {
        db = new Bdd(new Parameters().HOST_DB, new Parameters().USERNAME_DB, 
             new Parameters().PASSWORD_DB, new Parameters().IPHOST, new Parameters().PORT);
        
        initComponents();
        table();
    }
    
    public void table(){
        String a[] = {"num_avion","num_forfait", "typeavion", "taux", "reduction_semaine", "immatriculation"};
        rs = db.querySelect(a, "avions");
        table_avions.setModel(new ResultSetTableModel(rs));
    }
    
    public void actualiser(){
        txt_rech.setText("");
        txt_num_avion.setText("");
        txt_num_forfait.setText("");
        txt_type_avion.setText("");
        txt_taux.setText("");
        txt_reduction.setText("");
        txt_immatriculation.setText("");
        rech_com.setSelectedItem("num_avion");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_avions = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_num_avion = new javax.swing.JTextField();
        txt_num_forfait = new javax.swing.JTextField();
        txt_type_avion = new javax.swing.JTextField();
        txt_taux = new javax.swing.JTextField();
        txt_reduction = new javax.swing.JTextField();
        txt_immatriculation = new javax.swing.JTextField();
        rech_com = new javax.swing.JComboBox();
        txt_rech = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ajoutBtn = new javax.swing.JButton();
        modifBtn = new javax.swing.JButton();
        supprBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        supprBtn1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Gestion des avions");

        table_avions.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        table_avions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_avion", "num_forfait", "typeAvion", "taux", "reduction_semaine", "immatriculation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_avions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_avionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_avions);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("num_avion :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("num_forfait :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Type d'avion :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("taux :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("reduction semaine :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("immatriculation :");

        rech_com.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "num_avion", "num_forfait", "typeAvion", "taux", "reduction_semaine", "immatriculation" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("rechercher :");

        ajoutBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ajoutBtn.setText("ajouter");
        ajoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutBtnActionPerformed(evt);
            }
        });

        modifBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        modifBtn.setText("modifier");
        modifBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifBtnActionPerformed(evt);
            }
        });

        supprBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        supprBtn.setText("supprimer");
        supprBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprBtnActionPerformed(evt);
            }
        });

        jButton4.setText("retour");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        supprBtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        supprBtn1.setText("actualiser");
        supprBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprBtn1ActionPerformed(evt);
            }
        });

        jButton2.setText("rechercher");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton4)
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_num_avion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_immatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_reduction, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_taux, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_type_avion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_num_forfait, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(rech_com, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_rech, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(ajoutBtn)
                .addGap(63, 63, 63)
                .addComponent(modifBtn)
                .addGap(66, 66, 66)
                .addComponent(supprBtn)
                .addGap(66, 66, 66)
                .addComponent(supprBtn1)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(rech_com, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ajoutBtn)
                            .addComponent(modifBtn)
                            .addComponent(supprBtn)
                            .addComponent(supprBtn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_num_avion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_num_forfait, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_type_avion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_taux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_reduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_immatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supprBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprBtn1ActionPerformed
        actualiser();
    }//GEN-LAST:event_supprBtn1ActionPerformed

    private void ajoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutBtnActionPerformed
        
        if(txt_num_avion.getText().equals("") || txt_num_forfait.getText().equals("")){
            JOptionPane.showMessageDialog(this, "num_avion et num_forfait doivent être remplis");
        }else{
            String[] colonne = {"num_avion", "num_forfait", "typeavion", "taux", "reduction_semaine", "immatriculation"};
            
            String[] infos = {txt_num_avion.getText(), txt_num_forfait.getText(), txt_type_avion.getText(), txt_taux.getText(), txt_reduction.getText()
                            ,txt_immatriculation.getText()};
        
            System.out.println(db.queryInsert("avions", colonne, infos));
            table();
            actualiser();
            
        }
    }//GEN-LAST:event_ajoutBtnActionPerformed

    private void modifBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifBtnActionPerformed
        if(txt_num_avion.getText().equals("") || txt_num_forfait.getText().equals("")){
            JOptionPane.showMessageDialog(this, "num_avion et num_forfait doivent être remplis");
        }else{
            String[] colonne = {"num_avion", "num_forfait", "typeavion", "taux", "reduction_semaine", "immatriculation"};
            
            String[] infos = {txt_num_avion.getText(), txt_num_forfait.getText(), txt_type_avion.getText(), txt_taux.getText(), txt_reduction.getText()
                            ,txt_immatriculation.getText()};
        
            
            String id = String.valueOf(table_avions.getValueAt(table_avions.getSelectedRow(), 0));
            
            System.out.println(db.queryUpdate("avions", colonne, infos,"num_avion='"+ id +"'"));
            table();
            actualiser();
        
        }
    }//GEN-LAST:event_modifBtnActionPerformed

    private void table_avionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_avionsMouseClicked
        String id;
        id = (String.valueOf(table_avions.getValueAt(table_avions.getSelectedRow(), 0)));
        rs = db.querySelectAll("avions", "num_avion='"+ id +"'" );
        try {
            rs.next();
            txt_num_avion.setText(rs.getString(1)); 
            txt_num_forfait.setText(rs.getString(2));
            txt_type_avion.setText(rs.getString(3)); 
            txt_taux.setText(rs.getString(4));
            txt_reduction.setText(rs.getString(5));
            txt_immatriculation.setText(rs.getString(6)); 
        } catch (SQLException ex) { 
            Logger.getLogger(MembreWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_avionsMouseClicked

    private void supprBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprBtnActionPerformed
        String numMembre = String.valueOf(table_avions.getValueAt(table_avions.getSelectedRow(), 0));
        if(JOptionPane.showConfirmDialog(this, "etes vous sûr de vouloir supprimer cet avion", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            db.queryDelete("avions", "num_avion="+ numMembre);
        }else{
            return;
        }
        table();
        actualiser();
    }//GEN-LAST:event_supprBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String a[] = {"num_avion","num_forfait", "typeavion", "taux", "reduction_semaine", "immatriculation"};
        
        if(txt_rech.getText().equals("") && !(rech_com.getSelectedItem().equals("membre_actif") || rech_com.getSelectedItem().equals("membre_inscrit"))){
            JOptionPane.showMessageDialog(this, "Vous devez entrer quelque chose");
        }else{
            if(rech_com.getSelectedItem().equals("num_avion")){
                rs = db.fcSelectCommand(a, "avions", "num_avion LIKE '%"+ txt_rech.getText() +"%'");
                table_avions.setModel(new ResultSetTableModel(rs));
            }else if(rech_com.getSelectedItem().equals("num_forfait")){
                    rs = db.fcSelectCommand(a, "avions", "num_forfait LIKE '%"+ txt_rech.getText() +"%'");
                    table_avions.setModel(new ResultSetTableModel(rs));
            }
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Principale p = new Principale();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AvionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AvionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajoutBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifBtn;
    private javax.swing.JComboBox rech_com;
    private javax.swing.JButton supprBtn;
    private javax.swing.JButton supprBtn1;
    private javax.swing.JTable table_avions;
    private javax.swing.JTextField txt_immatriculation;
    private javax.swing.JTextField txt_num_avion;
    private javax.swing.JTextField txt_num_forfait;
    private javax.swing.JTextField txt_rech;
    private javax.swing.JTextField txt_reduction;
    private javax.swing.JTextField txt_taux;
    private javax.swing.JTextField txt_type_avion;
    // End of variables declaration//GEN-END:variables
}
