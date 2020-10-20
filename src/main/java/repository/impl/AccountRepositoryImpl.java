package repository.impl;

import domains.account.Account;
import repository.AccountRepository;
import repository.base.BaseRepository;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl extends BaseRepository<Account, Long> implements AccountRepository<Long> {
    private static AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();

    public static AccountRepositoryImpl getInstance() {
        if (accountRepository == null) return accountRepository = new AccountRepositoryImpl();
        return accountRepository;
    }

    public Account accountLogIn(String username, String password) {
         List<Account> account  = new ArrayList<>();
        try {
            entityManager.getTransaction().begin();
            account = entityManager
                    .createQuery("from Account where username=:username and password=:password", getEntityClass())
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getResultList();
            entityManager.getTransaction().commit();
            return account.get(0);
        } catch (Exception e) {
            return null;
        }

    }

    public Account getAccountByUsername(String username) {
        List<Account> account = new ArrayList<>();
        try {
            entityManager.getTransaction().begin();
            account = entityManager
                    .createQuery("from Account where username=:username", getEntityClass())
                    .setParameter("username", username)
                    .getResultList();
            entityManager.getTransaction().commit();
            return account.get(0);
        }catch(Exception e){
            return null;
        }


    }


    @Override
    public Account generateAccount(Account account) {
        return save(account);
    }


    @Override
    public Account getFollowers(Long id) {
        accountRepository.load(id);
        return null;
    }


    @Override
    public Account getFollwings(Long id) {
        return null;
    }

    @Override
    protected Class<Account> getEntityClass() {
        return Account.class;
    }
}
