package com.study.domain.comment;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentRequest {

    private Long id;            // 댓글 번호
    private Long postId;        // 게시글 번호
    private String content;     // 내용
    private String writer;      // 작성자

}
