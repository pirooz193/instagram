package service;

import domains.account.Account;
import repository.impl.AccountRepositoryImpl;


public class AccountService {

    AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();


    public Account generateAccount(String username, String password) {
        Account account = new Account();
        try {
            account.setUsername(username);
            account.setPassword(password);
            accountRepository.save(account);
            System.out.println("successfully SignUp");
        } catch (Exception e) {
            e.getMessage();
        }


        return account;
    }

    public Account accountLogIn(String username, String password) {
        return accountRepository.accountLogIn(username, password);
    }

    public void deleteAccount(Account account) {
        accountRepository.delete(account);
    }

    public Account changePassword(Account account, String password) {
        account.setPassword(password);
        accountRepository.update(account);
        return account;
    }

    public Account changeUsername(Account account, String username) {
        account.setUsername(username);
        accountRepository.update(account);
        return account;
    }


    public void follow(Account account1, Account account2) {
        try {
            account1.getFollowings().add(account2);
            account2.getFollowers().add(account1);
            accountRepository.update(account1);
            accountRepository.update(account2);
            System.out.println("successfully followed!");
        } catch (Exception e) {
            System.out.println("...Failed...");
        }

    }

    public void unFollow(Account account1, Account account2) {
        account2.getFollowers().remove(account1);
        account1.getFollowings().remove(account2);
        accountRepository.update(account1);
        accountRepository.update(account2);
        System.out.println("successfully UnFollowed!");
    }


    public Account getAccount(String username) {
        return accountRepository.getAccountByUsername(username);
    }
}
