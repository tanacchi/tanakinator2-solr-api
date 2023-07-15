package com.tanacchi.tanakinator2.solrapi.controller;

import com.tanacchi.tanakinator2.solrapi.domain.dto.QuestionRequestParam;
import com.tanacchi.tanakinator2.solrapi.domain.dto.QuestionResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class QuestionController {

    @GetMapping("/questions")
    public QuestionResponseDto questions(QuestionRequestParam param) {
        var id = Optional.ofNullable(param).map(QuestionRequestParam::id).orElse(1L);
        return new QuestionResponseDto(id, "ahiahi");
    }
}
