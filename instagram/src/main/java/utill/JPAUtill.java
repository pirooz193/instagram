package utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtill {

    private static EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("my-persistence-unit");

    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        if (entityManager == null) entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
}
