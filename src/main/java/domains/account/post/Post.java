package domains.account.post;


import base.BaseEntity;
import domains.account.Account;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post extends BaseEntity<Long> {

    @Column(nullable = false)
    private String Photo = "";
    private String caption;
    private LocalDateTime createDate;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Account> likes = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

/*
    @OneToMany(cascade = CascadeType.ALL)
    private List<Account> taggedPeople = new ArrayList<>();
*/

    @Override
    public String toString() {
        return " \n id :" + id +
                "\n Photo:" + Photo +
                "\n caption:" + caption +
                "\n createDate:" + createDate +
               /* "\n likes:" + likes +*/
                "\n comments:" + comments /*+
                "\n taggedPeople:" + taggedPeople*/
              +"\n likesNum:" +getLikes().size()+ "\n*********************\n";
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /*public List<Account> getTaggedPeople() {
        return taggedPeople;
    }

    public void setTaggedPeople(List<Account> taggedPeople) {
        this.taggedPeople = taggedPeople;
    }*/

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Account> getLikes() {
        return likes;
    }

    public void setLikes(List<Account> likes) {
        this.likes = likes;
    }
}
