package com.board.board;

public record PostResponse(
        Long id,
        String title,
        String content,
        String author
) {
    public static PostResponse of(Post post) {
        return new PostResponse(
                post.getId(),
                post.getTitle(),
                post.getContent(),
                post.getAuthor()
        );
    }
}
