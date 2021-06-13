
package Views;

import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import dao.ProdutosDAO;
import entity.Produto;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import utils.TableModelCreator;
import utils.pdf.Footer;
import utils.pdf.Header;

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
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

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

        btnRelatorio.setText("Imprimir");
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
        atualizarTabela();
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
        String caminho = selecionarPasta();
        if (!caminho.equals("")) {
            if(gerarPDF(caminho, "produto"))            
                abrirPDF(caminho, "produto");
            else
                JOptionPane.showMessageDialog(this, "Erro ao gerar PDF","Erro",JOptionPane.ERROR_MESSAGE);
        }
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

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        atualizarTabela();
    }//GEN-LAST:event_formInternalFrameActivated

     private void atualizarTabela() {
        try {
            List<Produto> listaProdutos = new ProdutosDAO().selecionarTodos();
            List<String> Colunas = Arrays.asList("id","produto","quantidade","valorCusto","valorVenda");
            TableModel tableModelProdutos = TableModelCreator.createTableModel(Produto.class, listaProdutos, Colunas);
            tblProdutos.setModel(tableModelProdutos);
            
        } catch (Exception ex) {

        }
    }
    
     
    //Funções pra utilizar o PDF
    private void abrirPDF(String caminho, String nomeArquivoPDF) {
        try {
            File arquivo = new File(caminho + "/" + nomeArquivoPDF + ".pdf");
            Desktop.getDesktop().open(arquivo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Arquivo não encontrado.","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean gerarPDF(String caminho, String nomeArquivoPDF) {
        try {
            PdfWriter writer = new PdfWriter(caminho + "/" + nomeArquivoPDF + ".pdf");
            PdfDocument pdf = new PdfDocument(writer);
            pdf.setTagged();
            pdf.setDefaultPageSize(PageSize.A4);

            Document documento = new Document(pdf);
            documento.setMargins(93, 36, 55, 36);
            
            Header header = new Header("Listagem de Produtos");
            Footer footer = new Footer();
            
            pdf.addEventHandler(PdfDocumentEvent.START_PAGE, header);
            pdf.addEventHandler(PdfDocumentEvent.END_PAGE, footer);

            //TITULO
//            Paragraph titulo = new Paragraph("Listagem dos Produtos");
//            titulo.setBold();
//            titulo.setFontSize(15);
//            titulo.setTextAlignment(TextAlignment.CENTER);
            
            //tabela de produto
            Table tabela = new Table(5);
            tabela.setWidth(400);
            tabela.setHorizontalAlignment(HorizontalAlignment.CENTER);
            tabela.addCell("Id");
            tabela.addCell("Produto");
            tabela.addCell("Quantidade");
            tabela.addCell("Valor Custo");
            tabela.addCell("Valor Venda");
            for (int i = 0; i < tblProdutos.getRowCount(); i++) {
                String id = tblProdutos.getValueAt(i, 0).toString();
                String produto = tblProdutos.getValueAt(i, 1).toString();
                String quantidade = tblProdutos.getValueAt(i, 2).toString();
                String valorCusto = tblProdutos.getValueAt(i, 3).toString();
                String valorVenda = tblProdutos.getValueAt(i, 4).toString();
                tabela.addCell(id);
                tabela.addCell(produto);
                tabela.addCell(quantidade);
                tabela.addCell(valorCusto);
                tabela.addCell(valorVenda);
            }
            //documento.add(titulo);
            documento.add(tabela);
            footer.writeTotal(pdf);
            documento.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmConsultar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    private String selecionarPasta() {
        try {
            JFileChooser arquivo = new JFileChooser();
            arquivo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            arquivo.showSaveDialog(this);
            return arquivo.getSelectedFile().getPath();
        } catch (Exception ex) {
            return "";
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
