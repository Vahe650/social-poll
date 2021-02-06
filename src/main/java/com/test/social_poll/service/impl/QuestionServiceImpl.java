package com.test.social_poll.service.impl;

import com.test.social_poll.dto.QuestionDto;
import com.test.social_poll.entity.Question;
import com.test.social_poll.mapper.ObjectMapper;
import com.test.social_poll.repo.QuestionRepository;
import com.test.social_poll.service.QuestionSerivce;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionSerivce {

    private ObjectMapper mapper = ObjectMapper.INSTANCE;

    private final QuestionRepository questionRepository;


    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public List<QuestionDto> findAll() {
        List<Question> resultList = questionRepository.findAll();
        return resultList.stream().map(u -> mapper.questionEntityToDto(u)).collect(Collectors.toList());
    }

    @Override
    public QuestionDto save(QuestionDto questionDto) {
        Question question = mapper.questionDtoToEntity(questionDto);
        question = questionRepository.save(question);
        return mapper.questionEntityToDto(question);
    }

    @Override
    public QuestionDto update(QuestionDto questionDto) {
        return save(questionDto);
    }

    @Override
    public void delete(Long questionId) {
        questionRepository.deleteById(questionId);
    }

}
