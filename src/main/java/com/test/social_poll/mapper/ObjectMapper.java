package com.test.social_poll.mapper;

import com.test.social_poll.dto.PollDto;
import com.test.social_poll.dto.QuestionDto;
import com.test.social_poll.entity.Poll;
import com.test.social_poll.entity.Question;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ObjectMapper {
    ObjectMapper INSTANCE = Mappers.getMapper(ObjectMapper.class);

    Poll pollDtoToEntity(PollDto in);

    PollDto pollEntityToDto(Poll in);

    Question questionDtoToEntity(QuestionDto in);

    QuestionDto questionEntityToDto(Question in);

}

