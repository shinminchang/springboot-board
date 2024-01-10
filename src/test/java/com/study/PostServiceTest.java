package com.study;

import com.study.domain.post.PostRequest;
import com.study.domain.post.PostService;
import com.study.domain.post.PostMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostServiceTest {
    @Autowired
    PostMapper postMapper;

    @Autowired
    PostService postService;

    @Test
    void save() {
        int lastId = postMapper.findAll().size();
        int nextId = lastId + 1;

        PostRequest params = new PostRequest();
        params.setTitle(nextId + "번 게시글 제목");
        params.setContent(nextId + "번 게시글 내용");
        params.setWriter("shin");
        params.setNoticeYn(false);
        Long id = postService.savePost(params);
        System.out.println("생성된 게시글 ID : " + id);
    }

}