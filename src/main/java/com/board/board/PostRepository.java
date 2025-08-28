package com.board.board;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    // 제목으로 게시글 찾기 (추가적인 사용이 필요할 경우)
    Optional<Post> findByTitle(String title);
}
