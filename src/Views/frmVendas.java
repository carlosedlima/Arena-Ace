
package Views;

import dao.ProdutosDAO;
import dao.VendasDAO;
import entity.Produto;
import entity.Venda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.persistence.Id;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.eclipse.persistence.tools.schemaframework.TableCreator;
import utils.TableModelCreator;

public class frmVendas extends javax.swing.JInternalFrame {
    private Double total = 0.0;
    private int quantidadeItens = 0;
    private int quantidade = 0;
    private int id = 1;
    int idSelecionado;
    
    List<Produto> listaCProdutos = new ArrayList<>();
    public frmVendas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        btnFinalizarVenda = new javax.swing.JButton();
        btnRemoveItem = new javax.swing.JButton();
        btnAddProd = new javax.swing.JButton();
        cmbProdutos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaCompras = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Venda");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Produto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 50, 20));

        jLabel3.setText("Quantidade");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel2.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, -1));
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 70, -1));

        jLabel4.setText("Desconto");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Preço Total:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));
        jPanel2.add(txtDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 180, -1));

        btnFinalizarVenda.setText("Finalizar Venda");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });
        jPanel2.add(btnFinalizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        btnRemoveItem.setText("Remover Item");
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemoveItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 240, -1));

        btnAddProd.setText("Adicionar Produto");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 180, -1));

        cmbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdutosActionPerformed(evt);
            }
        });
        jPanel2.add(cmbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 180, -1));

        tblListaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblListaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaComprasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblListaCompras);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 240, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        atualizarComboCategoria();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdutosActionPerformed

    }//GEN-LAST:event_cmbProdutosActionPerformed

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        if(validarEntradas() == true){
            Produto produtoVenda = (Produto) this.cmbProdutos.getSelectedItem();
           listaCProdutos.add(produtoVenda);
           double preco = produtoVenda.getValorVenda();
           quantidade = Integer.parseInt(txtQuantidade.getText());
           quantidadeItens = quantidadeItens + Integer.parseInt(txtQuantidade.getText());
           total = total +(quantidade*preco);
           getProdutosCompra();
           atualizaVariaveis();
        }
    }//GEN-LAST:event_btnAddProdActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed

        Venda venda = new Venda();
        id ++;
        venda.setIdVenda(id);
        venda.setProdutos(listaCProdutos);
        venda.setQuantidade(quantidadeItens);
        venda.setValor(total);
        new VendasDAO().inserir(venda);
        
        total = 0.0;
        quantidadeItens = 0;
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente remover o item?", "Atenção",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            tblListaCompras.remove(idSelecionado);
            getProdutosCompra();
            JOptionPane.showMessageDialog(this, "Excluído com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void tblListaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaComprasMouseClicked
        JTable tabela = (JTable) evt.getSource();
        int linha = tabela.rowAtPoint(evt.getPoint());

        for (int i = 0; i < tabela.getModel().getColumnCount(); i++) {
            String nomeColuna = tabela.getModel().getColumnName(i);
            if (nomeColuna.trim().equals("Id")) {
                idSelecionado = Integer.parseInt(tabela.getValueAt(linha, i) + "");
                break;
            }
        }
    }//GEN-LAST:event_tblListaComprasMouseClicked

   private boolean validarEntradas(){
//        cmbProdutos.getSelectedIndex()== 0
     if(txtQuantidade.getText().equals("") || cmbProdutos.getSelectedItem()==""){
         JOptionPane.showMessageDialog(this, "Complete todos os campos necessarios para a venda,");
         txtQuantidade.requestFocus();
         return false;
     }
     return true;
    }
    
    
    
     private void atualizarComboCategoria() {
        try {
            List<Produto> listaProdutos = new ProdutosDAO().selecionarTodos();
            cmbProdutos.setModel(new DefaultComboBoxModel<Produto>(listaProdutos.toArray(new Produto[listaProdutos.size()])));
        } catch (Exception ex) {

        }
    }
     
     
     
    private void getProdutosCompra(){
        
          try {
            
            List<String> Colunas = Arrays.asList("id","produto","valorVenda");
            TableModel tableModelCProdutos = TableModelCreator.createTableModel(Produto.class, listaCProdutos, Colunas);
            tblListaCompras.setModel(tableModelCProdutos);
            
        } catch (Exception ex) {

        }
        
    
    } 
    
    private void atualizaVariaveis(){
        txtTotal.setText(total.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JComboBox<Produto> cmbProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblListaCompras;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
