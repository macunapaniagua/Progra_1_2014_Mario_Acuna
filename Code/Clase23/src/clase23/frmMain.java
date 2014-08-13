/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase23;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario A
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        
        buttonGroup1.add(rbFemenino);
        buttonGroup1.add(rbMasculino);
        buttonGroup1.add(rbIndefinido);
        
        //lblTitulo.setAlignmentX(frmMain.getWindows()[0].WIDTH-lblTitulo.getAlignmentX()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmails = new javax.swing.JTextArea();
        txtEmail = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        cmbPais = new javax.swing.JComboBox();
        chkEspañol = new javax.swing.JCheckBox();
        chkIngles = new javax.swing.JCheckBox();
        chkFrances = new javax.swing.JCheckBox();
        btnIdiomas = new javax.swing.JButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        rbIndefinido = new javax.swing.JRadioButton();
        btnValidar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        mnColorRojo = new javax.swing.JMenuItem();
        mnColorAmariillo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Hola Mundo");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtEmails.setColumns(20);
        txtEmails.setRows(5);
        jScrollPane1.setViewportView(txtEmails);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cmbPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Costa Rica", "Alemania", "Panama", "España", " " }));
        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        chkEspañol.setText("Español");

        chkIngles.setText("Ingles");

        chkFrances.setText("Frances");

        btnIdiomas.setText("Idioma");
        btnIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomasActionPerformed(evt);
            }
        });

        rbMasculino.setText("Masculino");

        rbFemenino.setText("Femenino");

        rbIndefinido.setText("Indefinido");

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        mnMenu.setText("Opciones");
        mnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMenuActionPerformed(evt);
            }
        });

        mnColorRojo.setText("Color rojo");
        mnColorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnColorRojoActionPerformed(evt);
            }
        });
        mnMenu.add(mnColorRojo);

        mnColorAmariillo.setText("Color amarillo");
        mnColorAmariillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnColorAmariilloActionPerformed(evt);
            }
        });
        mnMenu.add(mnColorAmariillo);

        jMenuBar1.add(mnMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbIndefinido)
                                    .addComponent(rbMasculino)
                                    .addComponent(rbFemenino)
                                    .addComponent(btnValidar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkFrances)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkIngles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkEspañol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIdiomas)))
                        .addGap(0, 38, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar)
                            .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkFrances)
                                    .addComponent(btnIdiomas)
                                    .addComponent(chkIngles)
                                    .addComponent(chkEspañol)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(rbMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFemenino)
                        .addGap(3, 3, 3)
                        .addComponent(rbIndefinido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnValidar)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        int resultado=Integer.valueOf(txtValor1.getText())+Integer.valueOf(txtValor2.getText());
        lblTitulo.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        txtEmails.append(txtEmail.getText()+"\n");
        txtEmail.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,cmbPais.getSelectedItem());
    }//GEN-LAST:event_cmbPaisActionPerformed

    private void btnIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomasActionPerformed
        // TODO add your handling code here:
        
        if(chkEspañol.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Ha selecionado español");
        }
        
        if(chkIngles.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Ha selecionado ingles");
        }
        
        if(chkFrances.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Ha selecionado frances");
        }
    }//GEN-LAST:event_btnIdiomasActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:
        if(rbFemenino.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Ha seleccionado el sexo femenino");
        }
        if(rbMasculino.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Ha seleccionado el sexo masculino");
        }
        if(rbIndefinido.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Ha seleccionado el sexo indefinido");
        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void mnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMenuActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==mnColorRojo)
        {
            getContentPane().setBackground(Color.red);
        }
        if(evt.getSource()==mnColorAmariillo)
        {
            getContentPane().setBackground(Color.yellow);
        }
    }//GEN-LAST:event_mnMenuActionPerformed

    private void mnColorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnColorRojoActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==mnColorRojo)
        {
            getContentPane().setBackground(Color.red);
        }
    }//GEN-LAST:event_mnColorRojoActionPerformed

    private void mnColorAmariilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnColorAmariilloActionPerformed
        // TODO add your handling code here:
         if(evt.getSource()==mnColorAmariillo)
        {
            getContentPane().setBackground(Color.yellow);
        }
    }//GEN-LAST:event_mnColorAmariilloActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnIdiomas;
    private javax.swing.JButton btnValidar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkEspañol;
    private javax.swing.JCheckBox chkFrances;
    private javax.swing.JCheckBox chkIngles;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnColorAmariillo;
    private javax.swing.JMenuItem mnColorRojo;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbIndefinido;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtEmails;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}