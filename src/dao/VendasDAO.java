
package dao;


import entity.Venda;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public class VendasDAO extends GenericDAO<Venda> {
    
//    private final EntityManager entityManager;
//    private final Class persistentClass;
//
//    public VendasDAO() {
//        this.entityManager = ManagerFactory.getEntityManager();
//        this.persistentClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//    }
//    
//    public List<Venda> selecionarMedia() throws Exception {
//        CriteriaQuery<Venda> criteria = getEntityManager().getCriteriaBuilder().createQuery(persistentClass);
//        criteria.select(criteria.from(persistentClass));
//        return getEntityManager().createQuery(criteria).getResultList();
//    }
}
