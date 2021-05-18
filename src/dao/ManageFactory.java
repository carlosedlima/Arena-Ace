package dao;

import javax.persistence.*;

public class ManageFactory {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        if (emf == null) {
            try {
                emf = Persistence.createEntityManagerFactory("CodeFirstPU");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emf.createEntityManager();
    }
}
