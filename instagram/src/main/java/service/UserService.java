/*
package service;

import domains.account.Account;
import domains.user.User;
import repository.impl.AccountRepositoryImpl;
import repository.impl.PostRepositoryImpl;
import repository.impl.UserRepositoryImpl;

import java.sql.Date;
import java.util.Scanner;

public class UserService {
    AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();
    //    PostRepositoryImpl postRepository = PostRepositoryImpl.getInstance();
    UserRepositoryImpl userRepository = UserRepositoryImpl.getInstance();


    public User setUserInfo(User user) {
        System.out.printf("Enter Your Name :");
        user.setName(new Scanner(System.in).nextLine());
        System.out.printf("Enter Your LastName :");
        user.setLastName(new Scanner(System.in).nextLine());
        System.out.printf("Enter Your Age:");
        user.setAge(new Scanner(System.in).nextInt());
        System.out.printf("Enter Your BirthDate:");
        user.setBirthDate(Date.valueOf(new Scanner(System.in).next()));
        userRepository.save(user);
        return user;
    }


    public Account userLogIn(String username, String password) {
        return accountRepository.accountLogIn(username, password);
    }


    */
/*public Account showUserProfile(Account account){
        return account
    }*//*


    public void follow(Account account, String username) {
        account.getFollowers().add(accountRepository.getAccountByUsername(username));
    }

    public void unFollow(Account account,String username) {
        account.getFollowers().remove(accountRepository.getAccountByUsername(username));
    }


}
*/
