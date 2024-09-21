package PedidoInt;

import Pedido.Database;
import Pedido.Pedido;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class IntPizza extends javax.swing.JFrame {

    PedidoP p = new PedidoP();

    public IntPizza() {
        super("Pedido");
        JFrame j = new JFrame();
        j.setLocationRelativeTo(null);
        j.setUndecorated(true);
        initComponents();
        listaSabores();
        listaTamanhos();
        listaBebidas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        comboTamanho = new javax.swing.JComboBox<>();
        comboSabor = new javax.swing.JComboBox<>();
        comboBebida = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clienteNome = new javax.swing.JLabel();
        rua = new javax.swing.JLabel();
        bairro = new javax.swing.JLabel();
        nCasa = new javax.swing.JLabel();
        inputReferencia = new javax.swing.JTextField();
        inputBairro = new javax.swing.JTextField();
        inputRua = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        sair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nReferencia = new javax.swing.JLabel();
        inputNumeroCasa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        comboTamanho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboTamanho.setSelectedItem(null);
        comboTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTamanhoActionPerformed(evt);
            }
        });

        comboSabor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSabor.setSelectedItem(null);
        comboSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSaborActionPerformed(evt);
            }
        });

        comboBebida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBebida.setSelectedItem(null);
        comboBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBebidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tamanho");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bebidas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sabor");

        clienteNome.setBackground(new java.awt.Color(255, 255, 255));
        clienteNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clienteNome.setForeground(new java.awt.Color(255, 255, 255));
        clienteNome.setText("Cliente");

        rua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rua.setForeground(new java.awt.Color(255, 255, 255));
        rua.setText("Rua");

        bairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bairro.setForeground(new java.awt.Color(255, 255, 255));
        bairro.setText("Bairro");

        nCasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nCasa.setForeground(new java.awt.Color(255, 255, 255));
        nCasa.setText("Nº");

        inputReferencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inputReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputReferenciaActionPerformed(evt);
            }
        });

        inputBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        inputRua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        inputNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        sair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sair.setForeground(new java.awt.Color(51, 51, 51));
        sair.setText("Sair");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Finalizar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nReferencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nReferencia.setForeground(new java.awt.Color(255, 255, 255));
        nReferencia.setText("Referência");

        inputNumeroCasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inputNumeroCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumeroCasaActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\monari\\Documents\\NetBeansProjects\\v0.3\\src\\main\\java\\main\\resources\\pixzariaa.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nReferencia))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputNome)
                            .addComponent(inputRua)
                            .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(comboTamanho, 0, 272, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSabor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(rua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clienteNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteNome)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rua)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairro)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCasa)
                    .addComponent(nReferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sair)
                    .addComponent(jButton1))
                .addContainerGap(328, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTamanhoActionPerformed

    }//GEN-LAST:event_comboTamanhoActionPerformed

    private void comboSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSaborActionPerformed

    }//GEN-LAST:event_comboSaborActionPerformed

    private void comboBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBebidaActionPerformed

    }//GEN-LAST:event_comboBebidaActionPerformed

    private void inputReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputReferenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pedido p = new Pedido();
        print();
        p.inserirPedido();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputNumeroCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumeroCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumeroCasaActionPerformed

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
            java.util.logging.Logger.getLogger(IntPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel clienteNome;
    private javax.swing.JComboBox<String> comboBebida;
    private javax.swing.JComboBox<String> comboSabor;
    private javax.swing.JComboBox<String> comboTamanho;
    private javax.swing.JTextField inputBairro;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNumeroCasa;
    private javax.swing.JTextField inputReferencia;
    private javax.swing.JTextField inputRua;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nCasa;
    private javax.swing.JLabel nReferencia;
    private javax.swing.JLabel rua;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables

    public static double extrairEConverter(String input) {
        Pattern pattern = Pattern.compile("\\d+[.,]?\\d*");
        Matcher matcher = pattern.matcher(input);
        String resultado = "";

        if (matcher.find()) {
            resultado = matcher.group();
            resultado = resultado.replace(',', '.');
        }

        return Double.parseDouble(resultado);
    }

    public void print() {
        String tamanho = comboTamanho.getSelectedItem().toString();
        String sabor = comboSabor.getSelectedItem().toString();
        String bebida = comboBebida.getSelectedItem().toString();

        if (tamanho == null) {
            tamanho = "Indefinido!";
        }
        if (sabor == null) {
            sabor = "Indefinido!";
        }
        if (bebida == null) {
            bebida = "Sem bebida.";
        }
        double valorTamanho = extrairEConverter(tamanho);
        double valorSabor = extrairEConverter(sabor);
        double valorBebida = extrairEConverter(bebida);

        double valorTotal = valorTamanho + valorSabor + valorBebida;
        String nomeC = inputNome.getText();
        String rua = inputRua.getText();
        String bairro = inputBairro.getText();
        String nCasa = inputNumeroCasa.getText();
        String referencia = inputReferencia.getText();

        Integer print = JOptionPane.showConfirmDialog(rootPane,
                "-------------------------------\n"
                + "Cliente: " + nomeC + "\n"
                + "Rua: " + rua + "\n"
                + "Bairro: " + bairro + "\n"
                + "Nº " + nCasa + "\n"
                + "Referência " + referencia + "\n"
                + "-------------------------------\n"
                + "PIXZA\n"
                + "Sabor: " + sabor + "\n"
                + "Tamanho: " + tamanho + "\n"
                + "BEBIDAS\n"
                + "Bebida: " + bebida + "\n"
                + "-------------------------------\n"
                + "VALOR TOTAL\n"
                + "R$" + valorTotal + "\n"
                + "-------------------------------\n"
        );

        p.setNome_cliente(nomeC);
        p.setRua(rua);
        p.setBairro(bairro);
        p.setNumero_casa(nCasa);
        p.setReferencia(referencia);

        p.setSabor_pixza(sabor);
        p.setTamanho_pixza(tamanho);
        p.setBebidas(bebida);

        String valor = Double.toString(valorTotal);
        p.setValor_pedido(valor);

        if (print == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Pedido realizado!");
            inserirBebida();
        } else if (print == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Beta");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Beta");
        }
    }

    public void inserirBebida() {
        String nomeC = p.getNome_cliente();
        String rua = p.getRua();
        String bairro = p.getBairro();
        String numeroC = p.getNumero_casa();
        String referencia = p.getReferencia();
        String sabor = p.getSabor_pixza();
        String tamanho = p.getTamanho_pixza();
        String bebida = p.getBebidas();
        String valorPedido = p.getValor_pedido();
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pedidos(nome_cliente, rua, bairro, numero_casa, referencia, tamanho_pixza, sabor_pixza, bebidas, valor_pedido) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

            stmt.setString(1, nomeC);
            stmt.setString(2, rua);
            stmt.setString(3, bairro);
            stmt.setString(4, numeroC);
            stmt.setString(5, referencia);
            stmt.setString(6, sabor);
            stmt.setString(7, tamanho);
            stmt.setString(8, bebida);
            stmt.setString(9, valorPedido);

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(IntPizza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listaSabores() {
        Connection conn = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT sabor, precoSabor FROM sabor";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) comboSabor.getModel();

            model.removeAllElements();

            while (rs.next()) {
                String sabor = rs.getString("sabor");
                String precoSabor = rs.getString("precoSabor");

                model.addElement(sabor + " - R$" + precoSabor);
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

    public void listaTamanhos() {
        Connection conn = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT tamanho, precoTamanho FROM tamanho";  // Agora, vamos pegar apenas o tamanho
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            // Obtém o modelo do combo box
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) comboTamanho.getModel();

            // Remove todos os itens atuais do combo box
            model.removeAllElements();

            // Adiciona os itens ao combo box
            while (rs.next()) {
                String tamanho = rs.getString("tamanho");
                String precoTamanho = rs.getString("precoTamanho");

                model.addElement(tamanho + " - R$" + precoTamanho); // Adiciona apenas o tamanho
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

    public void listaBebidas() {
        Connection conn = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT bebida, precoBebida FROM bebida";  // Agora, vamos pegar apenas o tamanho
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            // Obtém o modelo do combo box
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) comboBebida.getModel();

            // Remove todos os itens atuais do combo box
            model.removeAllElements();

            // Adiciona os itens ao combo box
            while (rs.next()) {
                String bebida = rs.getString("bebida");
                String precoBebida = rs.getString("precoBebida");

                model.addElement(bebida + " - R$" + precoBebida); // Adiciona apenas o tamanho
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

}
