package domains.account;


import base.BaseEntity;
import domains.user.User;

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

    @ManyToMany
    private List<User> likes = new ArrayList<>();

    @OneToMany
    private List<Comment> comments = new ArrayList<>();

    @OneToMany
    private List<User> taggedPeople = new ArrayList<>();

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

    public List<User> getTaggedPeople() {
        return taggedPeople;
    }

    public void setTaggedPeople(List<User> taggedPeople) {
        this.taggedPeople = taggedPeople;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }
}
