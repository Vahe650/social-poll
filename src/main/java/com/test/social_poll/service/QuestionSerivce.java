package com.test.social_poll.service;

import com.test.social_poll.dto.QuestionDto;

import java.util.List;

public interface QuestionSerivce {

    List<QuestionDto> findAll();

    QuestionDto save(QuestionDto questionDto);

    QuestionDto update(QuestionDto questionDto);

    void delete(Long questionId);
}

