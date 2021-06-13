
package Views;

import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import dao.ProdutosDAO;
import dao.VendasDAO;
import entity.Produto;
import entity.Venda;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import utils.TableModelCreator;
import utils.pdf.Footer;
import utils.pdf.Header;

public class frmMedia extends javax.swing.JInternalFrame {

    private Double media;
    
    
    
    public frmMedia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        txtTotalDeVendas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMediaVendas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Média de Vendas");
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

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVendas);

        btnImprimir.setText("Imprimir relatorio");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        txtTotalDeVendas.setEditable(false);
        txtTotalDeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDeVendasActionPerformed(evt);
            }
        });

        jLabel1.setText("Media de Vendas");

        txtMediaVendas.setEditable(false);
        txtMediaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMediaVendasActionPerformed(evt);
            }
        });

        jLabel2.setText("Total de vendas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotalDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMediaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMediaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String caminho = selecionarPasta();
        if (!caminho.equals("")) {
            if(gerarPDF(caminho, "produto"))            
                abrirPDF(caminho, "produto");
            else
                JOptionPane.showMessageDialog(this, "Erro ao gerar PDF","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       atualizarTabela();
       fazendoMedia();
       atualizaMedia();
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtTotalDeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDeVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDeVendasActionPerformed

    private void txtMediaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMediaVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMediaVendasActionPerformed


    
     private void atualizarTabela() {
        try {
            List<Venda> listaVendas = new VendasDAO().selecionarTodos();
            List<String> Colunas = Arrays.asList("idVenda","valor","quantidade","id_produtos");
            TableModel tableModelVendas = TableModelCreator.createTableModel(Venda.class, listaVendas, Colunas);
            tblVendas.setModel(tableModelVendas);
            
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
            tabela.addCell("Quantidade");
            tabela.addCell("Valor Total");
            tabela.addCell("Produto");
            for (int i = 0; i < tblVendas.getRowCount(); i++) {
                String id = tblVendas.getValueAt(i, 0).toString();
                String quantidade = tblVendas.getValueAt(i, 1).toString();
                String total = tblVendas.getValueAt(i, 2).toString();
                String produtos = tblVendas.getValueAt(i, 3).toString();
                tabela.addCell(id);
                tabela.addCell(quantidade);
                tabela.addCell(total);
                tabela.addCell(produtos);
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
    
    
    private void fazendoMedia(){
        
        try {
            double soma = 0;
            List<Venda> listaVendas = new VendasDAO().selecionarTodos();
            for (Venda v: listaVendas) {
                soma = soma + v.getValor();
            }
            
            media = soma/listaVendas.size();
            

            txtMediaVendas.setText(media.toString());
            txtTotalDeVendas.setText(""+listaVendas.size());
        } catch (Exception ex) {
            Logger.getLogger(frmMedia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void atualizaMedia(){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtMediaVendas;
    private javax.swing.JTextField txtTotalDeVendas;
    // End of variables declaration//GEN-END:variables
}
