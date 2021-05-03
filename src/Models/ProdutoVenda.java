
package Models;

public class ProdutoVenda {
    private int quantidade;
    private double valorUnitario;
    private double desconto;

    
    
    
    public ProdutoVenda() {
    }

    public ProdutoVenda(int quantidade, double valorUnitario, double desconto) {
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.desconto = desconto;
    }

    
    
    
    
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    
    
}
