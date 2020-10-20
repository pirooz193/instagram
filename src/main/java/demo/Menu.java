package demo;

public class Menu {

    public static void showFirstMenu() {
        System.out.println("1.SIGN UP");
        System.out.println("2.LOG IN");
        System.out.println("3.EXIT");
    }

    public static void showUserGeneralActivityChoices() {
        System.out.println("1.EDIT ACCOUNT INFO");
        System.out.println("2.SEE MY PROFILE");
        System.out.println("3.SEE PEOPLE'S PROFILE");
        System.out.println("4.DELETE ACCOUNT");
        System.out.println("5.EXIT");
    }

    public static void showProfileInfoEditChoices() {
        System.out.println("1.EDIT USERNAME");
        System.out.println("1.EDIT PASSWORD");
    }

    public static void showUserProfileActivityChoices() {
        System.out.println("1.ADD POST");
        System.out.println("2.EDIT A POST");
        System.out.println("3.SHOW FOLLOWERS");
        System.out.println("4.SHOW FOLLOWINGS");
        System.out.println("5.DELETE POST");
        System.out.println("6.EXIT");
    }


    public static void showUserChoices() {
        System.out.println("1.FOLLOW ");
        System.out.println("2.UNFOLLOW ");
        System.out.println("3.SHOW POSTS");
        System.out.println("4 EXIT");
    }

    public static void showUserChoicesToshowPosts() {
        System.out.println("1.SHOW BY LIKE NUMBER(ascending )");
        System.out.println("2.SHOW USUAL");
    }

    public static void showPostChoices() {
        System.out.println("What Do You Want To Do?");
        System.out.println("1.LIKE");
        System.out.println("2.COMMENT");
        System.out.println("3.NOTHING");
    }

    public static void editPostChoices() {
        System.out.println("What Do You Want To Do?");
        System.out.println("1.EDIT CAPTION");
        System.out.println("2.DELETE POST");
    }

    public static void showWrongInfoMenue() {
        System.out.println("Wrong Username Or Password");
        System.out.println("What Do You Want To Do?");
        System.out.println("1.CONTINUE");
        System.out.println("2.GO TO FIRST PAGE");
    }


}
