package demo;

import domains.account.Account;


import service.AccountService;
import service.PostService;
import utill.JPAUtill;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {


    private static AccountService accountService = new AccountService();
    private static PostService postService = new PostService();

    public static void main(String[] args) {
        EntityManager entityManager = JPAUtill.getEntityManager();

        Account account = accountService.getAccount("pirooz");
        account.getFollowers().add(accountService.getAccount("ali"));
        entityManager.merge(account);
//       accountService.follow(account,"ali");
        System.out.println(account.getFollowers());
        entityManager.close();
    }

    public static LocalDateTime getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
}
