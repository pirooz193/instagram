package repository.impl;

import domains.account.Post;
import repository.PostRrepository;
import repository.base.BaseRepository;

import java.util.List;

public class PostRepositoryImpl extends BaseRepository<Post, Long> implements PostRrepository {
    private static PostRepositoryImpl postRepository;

    public static PostRepositoryImpl getInstance() {
        if (postRepository == null) return postRepository = new PostRepositoryImpl();
        return postRepository;
    }

    @Override
    public Post createPost(Post post) {
        return save(post);
    }

    @Override
    public List loadComments(Post post) {
        return entityManager
                .createQuery(" select comments from Post ",getEntityClass())
                .getResultList();
    }

    @Override
    protected Class<Post> getEntityClass() {
        return Post.class;
    }
}
