package com.test.social_poll.controller;

import com.test.social_poll.dto.PollDto;
import com.test.social_poll.service.PollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "poll")
public class PollEndpoint {

    private final PollService pollService;

    public PollEndpoint(PollService pollService) {
        this.pollService = pollService;
    }

    @GetMapping
    public List<PollDto> getAll() {
        return pollService.findAll();
    }

    @PostMapping
    public PollDto create(@RequestBody PollDto pollDto) {
        return pollService.save(pollDto);
    }

    @PutMapping
    public PollDto update(@RequestBody PollDto pollDto) {
        return pollService.update(pollDto);
    }

    @DeleteMapping("/{pollId}")
    public ResponseEntity deleteProduct(@PathVariable Long pollId) {
        pollService.delete(pollId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search")
    public List<PollDto> getById(@RequestParam(required = false) Long id,@RequestParam(required = false) String title) {
        return pollService.findByIdOrTitle(id,title);
    }

    @GetMapping("/active-polls")
    public List<PollDto> getActivePolls() {
        return pollService.findByActive();
    }

}
