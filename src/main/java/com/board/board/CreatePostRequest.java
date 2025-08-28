package com.board.board;

import java.util.Objects;

public record CreatePostRequest(
        String title,
        String content
) {
    public CreatePostRequest {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("제목은 비어 있을 수 없습니다.");
        }
        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("내용은 비어 있을 수 없습니다.");
        }

    }
}
