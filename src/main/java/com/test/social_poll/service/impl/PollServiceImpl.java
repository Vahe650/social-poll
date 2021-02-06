package com.test.social_poll.service.impl;

import com.test.social_poll.dto.PollDto;
import com.test.social_poll.entity.Poll;
import com.test.social_poll.mapper.ObjectMapper;
import com.test.social_poll.repo.PollRepository;
import com.test.social_poll.service.PollService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PollServiceImpl implements PollService {

    private ObjectMapper mapper = ObjectMapper.INSTANCE;

    private final PollRepository pollRepository;

    public PollServiceImpl(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }


    @Override
    public List<PollDto> findAll() {
        List<Poll> resultList = pollRepository.findAll();
        return resultList.stream().map(u -> mapper.pollEntityToDto(u)).collect(Collectors.toList());
    }

    @Override
    public PollDto save(PollDto pollDto) {
        Poll poll = mapper.pollDtoToEntity(pollDto);
        poll = pollRepository.save(poll);
        return mapper.pollEntityToDto(poll);
    }

    @Override
    public PollDto update(PollDto pollDto) {
        return save(pollDto);
    }

    @Override
    public void delete(Long pollId) {
        pollRepository.deleteById(pollId);
    }

    @Override
    public List<PollDto> findByIdOrTitle(Long id, String title) {
        List<Poll> resultList = pollRepository.findByIdOrTitle(id, title);
        return resultList.stream().map(u -> mapper.pollEntityToDto(u)).collect(Collectors.toList());
    }

    @Override
    public List<PollDto> findByActive() {
        List<Poll> resultList = pollRepository.findByIsActive(true);
        return resultList.stream().map(u -> mapper.pollEntityToDto(u)).collect(Collectors.toList());
    }
}
