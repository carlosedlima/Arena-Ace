
package Models;

public class Produtos {
    // ---> OBJETO PRODUTO <---
    private String codigo;
    private String produto;
    private double valorCusto;
    private double valorVenda;
    private int quantidade;

    public Produtos(String codigo, String produto, double valorCusto, double valorVenda, int quantidade) {
        this.codigo = codigo;
        this.produto = produto;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.quantidade = quantidade;
    }

    public Produtos() {
    }

    
    
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
