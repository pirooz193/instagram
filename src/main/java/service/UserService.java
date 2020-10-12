package service;

import domains.account.Account;
import domains.user.User;
import repository.impl.AccountRepositoryImpl;
import repository.impl.PostRepositoryImpl;
import repository.impl.UserRepositoryImpl;

import java.util.Scanner;

public class UserService {
    AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();
//    PostRepositoryImpl postRepository = PostRepositoryImpl.getInstance();
    UserRepositoryImpl userRepository = UserRepositoryImpl.getInstance();


    public Account signUp(User user) {
        Account account = new Account();
        user = setUserInfo(user);
        user.getAccounts().add(account);
        accountRepository.save(account);
        return account;
    }

    public User setUserInfo(User user) {
        System.out.printf("Enter Your Username:");
        user.setUsername(new Scanner(System.in).nextLine());
        System.out.printf("Enter Your Password:");
        user.setPassword(new Scanner(System.in).nextLine());
        userRepository.save(user);
        return user;
    }

    public User userLogIn(String username,String password){
        return userRepository.userLogIn(username,password);
    }




    public void follow(User user,String username) {
        userRepository.getUserByUsername(username);

    }

    public void unFollow(){

    }


}
