package service;

import domains.account.Account;
import repository.impl.AccountRepositoryImpl;


public class AccountService {

    AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();


    public Account generateAccount(String username, String password) {
        Account account = new Account();
        try{
            account.setUsername(username);
            account.setPassword(password);
            accountRepository.save(account);
            System.out.println("successfully SignUp");
        }catch(Exception e){
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


    public void follow(Account account, String username) {
        account.getFollowers().add(getAccount(username));
//        getAccount(username).getFollowings().add(account);
        accountRepository.update(account);
        accountRepository.update(getAccount(username));
        System.out.printf("successfully followed!");
    }

    public void unFollow(Account account, String username) {
        account.getFollowers().remove(getAccount(username));
        getAccount(username).getFollowings().remove(account);
        accountRepository.update(account);
        accountRepository.update(getAccount(username));
        System.out.printf("successfully UnFollowed!");
    }


    public Account getAccount(String username) {
        return accountRepository.getAccountByUsername(username);
    }
}
