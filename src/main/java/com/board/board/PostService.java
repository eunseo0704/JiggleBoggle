package com.board.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void createPost(CreatePostRequest request) {
        Post post = Post.builder()
                .title(request.title())  // "wait" 대신 "title"로 수정
                .content(request.content())
                .build();

        postRepository.save(post);
    }

    public List<PostResponse> getAllPosts() {
        return postRepository.findAll().stream()
                .map(PostResponse::of)
                .collect(Collectors.toList());
    }

    public PostResponse getPostById(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID가 " + id + "인 게시글이 존재하지 않습니다."));
        return PostResponse.of(post);
    }

    public PostResponse updatePostContent(Long id, UpdatePostRequest request) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID가 " + id + "인 게시글이 존재하지 않습니다."));

        post.setContent(request.content());
        postRepository.save(post);

        return PostResponse.of(post);
    }

    public void deletePost(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID가 " + id + "인 게시글이 존재하지 않습니다."));
        postRepository.delete(post);
    }
}
