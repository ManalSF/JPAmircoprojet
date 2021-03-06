package main.java;

import javax.persistence.*;

public class HibernateUtil {

    private static EntityManagerFactory factory;

    public static EntityManager getEntityManager () {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("tables");
        }
        EntityManager entityManager = factory.createEntityManager();
        return entityManager;
    }

    public static EntityManager beginTransaction() {
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        return entityManager;
    }

    public static void commitTransaction(EntityManager em){
        em.getTransaction().commit();
    }

}

