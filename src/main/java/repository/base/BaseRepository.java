package repository.base;

import utill.JPAUtill;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class BaseRepository<Entity, PK> {


    protected abstract Class<Entity> getEntityClass();

    protected EntityManager entityManager = JPAUtill.getEntityManager();


    public Entity save(Entity entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        return entity;
    }

    public Entity load(PK id) {
        entityManager.getTransaction().begin();
        Entity entity = entityManager.find(getEntityClass(), id);
        return entity;
    }


    public List<Entity> loadAll() {
        entityManager.getTransaction().begin();
        List<Entity> resultList = entityManager.createQuery("from " + getEntityClass().getName() + "", getEntityClass()).getResultList();
        entityManager.getTransaction().commit();
        return resultList;
    }

    public List<Entity> loadAllById(PK id) {
        entityManager.getTransaction().begin();
        List<Entity> resultList = entityManager.createQuery("from " + getEntityClass().getName() + " where " + getEntityClass().getName() + ".id =" + id + "", getEntityClass()).getResultList();
        entityManager.getTransaction().commit();
        return resultList;
    }


    public Entity update(Entity entity) {
        entityManager.getTransaction().begin();
        Entity update = entityManager.merge(entity);
        entityManager.getTransaction().commit();
        return update;
    }


    public void delete(Entity entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();

    }

}
