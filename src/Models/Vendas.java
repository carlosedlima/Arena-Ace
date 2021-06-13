
package Models;

import java.util.List;

public class Vendas {
    
    
    private List<Produtos> produtos;
    private double valor;
    private int quantidade;

    
    
    
    
    public Vendas(List<Produtos> produtos, double valor, int quantidade) {
        this.produtos = produtos;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    
    
    
    
    
    public Vendas() {
    }


    public double getValor() {
        return valor;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
