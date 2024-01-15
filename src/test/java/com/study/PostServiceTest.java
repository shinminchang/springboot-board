package com.study;

import com.study.common.dto.SearchDto;
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
        SearchDto search = new SearchDto();

        int lastId = postMapper.findAll(search).size();
        int nextId = lastId + 1;

        PostRequest params = new PostRequest();
        params.setTitle(nextId + "번 게시글 제목");
        params.setContent(nextId + "번 게시글 내용");
        params.setWriter("shin");
        params.setNoticeYn(false);
        Long id = postService.savePost(params);
        System.out.println("생성된 게시글 ID : " + id);
    }

    @Test
    void saveByForeach() {
        for (int i = 1; i <= 1000; i++) {
            PostRequest params = new PostRequest();
            params.setTitle(i + " 번 게시글");
            params.setContent(i + " 번 내용");
            params.setWriter(i + " 번 사용자");
            params.setNoticeYn(false);
            postService.savePost(params);
        }
    }
}