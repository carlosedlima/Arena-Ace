
package Views;

import dao.ProdutosDAO;
import entity.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import utils.TableModelCreator;

public class frmConsultar extends javax.swing.JInternalFrame {

   int idSelecionado;
   
   private static frmConsultar myInstance;
   
   public static frmConsultar getInstance(){
        if(myInstance == null)
            myInstance = new frmConsultar();
        return myInstance;
    }
    
    public frmConsultar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultar Produto");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descrição", "Preço Compra", "Preço Venda", "Quantidade"
            }
        ));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(1).setResizable(false);
            tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
            tblProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 430, 198));

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        btnRelatorio.setText("Relatorio");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jPanel1.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (idSelecionado > 0) {
                Produto produto = new ProdutosDAO().selecionarPorCodigo(idSelecionado);
                frmProduto tela = new frmProduto(null, true, produto);
                tela.setVisible(true);
                atualizarTabela();
            }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        frmProduto cadastroProduto = new frmProduto(null, true, null);
        cadastroProduto.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Atenção",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            ProdutosDAO produtoDAO = new ProdutosDAO();
             Produto produto = produtoDAO.selecionarPorCodigo(idSelecionado);
            produtoDAO.excluir(produto);
            atualizarTabela();
            JOptionPane.showMessageDialog(this, "Excluído com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
      
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        JTable tabela = (JTable) evt.getSource();
        int linha = tabela.rowAtPoint(evt.getPoint());

        for (int i = 0; i < tabela.getModel().getColumnCount(); i++) {
            String nomeColuna = tabela.getModel().getColumnName(i);
            if (nomeColuna.trim().equals("Id")) {
                idSelecionado = Integer.parseInt(tabela.getValueAt(linha, i) + "");
                break;
            }
        }
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tblProdutosMouseClicked

     private void atualizarTabela() {
        try {
            List<Produto> listaProdutos = new ProdutosDAO().selecionarTodos();
            TableModel tableModelProdutos = TableModelCreator.createTableModel(Produto.class, listaProdutos, null);
            tblProdutos.setModel(tableModelProdutos);
        } catch (Exception ex) {

        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables
}
