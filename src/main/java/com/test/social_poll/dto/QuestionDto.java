package com.test.social_poll.dto;

import java.util.Objects;

public class QuestionDto {
    private Long id;
    private Long number;
    private String question;
    private PollDto poll;

    public QuestionDto() {
    }

    public QuestionDto(Long id, Long number, String question, PollDto poll) {
        this.id = id;
        this.number = number;
        this.question = question;
        this.poll = poll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionDto that = (QuestionDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(number, that.number) &&
                Objects.equals(question, that.question) &&
                Objects.equals(poll, that.poll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, question, poll);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public PollDto getPoll() {
        return poll;
    }

    public void setPoll(PollDto poll) {
        this.poll = poll;
    }

    @Override
    public String toString() {
        return "QuestionDto{" +
                "id=" + id +
                ", number=" + number +
                ", question='" + question + '\'' +
                ", poll=" + poll +
                '}';
    }
}

