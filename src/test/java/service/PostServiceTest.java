package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServiceTest {

    PostService postService = new PostService();

    @Test
    void generatePost() {
        assertNotNull(postService.generatePost("post", "caption"));
    }

    @Test
    void deletePost() {
        postService.deletePost(postService.getPost(21L));
    }


    @Test
    void getPost() {
        assertNull(postService.getPost(21L));
    }


}