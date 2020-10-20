package repository.impl;

import domains.account.post.Comment;
import repository.CommentRepository;
import repository.base.BaseRepository;

public class CommentRepositoryImpl extends BaseRepository<Comment , Long> implements CommentRepository {

    static CommentRepositoryImpl commentRepository;

    public static CommentRepositoryImpl getInstance() {
        if (commentRepository == null) return commentRepository = new CommentRepositoryImpl();
        return commentRepository;
    }

    public void deleteComment(Comment comment){
        delete(comment);
    }

    @Override
    protected Class<Comment> getEntityClass() {
        return Comment.class;
    }
}
