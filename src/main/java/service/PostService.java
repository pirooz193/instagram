package service;

import domains.account.Comment;
import domains.account.Post;
import domains.user.User;
import repository.impl.PostRepositoryImpl;

public class PostService {

    PostRepositoryImpl postRepository = PostRepositoryImpl.getInstance();


    public Post generatePost() {
        Post post = new Post();
        return post;

    }

    public void likePost(Post post, User user) {
        post.getLikes().add(user);
        postRepository.save(post);
    }

    public int numOfLikes(Post post) {
        return post.getLikes().size();
    }

    public int numOfComments(Post post) {
        return post.getComments().size();
    }


    public void addComment(Post post, String text) {
        Comment comment = new Comment();
        comment.setText(text);
        post.getComments().add(comment);
        postRepository.save(post);
    }
}
