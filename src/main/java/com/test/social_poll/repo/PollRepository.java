package com.test.social_poll.repo;

import com.test.social_poll.entity.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PollRepository extends JpaRepository<Poll, Long> {
    List<Poll> findByIdOrTitle(Long id, String title);
    List<Poll> findByIsActive(boolean isActive);
}
