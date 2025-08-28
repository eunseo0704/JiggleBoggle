package com.board.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;


    @PostMapping
    public void createPost(@RequestBody CreatePostRequest request) {
        postService.createPost(request);
    }


    @GetMapping
    public List<PostResponse> getAllPosts() {
        return postService.getAllPosts();
    }


    @GetMapping("/{id}")
    public PostResponse findPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }


    @PatchMapping("/{id}")
    public PostResponse updatePostContent(@PathVariable Long id, @RequestBody UpdatePostRequest request) {
        return postService.updatePostContent(id, request);
    }


    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
