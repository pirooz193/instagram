/*
package repository.impl;

import domains.user.User;
import repository.UserRepository;
import repository.base.BaseRepository;

public class UserRepositoryImpl extends BaseRepository<User, Long> implements UserRepository {
    private static UserRepositoryImpl userRepository;

    public static UserRepositoryImpl getInstance() {
        if (userRepository == null) userRepository = new UserRepositoryImpl();
        return userRepository;
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User userLogIn(String username, String password) {
        User user = null;
        try {
            entityManager.getTransaction().begin();
            user = entityManager
                    .createQuery("from User where username=:username and password=:password", getEntityClass())
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User getUserByUsername(String username) {
        return entityManager
                .createQuery("from User where username=:username", getEntityClass())
                .setParameter("username", username)
                .getSingleResult();
    }
}
*/
