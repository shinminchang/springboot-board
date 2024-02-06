package com.study.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Getter
@AllArgsConstructor
public class MessageDto {
    private String message;             // alert 문구
    private String redirectUri;         // 이동 URL
    private RequestMethod method;       // request method
    private Map<String, Object> data;   // 전달할 데이터
}
