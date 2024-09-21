package InicioInt;

import PedidoInt.IntPizza;
import java.awt.*;
import javax.swing.*;
import CardapioInt.*;
import PedidoInt.VerPedidos;

public class homee extends javax.swing.JFrame {
    
    public homee() {
        super("Home");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        fazP = new javax.swing.JMenuItem();
        verP = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuTamanho = new javax.swing.JMenuItem();
        menuSabor = new javax.swing.JMenuItem();
        menuBebida = new javax.swing.JMenuItem();
        verCardapio = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\monari\\Documents\\NetBeansProjects\\v0.3\\src\\main\\java\\main\\resources\\pixzariaa.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jMenu1.setText("Ações");

        fazP.setText("Fazer Pedido");
        fazP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazPActionPerformed(evt);
            }
        });
        jMenu1.add(fazP);

        verP.setText("Ver Pedidos");
        verP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPActionPerformed(evt);
            }
        });
        jMenu1.add(verP);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Cardápio");

        menuTamanho.setText("Novo Tamanho");
        menuTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamanhoActionPerformed(evt);
            }
        });
        jMenu3.add(menuTamanho);

        menuSabor.setText("Novo Sabor");
        menuSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaborActionPerformed(evt);
            }
        });
        jMenu3.add(menuSabor);

        menuBebida.setText("Nova Bebida");
        menuBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBebidaActionPerformed(evt);
            }
        });
        jMenu3.add(menuBebida);

        verCardapio.setText("Ver Cardápio");
        verCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCardapioActionPerformed(evt);
            }
        });
        jMenu3.add(verCardapio);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fazPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazPActionPerformed
        JFrame j = new IntPizza();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
    }//GEN-LAST:event_fazPActionPerformed

    private void menuTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamanhoActionPerformed
        JFrame j = new addTamanho();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuTamanhoActionPerformed

    private void menuSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaborActionPerformed
        JFrame j = new addSabor();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuSaborActionPerformed

    private void verCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCardapioActionPerformed
        JFrame j = new JCardapio();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
    }//GEN-LAST:event_verCardapioActionPerformed

    private void menuBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBebidaActionPerformed
        JFrame j = new addBebida();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuBebidaActionPerformed

    private void verPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPActionPerformed
        JFrame j = new VerPedidos();
        j.setVisible(true);
        j.setLocationRelativeTo(null);    }//GEN-LAST:event_verPActionPerformed

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
            java.util.logging.Logger.getLogger(homee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem fazP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuBebida;
    private javax.swing.JMenuItem menuSabor;
    private javax.swing.JMenuItem menuTamanho;
    private javax.swing.JMenuItem verCardapio;
    private javax.swing.JMenuItem verP;
    // End of variables declaration//GEN-END:variables
}
