/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CardapioInt;

import Pedido.Database;
import Pedido.Pedido;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

public class addTamanho extends javax.swing.JFrame {
    private DefaultTableModel tabelaTamanho = new DefaultTableModel(new Object[]{"Tamanho", "Preço"}, 0);

    public addTamanho() {
        super("Adicionar Tamanho");
        initComponents();
        listaTamanhos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddTamanho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputTamanho = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputPrecoT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTtamanho = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAddTamanho.setText("Adicionar Tamanho");
        btnAddTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTamanhoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tamanho");

        inputTamanho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTamanhoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Preço");

        inputPrecoT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputPrecoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrecoTActionPerformed(evt);
            }
        });

        JTtamanho.setModel(tabelaTamanho);
        jScrollPane2.setViewportView(JTtamanho);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(inputPrecoT)
                    .addComponent(inputTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddTamanho)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPrecoT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnAddTamanho))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPrecoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrecoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrecoTActionPerformed

    private void btnAddTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTamanhoActionPerformed
        Integer print = JOptionPane.showConfirmDialog(rootPane,
                "Deseja adicionar esse tamanho?"
        );
        if (print == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Tamanho Adicionado");
            inserirTamanho();
            this.setVisible(false);
        } else if (print == JOptionPane.NO_OPTION || print == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Tamanho Não Adicionado");
        }
    }//GEN-LAST:event_btnAddTamanhoActionPerformed

    private void inputTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTamanhoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inputTamanho.setText("");
        inputPrecoT.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(addTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addTamanho().setVisible(true);
            }
        });
    }

    public void inserirTamanho() {
        String tamanho = inputTamanho.getText();

        String precoTa = inputPrecoT.getText();
        double precoT = Double.parseDouble(precoTa);

        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO tamanho(tamanho, precoTamanho) VALUES (?, ?)");

            stmt.setString(1, tamanho);
            stmt.setDouble(2, precoT);
            stmt.execute();

        } catch (SQLException ex) {

            Logger.getLogger(addTamanho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listaTamanhos() {
        Connection conn = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {

            String sql = "SELECT tamanho, precoTamanho FROM tamanho";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) JTtamanho.getModel();

            model.setRowCount(0);

            while (rs.next()) {
                String tamanho = rs.getString("tamanho");
                double precoTamanho = rs.getDouble("precoTamanho");

                model.addRow(new Object[]{tamanho, "R$" + precoTamanho});
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTtamanho;
    private javax.swing.JButton btnAddTamanho;
    private javax.swing.JTextField inputPrecoT;
    private javax.swing.JTextField inputTamanho;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
