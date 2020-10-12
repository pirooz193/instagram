package demo;

import domains.user.User;
import service.UserService;
import utill.JPAUtill;

import javax.persistence.EntityManager;

public class Test {

    private static UserService userService = new UserService();

    public static void main(String[] args) {
        EntityManager entityManager = JPAUtill.getEntityManager();
        User user = new User();
        userService.signUp(user);
        entityManager.close();
    }
}
