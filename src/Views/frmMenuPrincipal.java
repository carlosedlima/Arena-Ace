package Views;

import utils.DecoratedDesktopPane;



public class frmMenuPrincipal extends javax.swing.JFrame {

    private String usuarioLogado = "";
    
    public frmMenuPrincipal() {
        frmLogin login = new frmLogin(null, true);
        login.setVisible(true);
        usuarioLogado = login.getUsuarioAutenticado();
        if (!usuarioLogado.equals("")) {
            initComponents();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new DecoratedDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miConsultar = new javax.swing.JMenuItem();
        miVendas = new javax.swing.JMenuItem();
        miRelatorio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema ArenaAce");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jMenu1.setText("Telas");

        miConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo-produto (1).png"))); // NOI18N
        miConsultar.setText("Produtos");
        miConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(miConsultar);

        miVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venda-rapida.png"))); // NOI18N
        miVendas.setText("Vendas");
        miVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendasActionPerformed(evt);
            }
        });
        jMenu1.add(miVendas);

        miRelatorio.setText("Relátorio");
        miRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioActionPerformed(evt);
            }
        });
        jMenu1.add(miRelatorio);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        miSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobre (1).png"))); // NOI18N
        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        jMenu2.add(miSobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarActionPerformed
         frmConsultar consultas = new frmConsultar();
       if (!consultas.isVisible()) {
           painelPrincipal.add(consultas);
            consultas.setVisible(true);
        } else
            consultas.moveToFront();
    }//GEN-LAST:event_miConsultarActionPerformed

    private void miVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendasActionPerformed
       frmVendas frmvendas = new frmVendas();
       if (!frmvendas.isVisible()) {
           painelPrincipal.add(frmvendas);
            frmvendas.setVisible(true);
        } else
            frmvendas.moveToFront();
    }//GEN-LAST:event_miVendasActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        // TODO add your handling code here:
        frmSobre sobre = new frmSobre();
       if (!sobre.isVisible()) {
           painelPrincipal.add(sobre);
            sobre.setVisible(true);
        } else
            sobre.moveToFront();
    }//GEN-LAST:event_miSobreActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((DecoratedDesktopPane)painelPrincipal).setImage("/img/back.jpg");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void miRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioActionPerformed
         frmMedia media = new frmMedia();
       if (!media.isVisible()) {
           painelPrincipal.add(media);
            media.setVisible(true);
        } else
            media.moveToFront();
    }//GEN-LAST:event_miRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miConsultar;
    private javax.swing.JMenuItem miRelatorio;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miVendas;
    private javax.swing.JDesktopPane painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
