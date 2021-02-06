package com.test.social_poll.service;

import com.test.social_poll.dto.PollDto;

import java.util.List;

public interface PollService {

    List<PollDto> findAll();

    PollDto save(PollDto pollDto);

    PollDto update(PollDto pollDto);

    void delete(Long pollId);

    List<PollDto> findByIdOrTitle(Long id, String title);

    List<PollDto> findByActive();

}
