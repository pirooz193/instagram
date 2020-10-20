package demo;

import domains.account.Account;
import domains.account.post.Post;
import service.AccountService;
import service.PostService;


import java.util.Scanner;

public class Demo {


    private static PostService postService = new PostService();
    private static AccountService accountService = new AccountService();
    static int choice;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            String username, password;
            Menu.showFirstMenu();
            choice = scanner.nextInt();
            if (choice == 3) {
                System.out.println("Bye");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.printf("Enter Your Username:");
                    username = new Scanner(System.in).nextLine();
                    System.out.printf("Enter Your Password:");
                    password = new Scanner(System.in).next();

                    signUp(username, password);
                    break;
                case 2:
                    signIn();
                    break;

            }
        }

    }


    public static void signUp(String username, String password) {
        accountService.generateAccount(username, password);
    }


    public static void signIn() {
        choice = 0;
        while (true) {
            if (choice == 5) break;
            Account account1, account2;

            System.out.printf("Enter Your Username:");
            String username = new Scanner(System.in).nextLine();
            System.out.printf("Enter Your Password:");
            String password = new Scanner(System.in).next();

            account1 = accountService.accountLogIn(username, password);
            if (account1 != null) {
                while (true) {
                    Menu.showUserGeneralActivityChoices();
                    choice = scanner.nextInt();
                    if (choice == 4) {
                        accountService.deleteAccount(account1);
                        choice = 5;
                        break;
                    }
                    if (choice == 5) {
                        break;
                    }
                    switch (choice) {
                        case 1:
                            editAccount(account1);
                            break;
                        case 2:
                            System.out.println(account1);
                            userProfileActivity(account1, username);
                            break;
                        case 3:
                            System.out.printf("Enter Username :");
                            username = scanner.next();
                            account2 = accountService.getAccount(username);
                            if (account2 != null) {
                                userActivity(username, account1);
                            } else System.out.println("Username Not found");
                            break;

                    }
                }


            } else {
                Menu.showWrongInfoMenue();
                System.out.printf("Enter Choice: ");
                choice = scanner.nextInt();
                if (choice == 2) break;
                else continue;
            }
        }

    }

    public static Account editAccount(Account account) {
        Menu.showProfileInfoEditChoices();
        switch (choice = scanner.nextInt()) {
            case 1:
                System.out.printf("Enter New Username:");
                String username = new Scanner(System.in).nextLine();
                account = accountService.changeUsername(account, username);
                break;
            case 2:
                System.out.printf("Enter Your New Password:");
                String password = new Scanner(System.in).nextLine();
                account = accountService.changePassword(account, password);
                break;
        }
        return account;
    }


    private static void userProfileActivity(Account account, String username) {
        Menu.showUserProfileActivityChoices();
        Long id;
        Post post;
        switch (choice = scanner.nextInt()) {
            case 1:
                generatePost(account);
                break;
            case 2:
                System.out.println(postService.showUserPosts(account));
                System.out.printf("Enter PostId");
                id = scanner.nextLong();
                post = postService.getPost(id);
                editPost(post);
                break;
            case 3:
                System.out.println(account.getFollowers());
                break;
            case 4:
                System.out.println(account.getFollowings());
                break;
            case 5:
                System.out.println(postService.showUserPosts(account));
                System.out.printf("Enter PostId");
                id = scanner.nextLong();
                post = postService.getPost(id);
                account.getPosts().remove(post);
                break;
        }
    }

    private static void editPost(Post post) {
        Menu.editPostChoices();
        switch (choice = scanner.nextInt()) {
            case 1:
                System.out.printf("Enter Your New Caption:");
                String newCaption = new Scanner(System.in).nextLine();
                postService.editCaption(post, newCaption);
                break;
            case 2:
                postService.deletePost(post);
                break;
        }
    }

    public static void generatePost(Account account) {
        System.out.printf(".Upload Your Photo Or Video:");
        String photo = new Scanner(System.in).nextLine();
        System.out.printf(".Enter Caption :");
        String caption = new Scanner(System.in).nextLine();
        account.getPosts().add(postService.generatePost(photo, caption));
    }

    public static void userActivity(String username, Account account1) {
        Menu.showUserChoices();
        choice = scanner.nextInt();
        Account account2 = accountService.getAccount(username);

        switch (choice) {
            case 1:
                accountService.follow(account1, account2);
                break;
            case 2:
                accountService.unFollow(account1, account2);
                break;
            case 3:
                selectUserChoicesToShowPosts(account2);
                postActivity(account1);
                break;
        }
    }

    public static void selectUserChoicesToShowPosts(Account account) {
        Menu.showUserChoicesToshowPosts();
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(postService.showUserPostsByLikes(account));
                break;
            case 2:
                System.out.println(postService.showUserPosts(account));
                break;
        }
    }


    public static void postActivity(Account account) {
        Menu.showPostChoices();
        Long id;
        Post post;
        switch (choice = scanner.nextInt()) {
            case 1:
                System.out.printf("Enter PostId");
                id = scanner.nextLong();
                post = postService.getPost(id);
                postService.likePost(post, account);
                break;
            case 2:
                System.out.printf("Enter PostId");
                id = scanner.nextLong();
                post = postService.getPost(id);
                System.out.printf("Enter Comment:");
                String comment = new Scanner(System.in).nextLine();
                postService.addComment(post, comment);
                break;
        }
    }
}
