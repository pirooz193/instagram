package demo;

import domains.user.User;
import service.UserService;

import java.util.Scanner;

public class Demo {

    private static UserService userService = new UserService();
    static int choice;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu.showFirstMenu();
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                signUp();
                break;
            case 2:
                logIn();
                break;
        }
    }


    public static void signUp() {
        User user = new User();
        userService.signUp(user);
    }

    public static void logIn() {
        System.out.printf("Enter Your Username:");
        String username = new Scanner(System.in).nextLine();
        System.out.printf("Enter Your Password:");
        String password = new Scanner(System.in).next();
        User user = userService.userLogIn(username, password);
        if (user != null) {
            Menu.showUserChoices();
            switch (choice = scanner.nextInt()) {
                case 1:
//                    userService.follow();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } else {
            System.out.println("Wrong Username Or Password");
        }
    }
}
