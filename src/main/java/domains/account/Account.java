package domains.account;

import base.BaseEntity;
import domains.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account extends BaseEntity<Long> {

    /*@Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;*/


    @OneToMany
    private List<User> followers = new ArrayList<>();

    @OneToMany
    private List<User> followings = new ArrayList<>();


    @OneToMany
    private List<Post> posts = new ArrayList<>();

    @Override
    public String toString() {
        return "followers:" + followers +
                "\n followings:" + followings +
                "\n posts :" + posts;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowings() {
        return followings;
    }

    public void setFollowings(List<User> followings) {
        this.followings = followings;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
