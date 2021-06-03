package dao;

import Models.Produtos;
import entity.Produto;
import javax.persistence.EntityManager;

public class ProdutosDAO extends GenericDAO<Produto>  {
   
    EntityManager em = getEntityManager();
    
    public Produto selecionarPorDescricao(String descricao) {
        Produto produto = em.find(Produto.class,descricao );
        return produto;
    }
    
}
