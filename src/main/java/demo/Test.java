package demo;


import domains.account.Account;
import domains.account.post.Post;
import service.AccountService;
import service.PostService;

import java.util.*;

public class Test {

    static int tst = 0;
    static int f1 = 0;
    static int f2 = 0;

    public static void main(String[] args) {
/*
        AccountService accountService = new AccountService();
        PostService postService = new PostService();
        Account account =accountService.getAccount("p123");
        List<Integer> postsLikes = new ArrayList<>();
        for (int i = 0; i < account.getPosts().size(); i++) {
            postsLikes.add(account.getPosts().get(i).getLikes().size());
        }


        Collections.sort(postsLikes);
        Collections.reverse(postsLikes);*/
//        System.out.println(postService.showUserPosts(account));
       /* System.out.println();
        System.out.println(postsLikes);
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < account.getPosts().size(); i++) {
            for (int j = 0; j < account.getPosts().size(); j++) {
                if (postsLikes.get(i) == account.getPosts().get(j).getLikes().size()) {
                    posts.add(account.getPosts().get(j));
                }
            }
        }*/
//        System.out.println(posts);

        /*for(int i = postService.showUserPostsByLikes(account).size();i>=0;i--){
            System.out.println(postService.showUserPostsByLikes(account).get(i));
        }*/
//        Account account = accountService.getAccount("p123");
//        List<Integer> postsLikes = new ArrayList<>();
//        for (int i = 0; i < account.getPosts().size(); i++) {
//            postsLikes.add(account.getPosts().get(i).getLikes().size());
//        }
//        Collections.sort(postsLikes);
//        System.out.println(postsLikes);
//        System.out.println(account.getPosts().get(0).getLikes().size());


        /*System.out.println(fun(5));
        System.out.println(tst);*/
//======================================
        /*System.out.println(Rec(5, 3));*/
//======================================
        /*test(5);
        System.out.println(tst);
        System.out.println(f1);
        System.out.println(f2);*/

    }


    /*static int fun(int k) {
       tst++;
       if (k <= 0)
           return (k + 1);
       else
           return (fun(k - 1) + fun(k - 2));
   }*/
//===============================================
    /*static int Rec(int p, int q) {
        int R;
        if (q <= 0) return 1;
        R = Rec(p, q / 2);
        R = R * R;
        if (q % 2 == 0)
            return R;
        else
            return R * p;
    }*/
//===============================================
    /*static int test(int n) {
        tst++;
        return (f1(n));
    }

    static int f1(int n) {
        f1++;
        if (n == 1) return 1;
        else return (f2(n - 1));
    }

    static int f2(int n) {
        f2++;
        if (n == 1)
            return 1;
        else
            return (f1(n - 1));
    }*/

}
