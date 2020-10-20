package repository.impl;

import domains.account.post.Post;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {

    static PostRepositoryImpl postRepository = PostRepositoryImpl.getInstance();

    @Test
    void getPost() {
        assertNotNull(postRepository.getPost(10L));
    }

    @Test
    void createPost() {
        Post post = new Post();
        post.setPhoto("pool");
        assertNotNull(postRepository.createPost(post));
    }


}