package repository;

import domains.account.post.Post;

import java.util.List;

public interface PostRrepository {
    Post createPost(Post post);
    List loadComments(Post post);

}
