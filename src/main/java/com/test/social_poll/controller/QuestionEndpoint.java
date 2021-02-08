package com.test.social_poll.controller;

import com.test.social_poll.dto.QuestionDto;
import com.test.social_poll.service.QuestionSerivce;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "question")
public class QuestionEndpoint {

    private final QuestionSerivce questionSerivce;

    public QuestionEndpoint(QuestionSerivce questionSerivce) {
        this.questionSerivce = questionSerivce;
    }

    @GetMapping
    public List<QuestionDto> getAll() {
        return questionSerivce.findAll();
    }

    @PostMapping
    public QuestionDto create(@RequestBody QuestionDto questionDto) {
        return questionSerivce.save(questionDto);
    }

    @PutMapping
    public QuestionDto update(@RequestBody QuestionDto questionDto) {
        return questionSerivce.update(questionDto);
    }

    @DeleteMapping("/{questionId}")
    public ResponseEntity delete(@PathVariable Long questionId) {
        questionSerivce.delete(questionId);
        return ResponseEntity.ok().build();
    }
}

